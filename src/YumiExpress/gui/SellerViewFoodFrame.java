/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YumiExpress.gui;

import YumiExpress.Dao.ProductDAO;
import YumiExpress.pojo.ProductPojo;
import YumiExpress.utility.OwnerProfile;
import java.awt.Frame;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class SellerViewFoodFrame extends javax.swing.JFrame {
      private Map<String,ProductPojo>productDetails;
    /**
     * Creates new form ViewFoodFrame
     */
    public SellerViewFoodFrame() {
        initComponents();
       this.setLocationRelativeTo(null);
        this.loadProductDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAddStaffFrame = new javax.swing.JButton();
        btnAddFoodFrame = new javax.swing.JButton();
        btnSellerOrderListFrame = new javax.swing.JButton();
        btnViewStaffFrame = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblFoodImage = new javax.swing.JLabel();
        jcProductNames = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(131, 119, 181));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/YumiExpress/images/user.png"))); // NOI18N

        btnAddStaffFrame.setBackground(new java.awt.Color(204, 255, 0));
        btnAddStaffFrame.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddStaffFrame.setText("Add Staff");
        btnAddStaffFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffFrameActionPerformed(evt);
            }
        });

        btnAddFoodFrame.setBackground(new java.awt.Color(204, 255, 0));
        btnAddFoodFrame.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddFoodFrame.setText("Add Food");
        btnAddFoodFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodFrameActionPerformed(evt);
            }
        });

        btnSellerOrderListFrame.setBackground(new java.awt.Color(204, 255, 0));
        btnSellerOrderListFrame.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSellerOrderListFrame.setText("Order List");
        btnSellerOrderListFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellerOrderListFrameActionPerformed(evt);
            }
        });

        btnViewStaffFrame.setBackground(new java.awt.Color(204, 255, 0));
        btnViewStaffFrame.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewStaffFrame.setText("View Staff");
        btnViewStaffFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStaffFrameActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 255, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSellerOrderListFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewStaffFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddStaffFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnAddFoodFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabel1)
                            .addGap(35, 35, 35))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnAddStaffFrame)
                .addGap(40, 40, 40)
                .addComponent(btnAddFoodFrame)
                .addGap(34, 34, 34)
                .addComponent(btnViewStaffFrame)
                .addGap(34, 34, 34)
                .addComponent(btnSellerOrderListFrame)
                .addGap(43, 43, 43)
                .addComponent(btnBack)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("View Food ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Price");

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Search Food Name");

        lblFoodImage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodImage.setForeground(new java.awt.Color(204, 204, 255));

        jcProductNames.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcProductNames.setForeground(new java.awt.Color(204, 204, 255));
        jcProductNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProductNamesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFoodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcProductNames, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcProductNames, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFoodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStaffFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffFrameActionPerformed
        Frame f=new SellerAddStaffFrame();
        this.dispose();
        f.setVisible(true);
    }//GEN-LAST:event_btnAddStaffFrameActionPerformed

    private void btnAddFoodFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodFrameActionPerformed
       Frame f=new SellerAddFoodItemFrame();
       this.dispose();
       f.setVisible(true);
    }//GEN-LAST:event_btnAddFoodFrameActionPerformed

    private void btnSellerOrderListFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellerOrderListFrameActionPerformed
        Frame f=new SellerOrderListFrame();
        this.dispose();
        f.setVisible(true);
        
    }//GEN-LAST:event_btnSellerOrderListFrameActionPerformed

    private void btnViewStaffFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStaffFrameActionPerformed
        Frame f=new SellerViewStaffFrame();
        this.dispose();
        f.setVisible(true);
    }//GEN-LAST:event_btnViewStaffFrameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Frame f= new SellerOptionsFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jcProductNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProductNamesActionPerformed
         String foodName=jcProductNames.getSelectedItem().toString();
      ProductPojo product=productDetails.get(foodName);
      Image img=product.getProductImage();
      img=img.getScaledInstance(lblFoodImage.getWidth(),lblFoodImage.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon icon=new ImageIcon(img);
      lblFoodImage.setIcon(icon);
      txtPrice.setText(product.getProductPrice()+"");
      
    }//GEN-LAST:event_jcProductNamesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SellerViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerViewFoodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFoodFrame;
    private javax.swing.JButton btnAddStaffFrame;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSellerOrderListFrame;
    private javax.swing.JButton btnViewStaffFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcProductNames;
    private javax.swing.JLabel lblFoodImage;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables


    private void loadProductDetails() {
       try{
           productDetails=ProductDAO.getProductDetailsByCompanyId(OwnerProfile.getCompanyID());
           if(productDetails.isEmpty()){
               JOptionPane.showMessageDialog(null,"No food found for "+OwnerProfile.getCompanyID());
               return;
           }
           showProductNames();
       }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, "Exception in DB in ViewFoodFrame");
         ex.printStackTrace();
     }
     catch(IOException ex){
         JOptionPane.showMessageDialog(null, "Exception in DAO Image Processing in ViewFoodFrame");
         ex.printStackTrace();
     }
    }

    private void showProductNames() {
       Set<String> foodNames=productDetails.keySet();
       for(String foodName:foodNames){
           jcProductNames.addItem(foodName);
       }
    }
}
