/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YumiExpress.utility;

import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author dell
 */
public class Validator {
    public static boolean isValidEmail(String emialId)
    {
        EmailValidator validator=EmailValidator.getInstance();
        return validator.isValid(emialId);
    }
    public static boolean isValidMobile(String mobileNo){
        if(mobileNo.length()!=10)
            return false;
        char[] mobArr=mobileNo.toCharArray();
        for(char ch:mobArr){
            if(Character.isDigit(ch)==false)
                return false;
            
        }
        return true;
        
    }
}
