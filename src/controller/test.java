package controller;

import java.sql.*;

public class test {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:sqlite:..\\..\\database\\huts.db";
		
		try {

			Connection connection = DriverManager.getConnection(jdbcUrl);
			Statement statement = connection.createStatement();
			
			ResultSet result_users = statement.executeQuery("SELECT * FROM users");
			
			System.out.println("users table\n");
			
			int id = 1;
			while (result_users.next()) {
				System.out.printf("User_%d %s\n", id, result_users.getString("username"));
				System.out.printf("pass_%d %s\n\n", id++, result_users.getString("password"));
			}
			
			result_users.close();
			
			System.out.println("--------------------------------------------------");
			System.out.println("readings table\n");
			
			ResultSet result_readings = statement.executeQuery("SELECT * FROM readings");
			
			id = 1;
			while (result_readings.next()) {
				System.out.printf("User %s\n", result_readings.getString("user_id"));
				System.out.printf("type %s\n", result_readings.getString("type"));
				System.out.printf("value %s\n", result_readings.getString("value"));
				System.out.printf("reading_date %s\n\n", result_readings.getString("reading_date"));
			}
			
			result_readings.close();
			
			System.out.println("--------------------------------------------------");
			System.out.println("bills table\n");
			
			ResultSet result_bills = statement.executeQuery("SELECT * FROM bills");
			
			id = 1;
			while (result_bills.next()) {
				System.out.printf("User %s\n", result_bills.getString("user_id"));
				System.out.printf("utility_type %s\n", result_bills.getString("utility_type"));
				System.out.printf("amount %s\n", result_bills.getString("amount"));
				System.out.printf("due_date %s\n", result_bills.getString("due_date"));
				System.out.printf("is_paid %s\n\n", result_bills.getString("is_paid"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
