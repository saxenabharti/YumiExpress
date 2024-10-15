/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YumiExpress.utility;

/**
 *
 * @author dell
 */
public class OwnerProfile {

    public static String getCompanyName() {
        return CompanyName;
    }

    public static void setCompanyName(String CompanyName) {
        OwnerProfile.CompanyName = CompanyName;
    }

    public static String getOwnerName() {
        return OwnerName;
    }

    public static void setOwnerName(String OwnerName) {
        OwnerProfile.OwnerName = OwnerName;
    }

    public static String getCompanyID() {
        return CompanyID;
    }

    public static void setCompanyID(String CompanyID) {
        OwnerProfile.CompanyID = CompanyID;
    }
    private static String CompanyName;
    private static String OwnerName;
    private static String CompanyID;
}
