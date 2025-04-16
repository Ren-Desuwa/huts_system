package view;

import controller.DataController;

public class Login extends javax.swing.JPanel {


    public Login(DataController db) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblLogin = new javax.swing.JLabel();
        jbtnLogin = new javax.swing.JButton();
        jtfEmail = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        jlblEmail = new javax.swing.JLabel();
        jlblPassword = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 0, 102));
        setPreferredSize(new java.awt.Dimension(0, 0));

        jlblLogin.setBackground(new java.awt.Color(255, 255, 255));
        jlblLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlblLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogin.setText("Log In");
        jlblLogin.setToolTipText("");

        jbtnLogin.setBackground(new java.awt.Color(255, 0, 0));
        jbtnLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLogin.setText("Log In");
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });

        jtfEmail.setText("Enter your Email");
        jtfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfEmailFocusLost(evt);
            }
        });

        jpfPassword.setText("Password");
        jpfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpfPasswordFocusLost(evt);
            }
        });

        jlblEmail.setForeground(new java.awt.Color(255, 255, 255));
        jlblEmail.setText("Email");

        jlblPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlblPassword.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblEmail)
                    .addComponent(jlblPassword)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jlblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jlblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblPassword)
                .addGap(1, 1, 1)
                .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        
    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jtfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEmailFocusGained
        if ("Enter your Email".equals(jtfEmail.getText())) {
            jtfEmail.setText("");
        }
    }//GEN-LAST:event_jtfEmailFocusGained

    private void jpfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpfPasswordFocusGained
    if ("Password".equals(jpfPassword.getText())) {    
            jpfPassword.setText("");
        }
    }//GEN-LAST:event_jpfPasswordFocusGained

    private void jtfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEmailFocusLost
        if ("".equals(jtfEmail.getText())) {
            jtfEmail.setText("Enter your Email");
        }
    }//GEN-LAST:event_jtfEmailFocusLost

    private void jpfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpfPasswordFocusLost
        if ("".equals(jpfPassword.getText())) {    
            jpfPassword.setText("Password");
        }
    }//GEN-LAST:event_jpfPasswordFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JLabel jlblEmail;
    private javax.swing.JLabel jlblLogin;
    private javax.swing.JLabel jlblPassword;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JTextField jtfEmail;
    // End of variables declaration//GEN-END:variables
}
