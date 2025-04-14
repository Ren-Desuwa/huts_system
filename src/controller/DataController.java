package controller;

import model.Electricity;
import model.Water;
import model.Utility;
import model.Gas;
import model.Bill;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataController {
    private final Connection conn;

    // Initialize database connection and create tables
    public DataController(String dbPath) throws SQLException {
        conn = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
        createTables();
    }

    // Create tables if they don't exist
    private void createTables() throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            // Users table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS users (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "username TEXT UNIQUE NOT NULL," +
                    "password TEXT NOT NULL)");

            // Readings table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS readings (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "user_id INTEGER NOT NULL," +
                    "type TEXT NOT NULL," +
                    "value REAL NOT NULL," +
                    "reading_date TEXT NOT NULL," +
                    "FOREIGN KEY(user_id) REFERENCES users(id))");

            // Bills table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS bills (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "user_id INTEGER NOT NULL," +
                    "utility_type TEXT NOT NULL," +
                    "amount REAL NOT NULL," +
                    "due_date TEXT NOT NULL," +
                    "is_paid INTEGER DEFAULT 0)");
        }
    }

    // === USER OPERATIONS ===
    public boolean authenticateUser(String username, String password) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            return pstmt.executeQuery().next(); // Returns true if user exists
        }
    }

    // === READINGS OPERATIONS ===
    public void saveReading(Utility reading, int userId) throws SQLException {
        String sql = "INSERT INTO readings (user_id, type, value, reading_date) VALUES (?,?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setString(2, reading.getType());
            pstmt.setDouble(3, reading.getValue());
            pstmt.setString(4, reading.getDate().toString());
            pstmt.executeUpdate();
        }
    }

    public List<Utility> getRecentReadings(int userId) throws SQLException {
        List<Utility> readings = new ArrayList<>();
        String sql = "SELECT * FROM readings WHERE user_id = ? ORDER BY reading_date DESC LIMIT 10";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String type = rs.getString("type");
                double value = rs.getDouble("value");
                LocalDate date = LocalDate.parse(rs.getString("reading_date"));
                
                Utility reading = switch (type) {
                    case "ELECTRICITY" -> new Electricity(value, date);
                    case "WATER" -> new Water(value, date);
                    case "GAS" -> new Gas(value, date);
                    default -> throw new SQLException("Unknown utility type");
                };
                readings.add(reading);
            }
        }
        return readings;
    }

    // === BILL OPERATIONS ===
    public void addBill(Bill bill, int userId) throws SQLException {
        String sql = "INSERT INTO bills (user_id, utility_type, amount, due_date) VALUES (?,?,?,?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setString(2, bill.getUtilityType());
            pstmt.setDouble(3, bill.getAmount());
            pstmt.setString(4, bill.getDueDate().toString());
            pstmt.executeUpdate();
        }
    }

    // Close connection (call when app exits)
    public void close() throws SQLException {
        if (conn != null) conn.close();
    }
}
