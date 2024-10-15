/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YumiExpress.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class DBConnection {
    private static Connection conn=null;

    static
  {
      try
      {
           Class.forName("oracle.jdbc.OracleDriver");
          conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","YUMIEXPRESS" ,"java");
           JOptionPane.showMessageDialog(null,"Connection Opened Successfully.", "Success",JOptionPane.INFORMATION_MESSAGE);
      }
      catch(ClassNotFoundException ex)
      {
          JOptionPane.showMessageDialog(null,"Error In Loading the Driver.", "Driver Error!",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
          System.exit(1);
      }
       catch(SQLException ex)
      {
         
          JOptionPane.showMessageDialog(null,"Error In Data Base .", "DB Error!",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
          System.exit(1);
      }
      
  }

    public static Connection getConnection()
    {
        return conn;
    }

    public static void closeConnection()
    {
        if (conn!=null)
        {

            try
            {
                conn.close();
                System.out.println("conn close successfully");
            }
            catch (SQLException e)
            {
                e.printStackTrace();

            }
        }
    }
    
}
