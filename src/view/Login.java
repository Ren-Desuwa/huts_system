package view;

import controller.DataController;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {

    private DataController database;
    private CardLayout cardLayout;
    /**
     * Creates new form Login
     */
    public Login(DataController db) {
        this.database = db;
        initComponents();
        
        cardLayout = (CardLayout) this.getContentPane().getLayout();
        jpnl_Main_Login.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnl_Main_Login = new javax.swing.JPanel();
        jlbl_Login = new javax.swing.JLabel();
        jbtn_Login = new javax.swing.JButton();
        jtf_Email = new javax.swing.JTextField();
        jpf_Password = new javax.swing.JPasswordField();
        jlbl_Password = new javax.swing.JLabel();
        jlbl_Email = new javax.swing.JLabel();
        jlbl__Forgot_Password = new javax.swing.JLabel();
        jlbl_Sign_Up = new javax.swing.JLabel();
        jlbl_Account_Icon = new javax.swing.JLabel();
        jlbl_Background = new javax.swing.JLabel();
        jpnl_Main_Sign_Up = new javax.swing.JPanel();
        jlbl_Login1 = new javax.swing.JLabel();
        jbtn_Login1 = new javax.swing.JButton();
        jtf_Email1 = new javax.swing.JTextField();
        jpf_Password1 = new javax.swing.JPasswordField();
        jlbl_Password1 = new javax.swing.JLabel();
        jpf_Password2 = new javax.swing.JPasswordField();
        jlbl_Password2 = new javax.swing.JLabel();
        jlbl_Email1 = new javax.swing.JLabel();
        jlbl_Sign_Up1 = new javax.swing.JLabel();
        jlbl_Account_Icon1 = new javax.swing.JLabel();
        jlbl_Background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jpnl_Main_Login.setBackground(new java.awt.Color(35, 50, 90));
        jpnl_Main_Login.setMinimumSize(new java.awt.Dimension(700, 410));
        jpnl_Main_Login.setPreferredSize(new java.awt.Dimension(700, 410));
        jpnl_Main_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_Login.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_Login.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbl_Login.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_Login.setText("Log In");
        jlbl_Login.setToolTipText("");
        jpnl_Main_Login.add(jlbl_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 60, -1, -1));

        jbtn_Login.setBackground(new java.awt.Color(226, 149, 90));
        jbtn_Login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_Login.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Login.setText("Log In");
        jbtn_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_LoginActionPerformed(evt);
            }
        });
        jpnl_Main_Login.add(jbtn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 323, -1, -1));

        jtf_Email.setBackground(new java.awt.Color(0,0,0,1));
        jtf_Email.setForeground(new java.awt.Color(23, 22, 22));
        jtf_Email.setText("Enter Username");
        jtf_Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_EmailFocusLost(evt);
            }
        });
        jpnl_Main_Login.add(jtf_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 150, 120, -1));

        jpf_Password.setForeground(new java.awt.Color(23, 22, 22));
        jpf_Password.setText("Enter Password");
        jpf_Password.setBackground(new java.awt.Color(0,0,0,1));
        jpf_Password.setEchoChar((char) 0);
        jpf_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpf_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpf_PasswordFocusLost(evt);
            }
        });
        jpnl_Main_Login.add(jpf_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 216, 120, -1));

        jlbl_Password.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Password.setText("Password");
        jpnl_Main_Login.add(jlbl_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 194, -1, -1));

        jlbl_Email.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Email.setText("Username");
        jpnl_Main_Login.add(jlbl_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 128, -1, -1));

        jlbl__Forgot_Password.setForeground(new java.awt.Color(23, 22, 22));
        jlbl__Forgot_Password.setText("Forgot Password?");
        jlbl__Forgot_Password.setToolTipText("");
        jlbl__Forgot_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbl__Forgot_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl__Forgot_PasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbl_Forgot_Password_Mouse_Hover(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbl__Forgot_Password_Mouse_Exited(evt);
            }
        });
        jpnl_Main_Login.add(jlbl__Forgot_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 256, -1, -1));

        jlbl_Sign_Up.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Sign_Up.setText("Sign Up");
        jlbl_Sign_Up.setToolTipText("");
        jlbl_Sign_Up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbl_Sign_Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_Sign_UpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbl_Sign_UpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbl_Sign_UpMouseExited(evt);
            }
        });
        jpnl_Main_Login.add(jlbl_Sign_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 361, -1, -1));

        jlbl_Account_Icon.setBackground(new java.awt.Color(23, 22, 22));
        jlbl_Account_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/AccountBlack.png"))); // NOI18N
        jpnl_Main_Login.add(jlbl_Account_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 60, -1, -1));

        jlbl_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/background2.png"))); // NOI18N
        jlbl_Background.setText("jLabel2");
        jpnl_Main_Login.add(jlbl_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        getContentPane().add(jpnl_Main_Login, "card3");

        jpnl_Main_Sign_Up.setBackground(new java.awt.Color(35, 50, 90));
        jpnl_Main_Sign_Up.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_Login1.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_Login1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbl_Login1.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Login1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_Login1.setText("Sign Up");
        jlbl_Login1.setToolTipText("");
        jpnl_Main_Sign_Up.add(jlbl_Login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 60, -1, -1));

        jbtn_Login1.setBackground(new java.awt.Color(226, 149, 90));
        jbtn_Login1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_Login1.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Login1.setText("Sign Up");
        jbtn_Login1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Login1ActionPerformed(evt);
            }
        });
        jpnl_Main_Sign_Up.add(jbtn_Login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 323, -1, -1));

        jtf_Email.setBackground(new java.awt.Color(0,0,0,1));
        jtf_Email1.setForeground(new java.awt.Color(23, 22, 22));
        jtf_Email1.setText("Enter Username");
        jtf_Email1.setToolTipText("");
        jtf_Email1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_Email1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_Email1FocusLost(evt);
            }
        });
        jtf_Email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_Email1ActionPerformed(evt);
            }
        });
        jpnl_Main_Sign_Up.add(jtf_Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 150, 120, -1));

        jpf_Password1.setForeground(new java.awt.Color(23, 22, 22));
        jpf_Password1.setText("Enter Password");
        jpf_Password1.setEchoChar((char) 0);
        jpf_Password1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpf_Password1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpf_Password1FocusLost(evt);
            }
        });
        jpnl_Main_Sign_Up.add(jpf_Password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 216, 120, -1));

        jlbl_Password1.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Password1.setText("Password");
        jpnl_Main_Sign_Up.add(jlbl_Password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 194, -1, -1));

        jpf_Password2.setForeground(new java.awt.Color(23, 22, 22));
        jpf_Password2.setText("Confirm Password");
        jpf_Password2.setEchoChar((char) 0);
        jpf_Password2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpf_Password2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpf_Password2FocusLost(evt);
            }
        });
        jpnl_Main_Sign_Up.add(jpf_Password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 120, -1));

        jlbl_Password2.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Password2.setText("Confirm Password");
        jpnl_Main_Sign_Up.add(jlbl_Password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jlbl_Email1.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Email1.setText("Username");
        jpnl_Main_Sign_Up.add(jlbl_Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 128, -1, -1));

        jlbl_Sign_Up1.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Sign_Up1.setText("Already Have an Account?");
        jlbl_Sign_Up1.setToolTipText("");
        jlbl_Sign_Up1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbl_Sign_Up1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_Sign_Up1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbl_Sign_Up1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbl_Sign_Up1MouseExited(evt);
            }
        });
        jpnl_Main_Sign_Up.add(jlbl_Sign_Up1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jlbl_Account_Icon1.setBackground(new java.awt.Color(23, 22, 22));
        jlbl_Account_Icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/AccountBlack.png"))); // NOI18N
        jpnl_Main_Sign_Up.add(jlbl_Account_Icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 60, -1, -1));

        jlbl_Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/background2.png"))); // NOI18N
        jlbl_Background1.setText("jLabel2");
        jpnl_Main_Sign_Up.add(jlbl_Background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        getContentPane().add(jpnl_Main_Sign_Up, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_LoginActionPerformed
        String email = jtf_Email.getText().trim();
        String password = new String(jpf_Password.getPassword()).trim();

        try {
            boolean isAuthenticated = database.authenticateUser(email, password);

            if (isAuthenticated) {
                // Success: proceed to the next screen or show success message
                JOptionPane.showMessageDialog(this, "Login successful!");
                dispose(); // close window
                // You could switch cards here, or open a dashboard, etc.
            } else {
                // Invalid credentials
                JOptionPane.showMessageDialog(this, "Invalid email or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while trying to log in.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtn_LoginActionPerformed

    private void jtf_EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_EmailFocusGained
        if ("Enter Username".equals(jtf_Email.getText())) {
            jtf_Email.setText("");
        }
    }//GEN-LAST:event_jtf_EmailFocusGained

    private void jtf_EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_EmailFocusLost
        if ("".equals(jtf_Email.getText())) {
            jtf_Email.setText("Enter Username");
        }
    }//GEN-LAST:event_jtf_EmailFocusLost

    private void jpf_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_PasswordFocusGained
        if ("Enter Password".equals(new String(jpf_Password.getPassword()))) {
            jpf_Password.setEchoChar('\u2022');
            jpf_Password.setText("");
        }
    }//GEN-LAST:event_jpf_PasswordFocusGained

    private void jpf_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_PasswordFocusLost
        if (new String(jpf_Password.getPassword()).isEmpty()) {
            jpf_Password.setEchoChar((char) 0);
            jpf_Password.setText("Enter Password");
        }
    }//GEN-LAST:event_jpf_PasswordFocusLost

    private void jlbl_Forgot_Password_Mouse_Hover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_Forgot_Password_Mouse_Hover
        jlbl__Forgot_Password.setText("<html><u>Forgot Password?</u></html>");
    }//GEN-LAST:event_jlbl_Forgot_Password_Mouse_Hover

    private void jlbl__Forgot_Password_Mouse_Exited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl__Forgot_Password_Mouse_Exited
        jlbl__Forgot_Password.setText("Forgot Password?");
    }//GEN-LAST:event_jlbl__Forgot_Password_Mouse_Exited

    private void jlbl_Sign_UpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_Sign_UpMouseEntered
        jlbl_Sign_Up.setText("<html><u>Sign Up</u></html>");
    }//GEN-LAST:event_jlbl_Sign_UpMouseEntered

    private void jlbl_Sign_UpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_Sign_UpMouseExited
        jlbl_Sign_Up.setText("Sign Up");
    }//GEN-LAST:event_jlbl_Sign_UpMouseExited

    private void jlbl_Sign_UpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_Sign_UpMouseClicked
        cardLayout.show(getContentPane(), "card2");
    }//GEN-LAST:event_jlbl_Sign_UpMouseClicked

    private void jlbl__Forgot_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl__Forgot_PasswordMouseClicked
        cardLayout.show(getContentPane(), "card3");
    }//GEN-LAST:event_jlbl__Forgot_PasswordMouseClicked

    private void jbtn_Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Login1ActionPerformed
        String username = jtf_Email1.getText();
        String password = new String(jpf_Password1.getPassword());
        String password2 = new String(jpf_Password2.getPassword());
            
        try {
            
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fields cannot be empty");
                return;
            }
            
            if (!password.equals(password2)) {
                JOptionPane.showMessageDialog(this, "Password doesnt match");
                return;
            }
            
            boolean success = database.registerUser(username, password); // You'll implement this
            if (success) {
                JOptionPane.showMessageDialog(this, "Registration successful!");
                dispose(); // close window
            } else {
                JOptionPane.showMessageDialog(this, "User already exists or error occurred.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while trying to log in.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtn_Login1ActionPerformed

    private void jtf_Email1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_Email1FocusGained
        if ("Enter Username".equals(jtf_Email1.getText())) {
            jtf_Email1.setText("");
        }
    }//GEN-LAST:event_jtf_Email1FocusGained

    private void jtf_Email1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_Email1FocusLost
        if ("".equals(jtf_Email1.getText())) {
            jtf_Email1.setText("Enter Username");
        }
    }//GEN-LAST:event_jtf_Email1FocusLost

    private void jtf_Email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_Email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_Email1ActionPerformed

    private void jpf_Password1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_Password1FocusGained
        if ("Enter Password".equals(new String(jpf_Password1.getPassword()))) {
            jpf_Password1.setEchoChar('\u2022');
            jpf_Password1.setText("");
        }
    }//GEN-LAST:event_jpf_Password1FocusGained

    private void jpf_Password1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_Password1FocusLost
        if (new String(jpf_Password.getPassword()).isEmpty()) {
            jpf_Password1.setEchoChar((char) 0);
            jpf_Password1.setText("Enter Password");
        }
    }//GEN-LAST:event_jpf_Password1FocusLost

    private void jlbl_Sign_Up1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_Sign_Up1MouseClicked
        cardLayout.show(getContentPane(), "card3");
    }//GEN-LAST:event_jlbl_Sign_Up1MouseClicked

    private void jlbl_Sign_Up1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_Sign_Up1MouseEntered
        jlbl_Sign_Up1.setText("<html><u>Already Have an Account?</u></html>");
    }//GEN-LAST:event_jlbl_Sign_Up1MouseEntered

    private void jlbl_Sign_Up1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_Sign_Up1MouseExited
        jlbl_Sign_Up1.setText("Already Have an Account?");
    }//GEN-LAST:event_jlbl_Sign_Up1MouseExited

    private void jpf_Password2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_Password2FocusGained
        if ("Confirm Password".equals(new String(jpf_Password2.getPassword()))) {
            jpf_Password2.setEchoChar('\u2022');
            jpf_Password2.setText("");
        }
    }//GEN-LAST:event_jpf_Password2FocusGained

    private void jpf_Password2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_Password2FocusLost
        if ((new String(jpf_Password2.getPassword())).isEmpty()) {
            jpf_Password2.setEchoChar((char) 0);
            jpf_Password2.setText("Confirm Password");
        }
    }//GEN-LAST:event_jpf_Password2FocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        jpnl_Main_Login.requestFocusInWindow();
        jpnl_Main_Sign_Up.requestFocusInWindow();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_Login;
    private javax.swing.JButton jbtn_Login1;
    private javax.swing.JLabel jlbl_Account_Icon;
    private javax.swing.JLabel jlbl_Account_Icon1;
    private javax.swing.JLabel jlbl_Background;
    private javax.swing.JLabel jlbl_Background1;
    private javax.swing.JLabel jlbl_Email;
    private javax.swing.JLabel jlbl_Email1;
    private javax.swing.JLabel jlbl_Login;
    private javax.swing.JLabel jlbl_Login1;
    private javax.swing.JLabel jlbl_Password;
    private javax.swing.JLabel jlbl_Password1;
    private javax.swing.JLabel jlbl_Password2;
    private javax.swing.JLabel jlbl_Sign_Up;
    private javax.swing.JLabel jlbl_Sign_Up1;
    private javax.swing.JLabel jlbl__Forgot_Password;
    private javax.swing.JPasswordField jpf_Password;
    private javax.swing.JPasswordField jpf_Password1;
    private javax.swing.JPasswordField jpf_Password2;
    private javax.swing.JPanel jpnl_Main_Login;
    private javax.swing.JPanel jpnl_Main_Sign_Up;
    private javax.swing.JTextField jtf_Email;
    private javax.swing.JTextField jtf_Email1;
    // End of variables declaration//GEN-END:variables
}
