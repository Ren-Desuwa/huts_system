package view;

import controller.DataController;

import java.sql.SQLException;

<<<<<<< Updated upstream
import javax.swing.*;

public class MainWindow extends JFrame {
    private final DataController dbController;
    private final JTabbedPane tabs = new JTabbedPane();
    
    public MainWindow(DataController dbController) {
    	this.dbController = dbController;
        // Basic window setup
        setTitle("HUTS - House Utility Tracker");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create panels
		InputPanel inputPanel = new InputPanel(dbController, 1); // Hardcoded user ID 1 for testing
		DashboardPanel dashboardPanel = new DashboardPanel(dbController, 1);
		
		// Add tabs
		tabs.add("Input", inputPanel);
		tabs.add("Dashboard", dashboardPanel);
		add(tabs);
        setVisible(true);
=======
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
>>>>>>> Stashed changes
    }
}