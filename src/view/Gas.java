package view;
import controller.DataController;
import controller.NavigationController;
import java.time.LocalDate;
import model.Bill;

public class Gas extends javax.swing.JPanel {

    private final NavigationController navigation;
    private final DataController database;
    
    public Gas(DataController db, NavigationController nav) {
        this.database = db;
        this.navigation = nav;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        In_Date = new javax.swing.JTextField();
        In_Amount = new javax.swing.JTextField();
        In_m3Used1 = new javax.swing.JTextField();
        In_m3Used = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        BillHistory = new javax.swing.JLabel();
        kWhUsed1 = new javax.swing.JLabel();
        kWhUsed = new javax.swing.JLabel();
        ScrollPane_Water_Bill = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jbtn_Edit = new javax.swing.JButton();
        jbtn_Delete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbtn_Edit1 = new javax.swing.JButton();
        jbtn_Delete1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(35, 50, 90));
        setMinimumSize(new java.awt.Dimension(700, 410));
        setPreferredSize(new java.awt.Dimension(700, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(23, 22, 22));
        Title.setText("Add New Gas");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 36));

        Date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(23, 22, 22));
        Date.setText("Month");
        add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 54, -1, -1));

        Amount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Amount.setForeground(new java.awt.Color(23, 22, 22));
        Amount.setText("Cost");
        add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 54, -1, -1));

        In_Date.setForeground(new java.awt.Color(23, 22, 22));
        In_Date.setText("April 2025");
        In_Date.setBackground(new java.awt.Color(0,0,0,1));
        In_Date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        In_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_DateActionPerformed(evt);
            }
        });
        add(In_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 80, 122, -1));

        In_Amount.setForeground(new java.awt.Color(23, 22, 22));
        In_Amount.setText("1200");
        In_Amount.setBackground(new java.awt.Color(0,0,0,1));
        In_Amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        In_Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_AmountActionPerformed(evt);
            }
        });
        add(In_Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 80, 133, -1));

        In_m3Used1.setForeground(new java.awt.Color(23, 22, 22));
        In_m3Used1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        In_m3Used.setBackground(new java.awt.Color(0,0,0,1));
        In_m3Used1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_m3Used1ActionPerformed(evt);
            }
        });
        add(In_m3Used1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 120, -1));

        In_m3Used.setForeground(new java.awt.Color(23, 22, 22));
        In_m3Used.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        In_m3Used.setBackground(new java.awt.Color(0,0,0,1));
        In_m3Used.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_m3UsedActionPerformed(evt);
            }
        });
        add(In_m3Used, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, -1));

        jButton1.setBackground(new java.awt.Color(35, 50, 90));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("+ Add Gas");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 182, 160, -1));

        jPanel2.setBackground(new java.awt.Color(0,0,0,1));

        jLabel12.setForeground(new java.awt.Color(23, 22, 22));
        jLabel12.setText("Pie Graph");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel12)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 330, 190));

        BillHistory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BillHistory.setForeground(new java.awt.Color(23, 22, 22));
        BillHistory.setText("List of Subscription");
        add(BillHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 28));

        kWhUsed1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kWhUsed1.setForeground(new java.awt.Color(23, 22, 22));
        kWhUsed1.setText("Status");
        add(kWhUsed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 120, 28));

        kWhUsed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kWhUsed.setForeground(new java.awt.Color(23, 22, 22));
        kWhUsed.setText("Usage");
        add(kWhUsed, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 120, 120, 28));

        ScrollPane_Water_Bill.setBackground(new java.awt.Color(0,0,0,1));
        ScrollPane_Water_Bill.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPane_Water_Bill.setBorder(null);
        ScrollPane_Water_Bill.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Water_Bill.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel5.setBackground(new java.awt.Color(0,0,0,1));

        jLabel15.setForeground(new java.awt.Color(23, 22, 22));
        jLabel15.setText("Month");
        jLabel15.setBackground(new java.awt.Color(0,0,0,1));

        jLabel17.setForeground(new java.awt.Color(23, 22, 22));
        jLabel17.setText("Cost");
        jLabel17.setBackground(new java.awt.Color(0,0,0,1));

        jLabel18.setForeground(new java.awt.Color(23, 22, 22));
        jLabel18.setText("Usage");
        jLabel18.setBackground(new java.awt.Color(0,0,0,1));

        jLabel19.setForeground(new java.awt.Color(23, 22, 22));
        jLabel19.setText("Status");
        jLabel19.setBackground(new java.awt.Color(0,0,0,1));

        jbtn_Edit.setBackground(new java.awt.Color(226, 149, 90));
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

        jbtn_Delete.setBackground(new java.awt.Color(226, 149, 90));
        jbtn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Delete.setText("Delete");
        jbtn_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Delete.setMaximumSize(new java.awt.Dimension(93, 32));
        jbtn_Delete.setMinimumSize(new java.awt.Dimension(93, 32));
        jbtn_Delete.setPreferredSize(new java.awt.Dimension(93, 32));
        jbtn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_DeleteActionPerformed(evt);
            }
        });

        jbtn_Edit1.setBackground(new java.awt.Color(226, 149, 90));
        jbtn_Edit1.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Edit1.setText("Edit");
        jbtn_Edit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Edit1.setMaximumSize(new java.awt.Dimension(93, 32));
        jbtn_Edit1.setMinimumSize(new java.awt.Dimension(93, 32));
        jbtn_Edit1.setPreferredSize(new java.awt.Dimension(93, 32));
        jbtn_Edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Edit1ActionPerformed(evt);
            }
        });

        jbtn_Delete1.setBackground(new java.awt.Color(226, 149, 90));
        jbtn_Delete1.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Delete1.setText("Delete");
        jbtn_Delete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_Delete1.setMaximumSize(new java.awt.Dimension(93, 32));
        jbtn_Delete1.setMinimumSize(new java.awt.Dimension(93, 32));
        jbtn_Delete1.setPreferredSize(new java.awt.Dimension(93, 32));
        jbtn_Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Delete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addContainerGap(217, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbtn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_Edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtn_Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_Edit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(344, Short.MAX_VALUE))
        );

        ScrollPane_Water_Bill.setViewportView(jPanel5);

        add(ScrollPane_Water_Bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 258, 650, 130));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/background(700x410).png"))); // NOI18N
        Background.setText("jLabel22");
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void In_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_DateActionPerformed

    private void In_m3UsedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_m3UsedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_m3UsedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void In_AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_AmountActionPerformed

    private void In_m3Used1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_m3Used1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_m3Used1ActionPerformed

    private void jbtn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_EditActionPerformed
       
    }//GEN-LAST:event_jbtn_EditActionPerformed

    private void jbtn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_DeleteActionPerformed

    private void jbtn_Edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Edit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_Edit1ActionPerformed

    private void jbtn_Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Delete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_Delete1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BillHistory;
    private javax.swing.JLabel Date;
    private javax.swing.JTextField In_Amount;
    private javax.swing.JTextField In_Date;
    private javax.swing.JTextField In_m3Used;
    private javax.swing.JTextField In_m3Used1;
    private javax.swing.JScrollPane ScrollPane_Water_Bill;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtn_Delete;
    private javax.swing.JButton jbtn_Delete1;
    private javax.swing.JButton jbtn_Edit;
    private javax.swing.JButton jbtn_Edit1;
    private javax.swing.JLabel kWhUsed;
    private javax.swing.JLabel kWhUsed1;
    // End of variables declaration//GEN-END:variables
}
