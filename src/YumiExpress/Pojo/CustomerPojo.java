/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YumiExpress.pojo;

/**
 *
 * @author dell
 */
public class CustomerPojo {

    @Override
    public String toString() {
        return "CustomerPojo{" + "customerId=" + customerId + ", customerName=" + customerName + ", customerEmailId=" + EmailId + ", password=" + password + ", mobileNo=" + mobileNo + ", address=" + address + '}';
    }
     
  private String customerId;
  private String customerName;
  private String EmailId;
  private String password;
  private String mobileNo;
  private String address;
     public CustomerPojo()
     {
         
     }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String  EmailId) {
        this.EmailId =  EmailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public CustomerPojo(String customerId, String customerName, String EmailId, String password, String mobileNo, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.EmailId = EmailId;
        this.password = password;
        this.mobileNo = mobileNo;
        this.address = address;
    }
  
}
