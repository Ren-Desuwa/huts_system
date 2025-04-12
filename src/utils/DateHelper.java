package utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class DateHelper {
	private DateHelper() {}
	
    // Database format: YYYY-MM-DD (e.g., "2023-10-25")
    private static final DateTimeFormatter DB_FORMATTER = 
        DateTimeFormatter.ISO_DATE;

    // UI format: Oct 25, 2023
    private static final DateTimeFormatter UI_FORMATTER = 
        DateTimeFormatter.ofPattern("MMM dd, yyyy");

    // Convert LocalDate → Database string
    public static String toDatabaseFormat(LocalDate date) {
        return date.format(DB_FORMATTER);
    }

    // Convert Database string → LocalDate
    public static LocalDate fromDatabaseFormat(String dateStr) {
        return LocalDate.parse(dateStr, DB_FORMATTER);
    }

    // Convert LocalDate → UI string
    public static String toUiFormat(LocalDate date) {
        return date.format(UI_FORMATTER);
    }
}