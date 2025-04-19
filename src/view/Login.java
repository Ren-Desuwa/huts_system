package view;

import controller.DataController;
import controller.NavigationController;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class Login extends JPanel {

    private final DataController database;
    private final NavigationController navigation;
    private final MainWindow mainWindow;
    /**
     * Creates new form Login
     */
    public Login(DataController db, NavigationController nav, MainWindow mainWindow) {
        this.database = db;
        this.navigation = nav;
        this.mainWindow = mainWindow;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_Login = new javax.swing.JLabel();
        jbtn_Login = new javax.swing.JButton();
        jtf_Username = new javax.swing.JTextField();
        jpf_Password = new javax.swing.JPasswordField();
        jlbl_Password = new javax.swing.JLabel();
        jlbl_Username = new javax.swing.JLabel();
        jlbl__Forgot_Password = new javax.swing.JLabel();
        jlbl_Sign_Up = new javax.swing.JLabel();
        jlbl_Account_Icon = new javax.swing.JLabel();
        jlbl_Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(35, 50, 90));
        setMinimumSize(new java.awt.Dimension(900, 410));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_Login.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_Login.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbl_Login.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_Login.setText("Log In");
        jlbl_Login.setToolTipText("");
        add(jlbl_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jbtn_Login.setBackground(new java.awt.Color(226, 149, 90));
        jbtn_Login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_Login.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Login.setText("Log In");
        jbtn_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Login.setMaximumSize(new java.awt.Dimension(93, 32));
        jbtn_Login.setMinimumSize(new java.awt.Dimension(93, 32));
        jbtn_Login.setPreferredSize(new java.awt.Dimension(93, 32));
        jbtn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_LoginActionPerformed(evt);
            }
        });
        add(jbtn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

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
        add(jtf_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 120, -1));

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
        add(jpf_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 120, -1));

        jlbl_Password.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Password.setText("Password");
        add(jlbl_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jlbl_Username.setForeground(new java.awt.Color(23, 22, 22));
        jlbl_Username.setText("Username");
        add(jlbl_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

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
        add(jlbl__Forgot_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

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
        add(jlbl_Sign_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        jlbl_Account_Icon.setBackground(new java.awt.Color(23, 22, 22));
        jlbl_Account_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/AccountBlack.png"))); // NOI18N
        add(jlbl_Account_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jlbl_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/background(900x410).png"))); // NOI18N
        add(jlbl_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_LoginActionPerformed
        String email = jtf_Username.getText().trim();
        String password = new String(jpf_Password.getPassword()).trim();

        try {
            boolean isAuthenticated = database.authenticateUser(email, password);

            if (isAuthenticated) {
                
                // Success: proceed to the next screen or show success message
                JOptionPane.showMessageDialog(this, "Login successful!");
                CardLayout mainLayout = (CardLayout) mainWindow.getContentPane().getLayout();
                mainLayout.show(mainWindow.getContentPane(), "card3");
                navigation.show("water"); // close window
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
        navigation.show("signup");
    }//GEN-LAST:event_jlbl_Sign_UpMouseClicked

    private void jlbl__Forgot_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl__Forgot_PasswordMouseClicked
        navigation.show("forgotpassword");
    }//GEN-LAST:event_jlbl__Forgot_PasswordMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void jtf_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_UsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_Login;
    private javax.swing.JLabel jlbl_Account_Icon;
    private javax.swing.JLabel jlbl_Background;
    private javax.swing.JLabel jlbl_Login;
    private javax.swing.JLabel jlbl_Password;
    private javax.swing.JLabel jlbl_Sign_Up;
    private javax.swing.JLabel jlbl_Username;
    private javax.swing.JLabel jlbl__Forgot_Password;
    private javax.swing.JPasswordField jpf_Password;
    private javax.swing.JTextField jtf_Username;
    // End of variables declaration//GEN-END:variables
}
