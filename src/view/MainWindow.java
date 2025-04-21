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
        
         // Get the content pane with card layout
    JPanel contentPane = (JPanel) getContentPane();
    CardLayout cardLayout = (CardLayout) contentPane.getLayout();
    
    // Create your panels
    Login loginPanel = new Login(db, null, this);  // No nav controller yet
    
    // Add panels directly to content pane
    contentPane.add(loginPanel, "login");
    
    // Show login panel
    cardLayout.show(contentPane, "login");
    
    // Debug
    System.out.println("Panel count: " + contentPane.getComponentCount());
    System.out.println("Current panel: " + contentPane.getComponent(0).getClass().getName());
        
        contentPanel = Contents;  // Use the Contents panel inside Second
        contentLayout = new CardLayout();
        contentPanel.setLayout(contentLayout);
        
        NavigationController nav;
        nav = new NavigationController(contentPanel);

        // Register each screen (panels you build) under a key:
        nav.register("login", new Login(db, nav, this));
        nav.register("signup", new Signup(db, nav));
        nav.register("dashboard", new DashBoard(db, nav));
        nav.register("electricity", new Electricity(db, nav));
        nav.register("water", new Water(db, nav));
        // …etc for water, gas, signup, etc.
        
         // Show the initial card (First panel with login)
        CardLayout mainLayout = (CardLayout) getContentPane().getLayout();
        mainLayout.show(getContentPane(), "card1"); // Show the First panel
        // Show the initial card:
        nav.show("login");
        System.out.println("Login panel should be visible now");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        First = new javax.swing.JPanel();
        Second = new javax.swing.JPanel();
        NavigationBar = new javax.swing.JPanel();
        Contents = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("House Management");
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(0, 0, 700, 500));
        setLocation(50,50);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(900, 410));
        getContentPane().setLayout(new java.awt.CardLayout());

        First.setBackground(new java.awt.Color(35, 50, 90));
        First.setMinimumSize(new java.awt.Dimension(900, 410));
        First.setPreferredSize(new java.awt.Dimension(900, 410));

        javax.swing.GroupLayout FirstLayout = new javax.swing.GroupLayout(First);
        First.setLayout(FirstLayout);
        FirstLayout.setHorizontalGroup(
            FirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        FirstLayout.setVerticalGroup(
            FirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(First, "card2");

        Second.setBackground(new java.awt.Color(35, 50, 90));

        NavigationBar.setBackground(new java.awt.Color(255, 255, 0));
        NavigationBar.setMinimumSize(new java.awt.Dimension(200, 410));
        NavigationBar.setPreferredSize(new java.awt.Dimension(200, 410));

        javax.swing.GroupLayout NavigationBarLayout = new javax.swing.GroupLayout(NavigationBar);
        NavigationBar.setLayout(NavigationBarLayout);
        NavigationBarLayout.setHorizontalGroup(
            NavigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        NavigationBarLayout.setVerticalGroup(
            NavigationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        Contents.setBackground(new java.awt.Color(35, 50, 90));
        Contents.setMinimumSize(new java.awt.Dimension(900, 410));
        Contents.setPreferredSize(new java.awt.Dimension(700, 410));

        javax.swing.GroupLayout ContentsLayout = new javax.swing.GroupLayout(Contents);
        Contents.setLayout(ContentsLayout);
        ContentsLayout.setHorizontalGroup(
            ContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContentsLayout.setVerticalGroup(
            ContentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout SecondLayout = new javax.swing.GroupLayout(Second);
        Second.setLayout(SecondLayout);
        SecondLayout.setHorizontalGroup(
            SecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondLayout.createSequentialGroup()
                .addComponent(NavigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SecondLayout.setVerticalGroup(
            SecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondLayout.createSequentialGroup()
                .addGroup(SecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NavigationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Second, "card3");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getContentPanel()  { return contentPanel; }
    public CardLayout getContentLayout(){ return contentLayout; }
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contents;
    private javax.swing.JPanel First;
    private javax.swing.JPanel NavigationBar;
    private javax.swing.JPanel Second;
    // End of variables declaration//GEN-END:variables
}
