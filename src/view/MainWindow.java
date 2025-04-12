package view;

import controller.DataController;

import java.sql.SQLException;

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
    }
}