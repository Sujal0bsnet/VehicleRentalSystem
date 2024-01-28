package com.mycompany.vehcilesystem.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class Vehicle_Registration extends javax.swing.JFrame {

    /**
     * Creates new form Vehicle_Registration
     */
    public Vehicle_Registration() {
        initComponents();
        AutoId();
        Update_Table();
    }
    
    Connection conn;
    PreparedStatement ps;
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RegNo = new javax.swing.JTextField();
        MakeTab = new javax.swing.JTextField();
        ModTab = new javax.swing.JTextField();
        Available = new javax.swing.JComboBox<>();
        Update = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VRegTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundPanel.setBackground(new java.awt.Color(0, 102, 102));
        BackgroundPanel.setForeground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Registration No");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Brand");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Model");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Availability ");

        MakeTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeTabActionPerformed(evt);
            }
        });

        Available.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "UnAvailable" }));
        Available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailableActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MakeTab, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(ModTab, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(Available, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MakeTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ModTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Available, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Add)
                        .addGap(30, 30, 30)
                        .addComponent(Delete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(Update)
                        .addGap(31, 31, 31)
                        .addComponent(Cancel)))
                .addGap(188, 188, 188))
        );

        BackgroundPanel.add(jPanel1);
        jPanel1.setBounds(10, 50, 300, 370);

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setForeground(new java.awt.Color(204, 204, 204));

        VRegTable.setBackground(new java.awt.Color(0, 102, 102));
        VRegTable.setForeground(new java.awt.Color(204, 204, 204));
        VRegTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration No", "Brand", "Model", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        VRegTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VRegTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VRegTable);

        BackgroundPanel.add(jScrollPane1);
        jScrollPane1.setBounds(330, 20, 430, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Update_Table(){
        int v;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/VehicleRegistration","root","@pokchu(xumu)0");
             ps = conn.prepareStatement("select * from vregist");
             
             ResultSet rs = ps.executeQuery();
             ResultSetMetaData rd = rs.getMetaData();
             v = rd.getColumnCount();
             DefaultTableModel df = (DefaultTableModel)VRegTable.getModel();
             df.setRowCount(0);
             
             while (rs.next()){
                 Vector t = new Vector();
                 for(int i=1; i<=v; i++){
                     t.add(rs.getString("RegistrationNo"));
                     t.add(rs.getString("Brand"));
                     t.add(rs.getString("Model"));
                     t.add(rs.getString("Available"));
                 }
                df.addRow(t);         
             }      
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Vehicle_Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void AutoId(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/VehicleRegistration","root","@pokchu(xumu)0");
            Statement s = conn.createStatement();
            
            ResultSet rs = s.executeQuery("select Max(Id) as maxId from vregist");
            rs.next();
//            rs.getString("Max(RegistrationNo)");
            var maxId = rs.getInt("maxId");
            if(maxId ==0)
            {
                RegNo.setText("V001");
            }
            else
            {
               long id = maxId;
               id++;
                System.out.println(id);
               RegNo.setText("V0" + String.format("%02d",id));
            }
      
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Vehicle_Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    private void MakeTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MakeTabActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String rgno = RegNo.getText();
        String made =MakeTab.getText();
        String mod  =ModTab.getText();
        String ava = Available.getSelectedItem().toString();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/VehicleRegistration","root","@pokchu(xumu)0");
            ps = conn.prepareStatement("Insert into vregist(RegistrationNo,Brand,Model,Available)values(?,?,?,?)");
            ps.setString(1,rgno);
            ps.setString(2,made);
            ps.setString(3,mod);
            ps.setString(4,ava);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Vechile Registered");
            
            MakeTab.setText("");
            ModTab.setText("");
            Available.setSelectedIndex(-1);
            
            MakeTab.requestFocus();
            AutoId();
            Update_Table();
            
    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Vehicle_Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_AddActionPerformed

    private void VRegTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VRegTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)VRegTable.getModel();
        int selectIndex = VRegTable.getSelectedRow();
        
        RegNo.setText(d1.getValueAt(selectIndex,0).toString());
        MakeTab.setText(d1.getValueAt(selectIndex,1).toString());
        ModTab.setText(d1.getValueAt(selectIndex,2).toString());
        Available.setSelectedItem(d1.getValueAt(selectIndex,3).toString());

    }//GEN-LAST:event_VRegTableMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)VRegTable.getModel();
        int selectIndex = VRegTable.getSelectedRow();
        try {
            String id = d1.getValueAt(selectIndex,0).toString();
            String brand = MakeTab.getText();
            String model = ModTab.getText();
            String available= Available.getSelectedItem().toString();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/VehicleRegistration","root","@pokchu(xumu)0");
            ps = conn.prepareStatement("update vregist set brand=?,model=?,available=? where RegistrationNo=?");
            ps.setString(1, brand);
            ps.setString(2, model);
            ps.setString(3, available);
            ps.setString(4, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Vehicle Registration Updated");
            Update_Table();
                       
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Vehicle_Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        MakeTab.setText("");
        ModTab.setText("");
        Available.setSelectedIndex(-1);
        AutoId();
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)VRegTable.getModel();
        int selectIndex = VRegTable.getSelectedRow();
            String id = d1.getValueAt(selectIndex,0).toString();
            int dialogResult = JOptionPane.showConfirmDialog(this,"Do yo want to Delete the Vehicle","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/VehicleRegistration","root","@pokchu(xumu)0");
                ps = conn.prepareStatement("delete from vregist where RegistrationNo=?");
                ps.setString(1,id);
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Data has been deleted");
                Update_Table();
                
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Vehicle_Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            MakeTab.setText("");
            ModTab.setText("");
            Available.setSelectedIndex(-1);
            AutoId();
    }//GEN-LAST:event_DeleteActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        Dashboard_Page dp = new Dashboard_Page();
        dp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void AvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvailableActionPerformed
 
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehicle_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new Vehicle_Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JComboBox<String> Available;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField MakeTab;
    private javax.swing.JTextField ModTab;
    private javax.swing.JTextField RegNo;
    private javax.swing.JButton Update;
    private javax.swing.JTable VRegTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
