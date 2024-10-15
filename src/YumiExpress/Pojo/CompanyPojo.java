package YumiExpress.pojo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class CompanyPojo {

    public CompanyPojo(String companyId, String companyName, String ownerName, String password, String status, String emailID, String securityKey) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.ownerName = ownerName;
        this.password = password;
        this.status = status;
        this.emailID = emailID;
        this.securityKey = securityKey;
    }
    public CompanyPojo()
    {
        
    }
    private String companyId;
    private String companyName;
    private String ownerName;
    private String password;
    private String status;
    private String emailID;
    private String securityKey;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }
    
}
