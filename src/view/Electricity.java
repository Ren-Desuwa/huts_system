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
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        BillHistory = new javax.swing.JLabel();
        kWhUsed = new javax.swing.JLabel();
        Out_totalSpent = new javax.swing.JTextField();
        AveMonthlyCost = new javax.swing.JLabel();
        UsageTrend = new javax.swing.JLabel();
        Out_aveMonthlyCost = new javax.swing.JTextField();
        ScrollPane_Electric_Bill = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ScrollPane_Usage_Trend = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
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
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel12)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 330, 190));

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

        ScrollPane_Electric_Bill.setBackground(new java.awt.Color(0,0,0,1));
        ScrollPane_Electric_Bill.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPane_Electric_Bill.setBorder(null);
        ScrollPane_Electric_Bill.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Electric_Bill.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel4.setBackground(new java.awt.Color(0,0,0,1));

        jLabel11.setForeground(new java.awt.Color(23, 22, 22));
        jLabel11.setText("Date");
        jLabel11.setBackground(new java.awt.Color(0,0,0,1));

        jLabel13.setForeground(new java.awt.Color(23, 22, 22));
        jLabel13.setText("Amount");
        jLabel13.setBackground(new java.awt.Color(0,0,0,1));

        jLabel14.setForeground(new java.awt.Color(23, 22, 22));
        jLabel14.setText("kWh Used");
        jLabel14.setBackground(new java.awt.Color(0,0,0,1));

        jLabel16.setForeground(new java.awt.Color(23, 22, 22));
        jLabel16.setText("notes");
        jLabel16.setBackground(new java.awt.Color(0,0,0,1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(28, 28, 28)
                .addComponent(jLabel16)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addContainerGap(509, Short.MAX_VALUE))
        );

        ScrollPane_Electric_Bill.setViewportView(jPanel4);

        add(ScrollPane_Electric_Bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 258, -1, 130));

        ScrollPane_Usage_Trend.setBackground(new java.awt.Color(0,0,0,1));
        ScrollPane_Usage_Trend.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPane_Usage_Trend.setBorder(null);
        ScrollPane_Usage_Trend.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane_Usage_Trend.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ScrollPane_Usage_Trend.setMinimumSize(new java.awt.Dimension(5, 5));

        jPanel3.setBackground(new java.awt.Color(0,0,0,1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(23, 22, 22));
        jLabel34.setText("2%");
        jLabel34.setBackground(new java.awt.Color(0,0,0,1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(23, 22, 22));
        jLabel35.setText("4%");
        jLabel35.setBackground(new java.awt.Color(0,0,0,1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(23, 22, 22));
        jLabel36.setText("8%");
        jLabel36.setBackground(new java.awt.Color(0,0,0,1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(23, 22, 22));
        jLabel37.setText("3%");
        jLabel37.setBackground(new java.awt.Color(0,0,0,1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(23, 22, 22));
        jLabel38.setText("5%");
        jLabel38.setBackground(new java.awt.Color(0,0,0,1));

        jLabel39.setForeground(new java.awt.Color(23, 22, 22));
        jLabel39.setText("Month of January");
        jLabel39.setBackground(new java.awt.Color(0,0,0,1));

        jLabel40.setForeground(new java.awt.Color(23, 22, 22));
        jLabel40.setText("Month of Febuary");
        jLabel40.setBackground(new java.awt.Color(0,0,0,1));

        jLabel41.setForeground(new java.awt.Color(23, 22, 22));
        jLabel41.setText("Month of March");
        jLabel41.setBackground(new java.awt.Color(0,0,0,1));

        jLabel42.setForeground(new java.awt.Color(23, 22, 22));
        jLabel42.setText("Month of April");
        jLabel42.setBackground(new java.awt.Color(0,0,0,1));

        jLabel43.setForeground(new java.awt.Color(23, 22, 22));
        jLabel43.setText("Month of May");
        jLabel43.setBackground(new java.awt.Color(0,0,0,1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel41))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel39))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel40))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel41))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel42))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel43))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        ScrollPane_Usage_Trend.setViewportView(jPanel3);

        add(ScrollPane_Usage_Trend, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 150, 130));

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
    private javax.swing.JScrollPane ScrollPane_Usage_Trend;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TotalSpent;
    private javax.swing.JLabel UsageTrend;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel kWhUsed;
    // End of variables declaration//GEN-END:variables
}
