
package com.mycompany.vehcilesystem.view;

import com.mycompany.vehcilesystem.dao.AuthDao;
import com.mycompany.vehcilesystem.model.Register_Model;
import javax.swing.JOptionPane;


public class SignUp_page extends javax.swing.JFrame {

    public SignUp_page() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PassText = new javax.swing.JPanel();
        SignUp = new javax.swing.JLabel();
        UserSignText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        PasswordSignText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ConfirmPassword = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        SignUp2 = new javax.swing.JButton();
        LoginUI = new javax.swing.JButton();
        IHaveAccount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Pictures\\Screenshots\\360_F_289182293_vjYtymZqUaWQjgPDpz9CsnjyelcAOg39.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        PassText.setBackground(new java.awt.Color(0, 102, 102));

        SignUp.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUp.setText("Sign Up");

        UserSignText.setBackground(new java.awt.Color(0, 102, 102));
        UserSignText.setForeground(new java.awt.Color(255, 255, 255));
        UserSignText.setText("Username");
        UserSignText.setBorder(null);
        UserSignText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserSignTextFocusGained(evt);
            }
        });

        PasswordSignText.setBackground(new java.awt.Color(0, 102, 102));
        PasswordSignText.setForeground(new java.awt.Color(255, 255, 255));
        PasswordSignText.setText("Password");
        PasswordSignText.setBorder(null);
        PasswordSignText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordSignTextFocusGained(evt);
            }
        });

        ConfirmPassword.setBackground(new java.awt.Color(0, 102, 102));
        ConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPassword.setText("Confirm Password");
        ConfirmPassword.setBorder(null);
        ConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ConfirmPasswordFocusGained(evt);
            }
        });

        SignUp2.setBackground(new java.awt.Color(0, 102, 102));
        SignUp2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        SignUp2.setForeground(new java.awt.Color(255, 255, 255));
        SignUp2.setText("Sign Up");
        SignUp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUp2MouseClicked(evt);
            }
        });
        SignUp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp2ActionPerformed(evt);
            }
        });

        LoginUI.setBackground(new java.awt.Color(0, 102, 102));
        LoginUI.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LoginUI.setForeground(new java.awt.Color(255, 255, 255));
        LoginUI.setText("Login");
        LoginUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUIActionPerformed(evt);
            }
        });

        IHaveAccount.setBackground(new java.awt.Color(0, 102, 102));
        IHaveAccount.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        IHaveAccount.setForeground(new java.awt.Color(255, 255, 255));
        IHaveAccount.setText("I have an account");

        javax.swing.GroupLayout PassTextLayout = new javax.swing.GroupLayout(PassText);
        PassText.setLayout(PassTextLayout);
        PassTextLayout.setHorizontalGroup(
            PassTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassTextLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(PassTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassTextLayout.createSequentialGroup()
                        .addGroup(PassTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PassTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ConfirmPassword)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PassTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PasswordSignText)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PassTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UserSignText, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                .addComponent(jSeparator1))
                            .addComponent(LoginUI, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassTextLayout.createSequentialGroup()
                        .addComponent(SignUp2)
                        .addGap(158, 158, 158))))
            .addGroup(PassTextLayout.createSequentialGroup()
                .addGroup(PassTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PassTextLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(IHaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PassTextLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PassTextLayout.setVerticalGroup(
            PassTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassTextLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(UserSignText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(PasswordSignText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(SignUp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(PassTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginUI)
                    .addComponent(IHaveAccount))
                .addGap(95, 95, 95))
        );

        jPanel1.add(PassText);
        PassText.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginUIActionPerformed
        // TODO add your handling code here:
        Login_Page log = new Login_Page();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LoginUIActionPerformed

    private void UserSignTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserSignTextFocusGained
        // TODO add your handling code here:
        UserSignText.setText("");
    }//GEN-LAST:event_UserSignTextFocusGained

    private void PasswordSignTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordSignTextFocusGained
        // TODO add your handling code here:
        PasswordSignText.setText("");
    }//GEN-LAST:event_PasswordSignTextFocusGained

    private void ConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasswordFocusGained
        // TODO add your handling code here:
        ConfirmPassword.setText("");
    }//GEN-LAST:event_ConfirmPasswordFocusGained

    private void SignUp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp2ActionPerformed
   
    }//GEN-LAST:event_SignUp2ActionPerformed

    private void SignUp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp2MouseClicked
        // TODO add your handling code here:
        AuthDao auth = new AuthDao();
        String username = UserSignText.getText();
        String password = PasswordSignText.getText();
        String confirm_password= ConfirmPassword.getText();
        if(password == null ? confirm_password != null : !password.equals(confirm_password)){
             JOptionPane.showMessageDialog(null,"Incroccet Password!");
        }else{
          Register_Model rm = new Register_Model(username,password);
        boolean result = auth.resgister(rm);
            if(result == true){
                JOptionPane.showMessageDialog(null,"Account have been sucessfully created!");
            }else{
                JOptionPane.showMessageDialog(null,"SignUp Dailed!");   
            }
            
        }
        
        
        
    }//GEN-LAST:event_SignUp2MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConfirmPassword;
    private javax.swing.JLabel IHaveAccount;
    private javax.swing.JButton LoginUI;
    private javax.swing.JPanel PassText;
    private javax.swing.JTextField PasswordSignText;
    private javax.swing.JLabel SignUp;
    private javax.swing.JButton SignUp2;
    private javax.swing.JTextField UserSignText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
