/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YumiExpress.utility;

import java.util.Base64;

/**
 *
 * @author dell
 */
public class PasswordEncrypation {
    public static String getEncryptedPassword(String pwd)
    {
        Base64.Encoder en=Base64.getEncoder();
        String encrytedPwd=en.encodeToString(pwd.getBytes());
        return encrytedPwd;
    }
    public static String getDecryptedPassword(String pwd)
    {
        Base64.Decoder dec=Base64.getDecoder();
        byte[] arr=dec.decode(pwd.getBytes());
        String decryptedPwd=new String(arr);
        return decryptedPwd;
    }
    
    public static void main(String args[ ])
    {
        System.out.println(PasswordEncrypation.getDecryptedPassword("MTIzNDU="));
    }
}
