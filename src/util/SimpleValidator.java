package util;

import java.time.LocalDate;

public final class SimpleValidator {
	// Prevent instantiation
	private SimpleValidator() {}

    // Check if a number is positive (for kWh, gallons, etc.)
    public static boolean isPositive(double value) {
        return value > 0;
    }

    // Check if a string is a valid email (basic check)
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$");
    }

    public static boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }
    
    // Check if a date is not in the future
    public static boolean isValidDate(LocalDate date) {
        return !date.isAfter(LocalDate.now());
    }
    
    // Validate utility usage (e.g., no negative values)
    public static boolean isValidUsage(double usage) {
      return usage >= 0;
    }
}