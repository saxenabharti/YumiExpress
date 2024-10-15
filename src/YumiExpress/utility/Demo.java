/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YumiExpress.utility;

import YumiExpress.pojo.StaffPojo;
import java.util.HashMap;
import javax.mail.MessagingException;

/**
 *
 * @author dell
 */
 
//   
    
public class Demo{  
 public static void main(String args[]){  
       StaffPojo st=new StaffPojo();
       st.setEmailId("sachinkushwaha3727@gmail.com");
       st.setCompanyId("COM-1");
       st.setStaffName("Sachin kushwaha");
       st.setPassword("1234");
       try{
       Mailer.sendMail( new HashMap<String,String>() , st);
       }catch(MessagingException ex){
           ex.printStackTrace();
       }
       }  
}  
    

