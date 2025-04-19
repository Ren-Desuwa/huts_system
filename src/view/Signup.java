package view;

import controller.DataController;
import controller.NavigationController;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JPanel;

public class Signup extends JPanel {

    private final DataController database;
    private final NavigationController navigation;
    /**
     * Creates new form Login
     */
    public Signup(DataController db, NavigationController nav) {
        this.database = db;
        this.navigation = nav;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_SignIn = new javax.swing.JLabel();
        jbtn_Signup = new javax.swing.JButton();
        jtf_Username = new javax.swing.JTextField();
        jpf_Confirm_Password = new javax.swing.JPasswordField();
        jlbl_Password = new javax.swing.JLabel();
        jlbl_Username = new javax.swing.JLabel();
        jlbl_Login = new javax.swing.JLabel();
        jlbl_Account_Icon = new javax.swing.JLabel();
        jpf_Password = new javax.swing.JPasswordField();
        jlbl_Confirm_Password = new javax.swing.JLabel();
        jtf_Email = new javax.swing.JTextField();
        jlbl_Email = new javax.swing.JLabel();
        jlbl_Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(35, 50, 90));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_SignIn.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_SignIn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbl_SignIn.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_SignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_SignIn.setText("Sign In");
        jlbl_SignIn.setToolTipText("");
        add(jlbl_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        jbtn_Signup.setBackground(new java.awt.Color(226, 149, 90));
        jbtn_Signup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_Signup.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Signup.setText("Sign Up");
        jbtn_Signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_SignupActionPerformed(evt);
            }
        });
        add(jbtn_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jtf_Username.setBackground(new java.awt.Color(0,0,0,1));
        jtf_Username.setForeground(new java.awt.Color(23, 22, 22));
        jtf_Username.setText("Enter Username");
        jtf_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_UsernameFocusLost(evt);
            }
        });
        jtf_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_UsernameActionPerformed(evt);
            }
        });
        add(jtf_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 120, -1));

        jpf_Confirm_Password.setForeground(new java.awt.Color(23, 22, 22));
        jpf_Confirm_Password.setText("Confirm Password");
        jpf_Confirm_Password.setBackground(new java.awt.Color(0,0,0,1));
        jpf_Confirm_Password.setEchoChar((char) 0);
        jpf_Confirm_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpf_Confirm_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpf_Confirm_PasswordFocusLost(evt);
            }
        });
        jpf_Confirm_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpf_Confirm_PasswordActionPerformed(evt);
            }
        });
        add(jpf_Confirm_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 120, -1));

        jlbl_Password.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Password.setText("Password");
        add(jlbl_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jlbl_Username.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Username.setText("Username");
        add(jlbl_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jlbl_Login.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Login.setText("Log In");
        jlbl_Login.setToolTipText("");
        jlbl_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbl_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbl_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbl_LoginMouseExited(evt);
            }
        });
        add(jlbl_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        jlbl_Account_Icon.setBackground(new java.awt.Color(23, 22, 22));
        jlbl_Account_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/AccountBlack.png"))); // NOI18N
        add(jlbl_Account_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

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
        jpf_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpf_PasswordActionPerformed(evt);
            }
        });
        add(jpf_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 120, -1));

        jlbl_Confirm_Password.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Confirm_Password.setText("Confirm Password");
        add(jlbl_Confirm_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        jtf_Email.setForeground(new java.awt.Color(23, 22, 22));
        jtf_Email.setText("Enter Email");
        jtf_Email.setBackground(new java.awt.Color(0,0,0,1));
        jtf_Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_EmailFocusLost(evt);
            }
        });
        add(jtf_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 120, -1));

        jlbl_Email.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Email.setText("Email");
        add(jlbl_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jlbl_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/background(900x410).png"))); // NOI18N
        add(jlbl_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_SignupActionPerformed
        String email = jtf_Username.getText().trim();
        String password = new String(jpf_Confirm_Password.getPassword()).trim();

        try {
            boolean isAuthenticated = database.authenticateUser(email, password);

            if (isAuthenticated) {
                // Success: proceed to the next screen or show success message
                JOptionPane.showMessageDialog(this, "Login successful!");
                navigation.show("dashboard"); // close window
                // You could switch cards here, or open a dashboard, etc.
            } else {
                // Invalid credentials
                JOptionPane.showMessageDialog(this, "Invalid email or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while trying to log in.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtn_SignupActionPerformed

    private void jtf_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_UsernameFocusGained
        if ("Enter Username".equals(jtf_Username.getText())) {
            jtf_Username.setText("");
        }
    }//GEN-LAST:event_jtf_UsernameFocusGained

    private void jtf_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_UsernameFocusLost
        if ("".equals(jtf_Username.getText())) {
            jtf_Username.setText("Enter Username");
        }
    }//GEN-LAST:event_jtf_UsernameFocusLost

    private void jpf_Confirm_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_Confirm_PasswordFocusGained
        if ("Confirm Password".equals(new String(jpf_Confirm_Password.getPassword()))) {
            jpf_Confirm_Password.setEchoChar('\u2022');
            jpf_Confirm_Password.setText("");
        }
    }//GEN-LAST:event_jpf_Confirm_PasswordFocusGained

    private void jpf_Confirm_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_Confirm_PasswordFocusLost
        if (new String(jpf_Confirm_Password.getPassword()).isEmpty()) {
            jpf_Confirm_Password.setEchoChar((char) 0);
            jpf_Confirm_Password.setText("Confirm Password");
        }
    }//GEN-LAST:event_jpf_Confirm_PasswordFocusLost

    private void jlbl_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_LoginMouseEntered
        jlbl_Login.setText("<html><u>Log In</u></html>");
    }//GEN-LAST:event_jlbl_LoginMouseEntered

    private void jlbl_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_LoginMouseExited
        jlbl_Login.setText("Log In");
    }//GEN-LAST:event_jlbl_LoginMouseExited

    private void jlbl_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_LoginMouseClicked
        navigation.show("login");
    }//GEN-LAST:event_jlbl_LoginMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

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

    private void jtf_EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_EmailFocusGained
        if ("Enter Email".equals(jtf_Email.getText())) {
            jtf_Email.setText("");
        }
    }//GEN-LAST:event_jtf_EmailFocusGained

    private void jtf_EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_EmailFocusLost
        if ("".equals(jtf_Email.getText())) {
            jtf_Email.setText("Enter Email");
        }
    }//GEN-LAST:event_jtf_EmailFocusLost

    private void jpf_Confirm_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpf_Confirm_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpf_Confirm_PasswordActionPerformed

    private void jpf_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpf_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpf_PasswordActionPerformed

    private void jtf_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_UsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_Signup;
    private javax.swing.JLabel jlbl_Account_Icon;
    private javax.swing.JLabel jlbl_Background;
    private javax.swing.JLabel jlbl_Confirm_Password;
    private javax.swing.JLabel jlbl_Email;
    private javax.swing.JLabel jlbl_Login;
    private javax.swing.JLabel jlbl_Password;
    private javax.swing.JLabel jlbl_SignIn;
    private javax.swing.JLabel jlbl_Username;
    private javax.swing.JPasswordField jpf_Confirm_Password;
    private javax.swing.JPasswordField jpf_Password;
    private javax.swing.JTextField jtf_Email;
    private javax.swing.JTextField jtf_Username;
    // End of variables declaration//GEN-END:variables
}
