package view;


import controller.DataController;
import model.Utility;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class DashboardPanel extends JPanel {
    private final JTable recentReadingsTable;
    
    public DashboardPanel(DataController dbController, int userId) {
        setLayout(new BorderLayout());
        
        // Table setup
        String[] columns = {"Type", "Value", "Date"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        recentReadingsTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(recentReadingsTable);
        
        // Load initial data
        try {
            List<Utility> readings = dbController.getRecentReadings(userId);
            for (Utility reading : readings) {
                model.addRow(new Object[]{
                    reading.getType(),
                    reading.getValue(),
                    reading.getDate()
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Failed to load data: " + e.getMessage());
        }
        
        add(scrollPane, BorderLayout.CENTER);
        
        // Refresh button
        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(e -> refreshData(model, dbController, userId));
        add(refreshButton, BorderLayout.SOUTH);
    }

    private void refreshData(DefaultTableModel model, DataController dbController, int userId) {
        model.setRowCount(0); // Clear existing data
        try {
            List<Utility> readings = dbController.getRecentReadings(userId);
            for (Utility reading : readings) {
                model.addRow(new Object[]{
                    reading.getType(),
                    reading.getValue(),
                    reading.getDate()
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Refresh failed: " + ex.getMessage());
        }
    }
}