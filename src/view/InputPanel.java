package view;


import controller.DataController;
import model.*;
import utils.SimpleValidator;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.sql.SQLException;

public class InputPanel extends JPanel {
    private final DataController dbController;
    private final int userId;
    
    // UI Components
    private JComboBox<String> typeDropdown;
    private JTextField valueField;
    private JButton saveButton;

    public InputPanel(DataController dbController, int userId) {
        this.dbController = dbController;
        this.userId = userId;
        setLayout(new GridLayout(4, 2));
        
        // Dropdown for utility type
        add(new JLabel("Utility Type:"));
        typeDropdown = new JComboBox<>(new String[]{"ELECTRICITY", "WATER", "GAS"});
        add(typeDropdown);
        
        // Value input
        add(new JLabel("Usage Value:"));
        valueField = new JTextField();
        add(valueField);
        
        // Save button
        saveButton = new JButton("Save");
        saveButton.addActionListener(e -> saveReading());
        add(saveButton);
    }

    private void saveReading() {
        try {
            // Get input values
            String type = (String) typeDropdown.getSelectedItem();
            double value = Double.parseDouble(valueField.getText());
            
            // Validate input
            if (!SimpleValidator.isPositive(value)) {
                JOptionPane.showMessageDialog(this, "Value must be positive!");
                return;
            }
            
            // Create utility object
            Utility reading = switch (type) {
                case "ELECTRICITY" -> new Electricity(value, LocalDate.now());
                case "WATER" -> new Water(value, LocalDate.now());
                case "GAS" -> new Gas(value, LocalDate.now());
                default -> throw new IllegalArgumentException("Invalid type");
            };
            
            // Save to database
            dbController.saveReading(reading, userId);
            JOptionPane.showMessageDialog(this, "Saved successfully!");
            valueField.setText(""); // Clear input
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid number format");
        } catch (SQLException | IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}