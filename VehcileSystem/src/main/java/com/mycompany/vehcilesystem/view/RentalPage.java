/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vehcilesystem.view;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class RentalPage extends javax.swing.JFrame {

    /**
     * Creates new form RentalPage
     */
    public RentalPage() {
        initComponents();
        
        CarId();
        date.setDateFormatString("yyyy-MM-dd");
        due.setDateFormatString("yyyy-MM-dd");
        
        id.setEnabled(false);
        name.setEnabled(false);
        rent.setEnabled(false);
        date.setEnabled(false);
        due.setEnabled(false);
        
    }
    Connection conn;
    PreparedStatement ps;
    PreparedStatement pst;
    PreparedStatement pst1;
    PreparedStatement pst2;
    PreparedStatement pst3;
    ResultSet rs;
    
    
    public void CarId(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/VehicleRegistration","root","@pokchu(xumu)0");
             ps = conn.prepareStatement("SELECT * from vregist where Available = 'Available'");
             rs = ps.executeQuery();
             carid.removeAllItems();
             
             while(rs.next()){
                 carid.addItem(rs.getString(2));
             }
    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RentalPage.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainBack = new javax.swing.JPanel();
        RentalPage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        carid = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        rent = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        due = new com.toedter.calendar.JDateChooser();
        confirm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainBack.setBackground(new java.awt.Color(0, 102, 102));
        MainBack.setPreferredSize(new java.awt.Dimension(800, 500));
        MainBack.setLayout(null);

        RentalPage.setBackground(new java.awt.Color(0, 102, 102));
        RentalPage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rental Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        RentalPage.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Car ID");
        RentalPage.add(jLabel1);
        jLabel1.setBounds(130, 90, 60, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Customer ID");
        RentalPage.add(jLabel2);
        jLabel2.setBounds(110, 130, 90, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Customer Name");
        RentalPage.add(jLabel3);
        jLabel3.setBounds(100, 170, 110, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Rental Fee");
        RentalPage.add(jLabel4);
        jLabel4.setBounds(120, 210, 80, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Date");
        RentalPage.add(jLabel5);
        jLabel5.setBounds(140, 250, 40, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Due Date");
        RentalPage.add(jLabel6);
        jLabel6.setBounds(120, 290, 70, 20);

        carid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caridActionPerformed(evt);
            }
        });
        carid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caridKeyPressed(evt);
            }
        });
        RentalPage.add(carid);
        carid.setBounds(270, 90, 170, 22);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });
        RentalPage.add(id);
        id.setBounds(270, 130, 170, 22);
        RentalPage.add(name);
        name.setBounds(270, 170, 170, 22);

        rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentActionPerformed(evt);
            }
        });
        RentalPage.add(rent);
        rent.setBounds(270, 210, 170, 22);
        RentalPage.add(date);
        date.setBounds(270, 250, 170, 22);
        RentalPage.add(due);
        due.setBounds(270, 290, 170, 22);

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        RentalPage.add(confirm);
        confirm.setBounds(100, 380, 90, 23);

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        RentalPage.add(cancel);
        cancel.setBounds(310, 380, 90, 23);

        MainBack.add(RentalPage);
        RentalPage.setBounds(90, 20, 610, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void caridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caridActionPerformed
        // TODO add your handling code here:
      String c_id = carid.getSelectedItem().toString();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/VehicleRegistration","root","@pokchu(xumu)0");
            
            pst = conn.prepareStatement("SELECT * from vregist where RegistrationNo = ?");
            pst.setString(1,c_id);
            rs = ps.executeQuery();
            
            if(rs.next()==false){
                JOptionPane.showMessageDialog(this, "Car Number Not Found");
            }else{
//                String available = rs.getString("Available");
//                option.setText(available);
                
//                if(available.trim().equals("Available")){
                            id.setEnabled(true);
                            name.setEnabled(true);
                            rent.setEnabled(true);
                            date.setEnabled(true);
                            due.setEnabled(true);
//                }
            }   
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RentalPage.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_caridActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String cust_id = id.getText();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/VehicleCustomer","root","@pokchu(xumu)0"); 
                pst1 = conn.prepareStatement("SELECT * from users WHERE CustomerId = ?");
                pst1.setString(1, cust_id);
                rs = pst1.executeQuery();
                
                if(rs.next()==false){
                JOptionPane.showMessageDialog(this, "Customer Number Not Available");
                }else{
                String cust = rs.getString("Name");
                name.setText(cust.trim());
                }
                
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(RentalPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }//GEN-LAST:event_idKeyPressed

    private void rentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rentActionPerformed

    private void caridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caridKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_caridKeyPressed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        String RegistrationNo = carid.getSelectedItem().toString();
        String CustomerId = id.getText();
        String Fee = rent.getText();
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String Date = Date_Format.format(date.getDate());
        SimpleDateFormat Date_Format1 = new SimpleDateFormat("yyyy-MM-dd");
        String Due = Date_Format1.format(due.getDate());
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Rental","root","@pokchu(xumu)0"); 
            pst2 = conn.prepareStatement("insert into rentcar (RegistrationNo,CustomerId,Fee,Date,Due)values(?,?,?,?,?)");
            pst2.setString(1,RegistrationNo);
            pst2.setString(2, CustomerId);
            pst2.setString(3,Fee);
            pst2.setString(4, Date);
            pst2.setString(5,Due);
            pst2.executeUpdate();   
            Class.forName("com.mysql.cj.jdbc.Driver");
                            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/VehicleRegistration","root","@pokchu(xumu)0"); 
            pst3 = conn.prepareStatement("update vregist set Available = 'UnAvailabe' where RegistrationNO = ?");
            pst3.setString(1,RegistrationNo);
            pst3.executeUpdate();
            JOptionPane.showMessageDialog(this, "Sucessfully Updated");
            id.setText("");
            name.setText("");
            rent.setText("");
            date.setDate(null);
            due.setDate(null);
//            boolean isAvailable = true;                    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RentalPage.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_confirmActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        Dashboard_Page dp = new Dashboard_Page();
        dp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(RentalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentalPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentalPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainBack;
    private javax.swing.JPanel RentalPage;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> carid;
    private javax.swing.JButton confirm;
    private com.toedter.calendar.JDateChooser date;
    private com.toedter.calendar.JDateChooser due;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name;
    private javax.swing.JTextField rent;
    // End of variables declaration//GEN-END:variables
}
