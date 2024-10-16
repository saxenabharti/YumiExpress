/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YumiExpress.gui;

import YumiExpress.Dao.StaffDAO;
import YumiExpress.pojo.StaffPojo;
import YumiExpress.utility.OwnerProfile;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class SellerViewStaffFrame extends javax.swing.JFrame {
  List<String> staffList;
    
    public SellerViewStaffFrame() {
        initComponents();
         setLocationRelativeTo(null);
         this.txtCompanyName.setText(OwnerProfile.getCompanyName());
         loadDetails();
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
        btnAddFoodFrame = new javax.swing.JButton();
        btnViewFoodFrame = new javax.swing.JButton();
        btnOrderListFrame = new javax.swing.JButton();
        btnAddStaffFrame = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcStaffID = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtStaffName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(131, 119, 181));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/YumiExpress/images/user.png"))); // NOI18N

        btnAddFoodFrame.setBackground(new java.awt.Color(204, 255, 0));
        btnAddFoodFrame.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddFoodFrame.setText("Add Food");
        btnAddFoodFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodFrameActionPerformed(evt);
            }
        });

        btnViewFoodFrame.setBackground(new java.awt.Color(204, 255, 0));
        btnViewFoodFrame.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewFoodFrame.setText("View Food");
        btnViewFoodFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFoodFrameActionPerformed(evt);
            }
        });

        btnOrderListFrame.setBackground(new java.awt.Color(204, 255, 0));
        btnOrderListFrame.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOrderListFrame.setText("Order List");
        btnOrderListFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderListFrameActionPerformed(evt);
            }
        });

        btnAddStaffFrame.setBackground(new java.awt.Color(204, 255, 0));
        btnAddStaffFrame.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddStaffFrame.setText("Add Staff");
        btnAddStaffFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffFrameActionPerformed(evt);
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
                    .addComponent(btnOrderListFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddStaffFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddFoodFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnViewFoodFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(btnAddFoodFrame)
                .addGap(40, 40, 40)
                .addComponent(btnViewFoodFrame)
                .addGap(34, 34, 34)
                .addComponent(btnAddStaffFrame)
                .addGap(34, 34, 34)
                .addComponent(btnOrderListFrame)
                .addGap(43, 43, 43)
                .addComponent(btnBack)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("View Staff");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(131, 119, 181));
        jLabel5.setText("Company Name :");

        txtCompanyName.setEditable(false);
        txtCompanyName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCompanyName.setForeground(new java.awt.Color(131, 119, 181));

        txtEmail.setEditable(false);
        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(131, 119, 181));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(131, 119, 181));
        jLabel6.setText("Enter E-mail :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(131, 119, 181));
        jLabel7.setText("Enter Name :");

        jcStaffID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcStaffID.setForeground(new java.awt.Color(204, 204, 255));
        jcStaffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcStaffIDActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(131, 119, 181));
        jLabel11.setText("Staff ID :");

        txtStaffName.setEditable(false);
        txtStaffName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtStaffName.setForeground(new java.awt.Color(131, 119, 181));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStaffName, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCompanyName)
                                .addComponent(jcStaffID, 0, 378, Short.MAX_VALUE)
                                .addComponent(txtEmail)))))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFoodFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodFrameActionPerformed
        Frame f=new SellerAddStaffFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddFoodFrameActionPerformed

    private void btnViewFoodFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFoodFrameActionPerformed
        Frame f=new SellerViewFoodFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewFoodFrameActionPerformed

    private void btnOrderListFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderListFrameActionPerformed
        Frame f=new SellerOrderListFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderListFrameActionPerformed

    private void btnAddStaffFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffFrameActionPerformed
        Frame f=new SellerAddStaffFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddStaffFrameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Frame f= new SellerOptionsFrame();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jcStaffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcStaffIDActionPerformed
          String selStaffId=this.jcStaffID.getSelectedItem().toString();
       try{
           StaffPojo staff=StaffDAO.getStaffDetailsbyId(selStaffId);
           this.txtStaffName.setText(staff.getStaffName().trim());
           this.txtEmail.setText(staff.getEmailId().toString());
           
       }catch(SQLException sq){
            JOptionPane.showMessageDialog(null,"DB ERROR IN ViewDeliveryStaffFrame");
            sq.printStackTrace();
        }
    }//GEN-LAST:event_jcStaffIDActionPerformed

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
            java.util.logging.Logger.getLogger(SellerViewStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerViewStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerViewStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerViewStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerViewStaffFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFoodFrame;
    private javax.swing.JButton btnAddStaffFrame;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrderListFrame;
    private javax.swing.JButton btnViewFoodFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcStaffID;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtStaffName;
    // End of variables declaration//GEN-END:variables

    private void loadDetails() {
             try{
            staffList=StaffDAO.getAllStaffIdByCompanyId(OwnerProfile.getCompanyID().trim());
            if(staffList.isEmpty()){
                JOptionPane.showMessageDialog(null,"No Staff Added Yet");
                return;
            }
            for(String staffId:staffList){
               this.jcStaffID.addItem(staffId);
            }
        }catch(SQLException sq){
            JOptionPane.showMessageDialog(null,"DB ERROR IN ViewDeliveryStaffFrame");
            sq.printStackTrace();
        }
    }
}
