package view;
import controller.DataController;
import controller.NavigationController;

public class UserProfile extends javax.swing.JPanel {

    private final NavigationController navigation;
    private final DataController database;
    
    public UserProfile(DataController db, NavigationController nav) {
        this.database = db;
        this.navigation = nav;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jbtn_Edit = new javax.swing.JButton();
        jlbl__Forgot_Password = new javax.swing.JLabel();
        Out_Email = new javax.swing.JLabel();
        Pane_Email = new javax.swing.JTextPane();
        Out_Username = new javax.swing.JLabel();
        Pane_Username = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Background = new javax.swing.JLabel();
        In_Email = new javax.swing.JTextField();
        In_Username = new javax.swing.JTextField();

        setBackground(new java.awt.Color(35, 50, 90));
        setMinimumSize(new java.awt.Dimension(700, 410));
        setPreferredSize(new java.awt.Dimension(700, 410));
        setLayout(null);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(23, 22, 22));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("User Profile");
        Title.setToolTipText("");
        add(Title);
        Title.setBounds(252, 31, 220, 36);

        Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(23, 22, 22));
        Username.setText("Username");
        add(Username);
        Username.setBounds(290, 80, 62, 20);

        Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(23, 22, 22));
        Email.setText("Email");
        add(Email);
        Email.setBounds(290, 140, 40, 20);

        jbtn_Edit.setBackground(new java.awt.Color(226, 149, 90));
        jbtn_Edit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_Edit.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Edit.setText("Edit");
        jbtn_Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Edit.setMaximumSize(new java.awt.Dimension(93, 32));
        jbtn_Edit.setMinimumSize(new java.awt.Dimension(93, 32));
        jbtn_Edit.setPreferredSize(new java.awt.Dimension(93, 32));
        jbtn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_EditActionPerformed(evt);
            }
        });
        add(jbtn_Edit);
        jbtn_Edit.setBounds(315, 305, 93, 32);

        jlbl__Forgot_Password.setForeground(new java.awt.Color(23, 22, 22));
        jlbl__Forgot_Password.setText("Forgot Password?");
        jlbl__Forgot_Password.setToolTipText("");
        jlbl__Forgot_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbl__Forgot_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl__Forgot_PasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbl__Forgot_Passwordjlbl_Forgot_Password_Mouse_Hover(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbl__Forgot_Password_Mouse_Exited(evt);
            }
        });
        add(jlbl__Forgot_Password);
        jlbl__Forgot_Password.setBounds(314, 209, 100, 16);

        Out_Email.setBackground(new java.awt.Color(255, 255, 255));
        Out_Email.setLabelFor(Pane_Email);
        Out_Email.setText("{$Email$}");
        Out_Email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(Out_Email);
        Out_Email.setBounds(300, 170, 100, 20);
        add(Pane_Email);
        Pane_Email.setBounds(300, 170, 100, 20);
        Pane_Email.setText("Email");

        Out_Username.setBackground(new java.awt.Color(255, 255, 255));
        Out_Username.setLabelFor(Pane_Username);
        Out_Username.setText("{$Username$}");
        Out_Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(Out_Username);
        Out_Username.setBounds(300, 110, 100, 20);
        add(Pane_Username);
        Pane_Username.setBounds(300, 110, 100, 20);
        add(jScrollPane1);
        jScrollPane1.setBounds(310, 110, 2, 2);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/background(700x410).png"))); // NOI18N
        Background.setText("jLabel22");
        add(Background);
        Background.setBounds(0, 0, 700, 410);

        In_Email.setForeground(new java.awt.Color(23, 22, 22));
        In_Email.setText("{$Email$}");
        In_Email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        In_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_EmailActionPerformed(evt);
            }
        });
        add(In_Email);
        In_Email.setBounds(300, 170, 122, 18);

        In_Username.setForeground(new java.awt.Color(23, 22, 22));
        In_Username.setText("{$Username$}");
        In_Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        In_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_UsernameActionPerformed(evt);
            }
        });
        add(In_Username);
        In_Username.setBounds(300, 110, 100, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void In_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_UsernameActionPerformed

    private void In_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_EmailActionPerformed

    private void jbtn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_EditActionPerformed
        
    }//GEN-LAST:event_jbtn_EditActionPerformed

    private void jlbl__Forgot_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl__Forgot_PasswordMouseClicked
        navigation.show("forgotpassword");
    }//GEN-LAST:event_jlbl__Forgot_PasswordMouseClicked

    private void jlbl__Forgot_Passwordjlbl_Forgot_Password_Mouse_Hover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl__Forgot_Passwordjlbl_Forgot_Password_Mouse_Hover
        jlbl__Forgot_Password.setText("<html><u>Forgot Password?</u></html>");
    }//GEN-LAST:event_jlbl__Forgot_Passwordjlbl_Forgot_Password_Mouse_Hover

    private void jlbl__Forgot_Password_Mouse_Exited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl__Forgot_Password_Mouse_Exited
        jlbl__Forgot_Password.setText("Forgot Password?");
    }//GEN-LAST:event_jlbl__Forgot_Password_Mouse_Exited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField In_Email;
    private javax.swing.JTextField In_Username;
    private javax.swing.JLabel Out_Email;
    private javax.swing.JLabel Out_Username;
    private javax.swing.JTextPane Pane_Email;
    private javax.swing.JTextPane Pane_Username;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Username;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_Edit;
    private javax.swing.JLabel jlbl__Forgot_Password;
    // End of variables declaration//GEN-END:variables
}
