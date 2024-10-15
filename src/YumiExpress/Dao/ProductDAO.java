/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YumiExpress.Dao;

import YumiExpress.dbutil.DBConnection;
import YumiExpress.pojo.OrderPojo;
import YumiExpress.pojo.PlaceOrderPojo;
import YumiExpress.pojo.ProductPojo;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author dell
 */
public class ProductDAO {

    public static String getNewId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select max(product_id) from products");
        rs.next();
        String id = rs.getString(1);
        String prodId = "";
        if (id != null) {
            id = id.substring(4);
            prodId = "PRD-" + (Integer.parseInt(id) + 1);
        } else {
            prodId = "PRD-101";
        }
        return prodId;
    }

    public static boolean addProduct(ProductPojo product) throws SQLException, IOException {
        //Convert Image To BufferedImage
        BufferedImage bufferedImage
                = new BufferedImage(product.getProductImage().getWidth(null), product.getProductImage().getHeight(null),
                        BufferedImage.TYPE_INT_RGB);

// Draw the BufferedImage  
        Graphics gr = bufferedImage.getGraphics();
        gr.drawImage(product.getProductImage(), 0, 0, null);

//Convert BufferedImage into byte []
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, product.getProductImageType(), baos);
        byte[] imageData = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(imageData);

        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into products values(?,?,?,?,?)");
        ps.setString(1, getNewId());
        ps.setString(2, product.getCompanyId());
        ps.setString(3, product.getProductName());
        ps.setDouble(4, product.getProductPrice());
        ps.setBinaryStream(5, bais, imageData.length);
        int x = ps.executeUpdate();
        return x > 0;
    }

    /*
1. We first convert the Image object we received from API into BufferedImage object because BufferedImage uses
ram buffers and so is much fast compared to raw Image object (line no. 46 to 48).
        
2. We then draw the Image object inside BufferedImage object using the class Graphics by calling Graphic's method
   drawImage() (line no. 51 - 52)
        
3. Since we can not write BufferedImage in the DB so we convert it into a byte []. This is done with the help of
   two classes which ByteArrayOutputStream and ImageIO. (line no. 55 - 56)
   Since we get a ByteArrayOutputStream object, the next task is to convert it into byte [] and this is done using
   the method toByteArray() of ByteArrayOutputStream class. (line no. 57).
        
4. We then convert this byte [] into object of ByteArrayInputStream class becuase the method setBinaryStream() of
   PreparedStatement object does not directly accept a byte []. Rather it wants an InputStream object. Since 
   ByteArrayInputStream is child class of InputStream we can pass its object as argument to setBinaryStream() method.
   (line no. 58 and 66).   

     */

    public static Map<String, ProductPojo> getProductDetailsByCompanyId(String companyId) throws SQLException, IOException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from products where company_id=?");
        ps.setString(1, companyId);
        ResultSet rs = ps.executeQuery();
        Map<String, ProductPojo> productDetails = new HashMap<>();
        while (rs.next()) {
            ProductPojo product = new ProductPojo();
            product.setProductName(rs.getString(3));
            product.setProductPrice(rs.getDouble(4));
            InputStream inputStream = rs.getBinaryStream("product_image");

            // Convert InputStream to BufferedImage
            BufferedImage bufferedImage = ImageIO.read(inputStream);

            // Convert BufferedImage to Image
            Image image = bufferedImage;
            product.setProductImage(image);
            productDetails.put(product.getProductName(), product);

        }
        return productDetails;
    }

    public static List<ProductPojo> getAllProductsByCompanyId(String companyId) throws SQLException, IOException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps;
        if (companyId.equalsIgnoreCase("ALL")) {
            ps = conn.prepareStatement("select * from products where company_id in(select company_id from companies where status='ACTIVE')");
        } else {

            ps = conn.prepareStatement("select * from products where company_id=?");
            ps.setString(1, companyId);
        }
        ResultSet rs = ps.executeQuery();
        List<ProductPojo> productDetails = new ArrayList<>();
        while (rs.next()) {
            ProductPojo product = new ProductPojo();
            product.setProductId(rs.getString("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductPrice(rs.getDouble("product_price"));
            product.setCompanyId(rs.getString("company_id"));
            InputStream inputStream = rs.getBinaryStream("product_image");

            // Convert InputStream to BufferedImage 
            BufferedImage bufferedImage = ImageIO.read(inputStream);

            // Convert BufferedImage to Image 
            Image image = bufferedImage;
            product.setProductImage(image);
            productDetails.add(product);

        }
        return productDetails;
    }

    
    
    public static OrderPojo getOrderDetailsByOrderId(String orderId) throws SQLException {        Connection conn = DBConnection.getConnection();
        String qry = "SELECT c.customer_name, c.address, s.staff_name, c.mobile_no, co.company_name, p.product_name, p.product_price, o.otp "                + "FROM orders o "
                + "JOIN products p ON o.product_id = p.product_id "                + "JOIN companies co ON o.company_id = co.company_id "
                + "JOIN customers c ON o.customer_id = c.customer_id "                + "JOIN staffs s ON o.staff_id = s.staff_id "
                + "WHERE o.order_id = ?";   
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, orderId);      
        ResultSet rs = ps.executeQuery();
        OrderPojo order = null;    
        if (rs.next()) {
            
            order = new OrderPojo();     
            order.setOrderId(orderId);
            order.setCustomerName(rs.getString("customer_name")); 
            order.setCustomerAddress(rs.getString("address"));
            order.setDeliveryStaffName(rs.getString("staff_name"));     
            order.setCustomerPhoneNo(rs.getString("mobile_no"));
            order.setCompanyName(rs.getString("company_name"));   
            order.setProductName(rs.getString("product_name"));
            order.setProductPrice(rs.getDouble("product_price"));     
            order.setOtp(rs.getInt("otp"));
        }
        return order;    
    }
     public static String productIDByName() throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement st = conn.prepareStatement("select product_id from products where product_name=?");
        ResultSet rs=st.executeQuery();
        if(rs.next()==false)
             return null;
        return rs.getString(1);
         
     }
}
