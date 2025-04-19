package view;

import controller.DataController;
import controller.NavigationController;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public final class MainWindow extends javax.swing.JFrame {
    
    private final JPanel contentPanel;
    private final CardLayout contentLayout;
   
    public MainWindow(DataController db) {
        initComponents(); 
        
        contentPanel  = (JPanel) getContentPane();
        contentLayout = (CardLayout) contentPanel.getLayout();
        
        NavigationController nav;
        nav = new NavigationController(contentPanel);

        // Register each screen (panels you build) under a key:
        nav.register("login", new Login(db, nav));
        nav.register("signup", new Signup(db, nav));
        nav.register("dashboard", new DashBoard(db, nav));
        nav.register("electricity", new Electricity(db, nav));
        nav.register("water", new Water(db, nav));
        
        // …etc for water, gas, signup, etc.

        // Show the initial card:
        nav.show("login");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("House Management");
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(0, 0, 700, 500));
        setLocation(50,50);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(900, 410));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(35, 50, 90));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 410));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 410));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getContentPanel()  { return contentPanel; }
    public CardLayout getContentLayout(){ return contentLayout; }
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
