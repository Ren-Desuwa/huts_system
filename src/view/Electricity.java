package view;
import controller.DataController;
import controller.NavigationController;
import java.time.LocalDate;
import model.Bill;

public class Electricity extends javax.swing.JPanel {

    private final NavigationController navigation;
    private final DataController database;
    
    public Electricity(DataController db, NavigationController nav) {
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
        TotalSpent = new javax.swing.JLabel();
        In_kWhUsed = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ScrollPane_Electric_Bill = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        BillHistory = new javax.swing.JLabel();
        kWhUsed = new javax.swing.JLabel();
        Out_totalSpent = new javax.swing.JTextField();
        AveMonthlyCost = new javax.swing.JLabel();
        UsageTrend = new javax.swing.JLabel();
        Out_aveMonthlyCost = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(700, 410));
        setPreferredSize(new java.awt.Dimension(700, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(23, 22, 22));
        Title.setText("Add New Electricity Bill");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 36));

        Date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(23, 22, 22));
        Date.setText("Date");
        add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 54, -1, -1));

        Amount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Amount.setForeground(new java.awt.Color(23, 22, 22));
        Amount.setText("Amount ($)");
        add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 54, -1, -1));

        In_Date.setForeground(new java.awt.Color(23, 22, 22));
        In_Date.setText("2025-05-01");
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

        TotalSpent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TotalSpent.setForeground(new java.awt.Color(23, 22, 22));
        TotalSpent.setText("Total Spent (This Year)");
        add(TotalSpent, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 223, 176, 28));

        In_kWhUsed.setForeground(new java.awt.Color(23, 22, 22));
        In_kWhUsed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        In_kWhUsed.setBackground(new java.awt.Color(0,0,0,1));
        In_kWhUsed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_kWhUsedActionPerformed(evt);
            }
        });
        add(In_kWhUsed, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 154, 261, -1));

        jButton1.setBackground(new java.awt.Color(35, 50, 90));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("+ Add Bill");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 182, 160, -1));

        ScrollPane_Electric_Bill.setBackground(new java.awt.Color(0,0,0,1));
        ScrollPane_Electric_Bill.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPane_Electric_Bill.setBorder(null);
        ScrollPane_Electric_Bill.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Electric_Bill.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(0,0,0,1));

        jLabel5.setForeground(new java.awt.Color(23, 22, 22));
        jLabel5.setText("Date");
        jLabel5.setBackground(new java.awt.Color(0,0,0,1));

        jLabel6.setForeground(new java.awt.Color(23, 22, 22));
        jLabel6.setText("Amount");
        jLabel6.setBackground(new java.awt.Color(0,0,0,1));

        jLabel7.setForeground(new java.awt.Color(23, 22, 22));
        jLabel7.setText("kWh Used");
        jLabel7.setBackground(new java.awt.Color(0,0,0,1));

        jLabel8.setForeground(new java.awt.Color(23, 22, 22));
        jLabel8.setText("notes");
        jLabel8.setBackground(new java.awt.Color(0,0,0,1));

        jLabel9.setForeground(new java.awt.Color(23, 22, 22));
        jLabel9.setText("jLabel9");

        jLabel10.setForeground(new java.awt.Color(23, 22, 22));
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 193, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)
                        .addGap(23, 23, 23))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(159, 159, 159)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(119, 119, 119))
        );

        ScrollPane_Electric_Bill.setViewportView(jPanel1);

        add(ScrollPane_Electric_Bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 258, -1, 130));

        jPanel2.setBackground(new java.awt.Color(0,0,0,1));

        jLabel12.setForeground(new java.awt.Color(23, 22, 22));
        jLabel12.setText("Histograph");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel12)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 190));

        BillHistory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BillHistory.setForeground(new java.awt.Color(23, 22, 22));
        BillHistory.setText("Electric Bill History");
        add(BillHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 28));

        kWhUsed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kWhUsed.setForeground(new java.awt.Color(23, 22, 22));
        kWhUsed.setText("kWh Used (optional)");
        add(kWhUsed, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 120, 138, 28));

        Out_totalSpent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Out_totalSpent.setForeground(new java.awt.Color(23, 22, 22));
        Out_totalSpent.setText("php 520");
        Out_totalSpent.setBackground(new java.awt.Color(0,0,0,1));
        Out_totalSpent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Out_totalSpent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out_totalSpentActionPerformed(evt);
            }
        });
        add(Out_totalSpent, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 257, 138, -1));

        AveMonthlyCost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AveMonthlyCost.setForeground(new java.awt.Color(23, 22, 22));
        AveMonthlyCost.setText("Average Monthly Cost");
        add(AveMonthlyCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 306, 138, 28));

        UsageTrend.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UsageTrend.setForeground(new java.awt.Color(23, 22, 22));
        UsageTrend.setText("Usage Trend");
        add(UsageTrend, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 223, 112, 28));

        Out_aveMonthlyCost.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Out_aveMonthlyCost.setForeground(new java.awt.Color(23, 22, 22));
        Out_aveMonthlyCost.setText("php 120");
        Out_aveMonthlyCost.setBackground(new java.awt.Color(0,0,0,1));
        Out_aveMonthlyCost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Out_aveMonthlyCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out_aveMonthlyCostActionPerformed(evt);
            }
        });
        add(Out_aveMonthlyCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 340, 138, -1));

        jScrollPane1.setBackground(new java.awt.Color(0,0,0,1));
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setBackground(new java.awt.Color(0,0,0,1));

        jLabel15.setForeground(new java.awt.Color(23, 22, 22));
        jLabel15.setText("2%");
        jLabel15.setBackground(new java.awt.Color(0,0,0,1));

        jLabel17.setForeground(new java.awt.Color(23, 22, 22));
        jLabel17.setText("3%");
        jLabel17.setBackground(new java.awt.Color(0,0,0,1));

        jLabel18.setForeground(new java.awt.Color(23, 22, 22));
        jLabel18.setText("6%");
        jLabel18.setBackground(new java.awt.Color(0,0,0,1));

        jLabel19.setForeground(new java.awt.Color(23, 22, 22));
        jLabel19.setText("1%");
        jLabel19.setBackground(new java.awt.Color(0,0,0,1));

        jLabel20.setForeground(new java.awt.Color(23, 22, 22));
        jLabel20.setText("2%");
        jLabel20.setBackground(new java.awt.Color(0,0,0,1));

        jLabel21.setForeground(new java.awt.Color(23, 22, 22));
        jLabel21.setText("4%");
        jLabel21.setBackground(new java.awt.Color(0,0,0,1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 257, -1, 131));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image/background2.png"))); // NOI18N
        Background.setText("jLabel22");
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void In_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_DateActionPerformed

    private void In_kWhUsedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_kWhUsedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_kWhUsedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void In_AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In_AmountActionPerformed

    private void Out_totalSpentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out_totalSpentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Out_totalSpentActionPerformed

    private void Out_aveMonthlyCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out_aveMonthlyCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Out_aveMonthlyCostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JLabel AveMonthlyCost;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BillHistory;
    private javax.swing.JLabel Date;
    private javax.swing.JTextField In_Amount;
    private javax.swing.JTextField In_Date;
    private javax.swing.JTextField In_kWhUsed;
    private javax.swing.JTextField Out_aveMonthlyCost;
    private javax.swing.JTextField Out_totalSpent;
    private javax.swing.JScrollPane ScrollPane_Electric_Bill;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TotalSpent;
    private javax.swing.JLabel UsageTrend;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kWhUsed;
    // End of variables declaration//GEN-END:variables
}
