package YumiExpress.Dao;

import YumiExpress.dbutil.DBConnection;
import YumiExpress.pojo.StaffPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import oracle.net.aso.c;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class StaffDAO {
    public static String getNewId()throws SQLException 
    {
        Connection conn=DBConnection.getConnection();     
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("Select max(staff_id) from staff");
       rs.next();
       String id=rs.getString(1);   
       String prodId="";
       if(id!=null){    
           id=id.substring(4);
           prodId="STF-"+(Integer.parseInt(id)+1); 
       }else{
           prodId="STF-101";     
       }
       return prodId;    
    }
    public static String addStaff(StaffPojo p)throws SQLException 
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into staff values(?,?,?,?,?)");
        p.setStaffId(getNewId());
        ps.setString(1,p.getStaffId());
        ps.setString(2, p.getCompanyId());
        ps.setString(3, p.getEmailId());
        ps.setString(4,p.getPassword());
        ps.setString(5, p.getStaffName());
        return ps.executeUpdate()==1?p.getStaffId():null;
    }
     public static List<String> getAllStaffIdByCompanyId(String companyId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select staff_id from staff where company_id=?");
        ps.setString(1, companyId);
        List<String>staffList=new ArrayList<>();
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            staffList.add(rs.getString(1));
        }
        return staffList;
        
    }
    public static StaffPojo getStaffDetailsbyId(String staffId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from staff where staff_id=?");
        ps.setString(1, staffId);
        StaffPojo staff=new StaffPojo();
        ResultSet rs=ps.executeQuery();
        rs.next();
        staff.setStaffName(rs.getString(5));
        staff.setEmailId(rs.getString(3));
        return staff;
        
    }
    public static String getRandomStaffIdFromCompany(String compId)throws SQLException{
        List<String>staffList=StaffDAO.getAllStaffIdByCompanyId(compId);
        Random rand=new Random();
        int index=rand.nextInt(staffList.size());
        return staffList.get(index);
    }
    
    public static StaffPojo validate(String email, String password)throws SQLException 
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from staff where email_id=? and password=?");
        ps.setString(1, email);
        ps.setString(2, password);
        StaffPojo staff=null;
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            staff=new StaffPojo();
        staff.setStaffName(rs.getString("staff_name"));
        staff.setEmailId(rs.getString("email_id"));
        staff.setStaffId(rs.getString("staff_id"));
        staff.setCompanyId(rs.getString("company_id"));
        }
        return staff;
    }
   
}
