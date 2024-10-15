package YumiExpress.Dao;

import YumiExpress.dbutil.DBConnection;
import YumiExpress.pojo.CompanyPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class CompanyDAO {
     public static String getNextCompanyId()throws SQLException{
     Connection conn=DBConnection.getConnection();     
     Statement st=conn.createStatement();
     ResultSet rs=st.executeQuery("Select max(company_id) from companies");       
     rs.next();
     String id=rs.getString(1);
     String comId="";
     if(id!=null){  
         id=id.substring(4);
       comId="COM-"+(Integer.parseInt(id)+1);
     }else{
           comId="COM-101"; 
     }
       return comId;       
  }
     public static boolean SellerRegistration(CompanyPojo cp)throws SQLException
     {
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("insert into companies values(?,?,?,?,?,?,?)");
         ps.setString(1, CompanyDAO.getNextCompanyId());
         ps.setString(2,cp.getCompanyName());
         ps.setString(3,cp.getOwnerName());
         ps.setString(4,cp.getPassword());
         ps.setString(5,cp.getStatus());
         ps.setString(6,cp.getEmailID());
         ps.setString(7,cp.getSecurityKey());
         
         return ps.executeUpdate()==1;
     }
     public static CompanyPojo validateSeller(String companyName, String password)throws SQLException 
     {
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("Select * from companies where company_name=? and password=? and status='ACTIVE'");
         ps.setString(1, companyName);
         ps.setString(2, password);
         ResultSet rs=ps.executeQuery();
         CompanyPojo cp=null;
         if(rs.next())
         {
             cp=new CompanyPojo();
             cp.setCompanyId(rs.getString("COMPANY_ID"));
             cp.setCompanyName(rs.getString("COMPANY_NAME"));
             cp.setOwnerName(rs.getString("OWNER_NAME")); 
         }
         return cp;
     }
   public static Map<String,String> getEmailCredentailsByCompanyId(String companyId)throws SQLException{
       Connection conn=DBConnection.getConnection();
       System.out.println("Inside  company doa"+companyId);
       PreparedStatement ps=conn.prepareStatement("select email_id,security_key from companies where company_id=? and status='ACTIVE'");
       ps.setString(1, companyId);
       Map<String,String> companyCredentials=new HashMap<>();
       ResultSet rs=ps.executeQuery();
       if(rs.next()){
           String emailId=rs.getString(1);
           String secKey=rs.getString(2);
           companyCredentials.put("emailId", emailId);
           companyCredentials.put("securityKey",secKey);
           System.out.println(companyId+"  "+emailId+" Inside company doa "+secKey);
       }
       return companyCredentials;
   }
   public static Map<String,String> getAllCompanyIdAndName()throws SQLException { 
       Connection conn=DBConnection.getConnection(); 
       PreparedStatement ps=conn.prepareStatement("select company_id,company_name from companies where status='ACTIVE' and company_id in (select company_id from products)"); 
       ResultSet rs=ps.executeQuery(); 
       Map<String,String> compList=new HashMap<>(); 
       while(rs.next()){ 
           String c_id=rs.getString(1); 
           String c_name=rs.getString(2); 
           compList.put(c_name,c_id); 
            
       } 
       return compList; 
   }
    
}
