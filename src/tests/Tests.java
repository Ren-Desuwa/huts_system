/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tests;

import java.time.LocalDate;
import model.*;
import util.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tests {
    private final List<String> errors = new ArrayList<>();
    private final List<String> successes = new ArrayList<>();

    // Returns true if there are no errors, false otherwise
    public boolean getStatus() {
        return errors.isEmpty();
    }

    // Prints out any errors encountered during tests
    public void printErrors() {
        for (String error : errors) {
            System.out.println("X " + error);
        }
    }

    // Prints out successful tests
    public void printSuccesses() {
        for (String success : successes) {
            System.out.println("/ " + success);
        }
    }

    // Runs all tests
    public void runAll() {
        try {
            testBillOverdue();
            testBillValues();
            testUtilityValues();
            testUtilityCalculations();
            testSimpleValidator();
            testSimpleValidatorUsage();
            testDateHelper();
            testUser();
        } catch (Exception e) {
            errors.add("Unexpected error: " + e.getMessage());
        }
    }

    // Test for overdue logic in Bill
    private void testBillOverdue() {
        Bill bill = new Bill("ELECTRICITY", LocalDate.now().minusDays(5), 100.0);
        if (!bill.isOverdue()) {
            errors.add("Bill should be overdue but isn't.");
        } else {
            successes.add("Bill correctly marked as overdue.");
        }

        Bill futureBill = new Bill("GAS", LocalDate.now().plusDays(3), 90.0);
        if (futureBill.isOverdue()) {
            errors.add("Bill shouldn't be overdue but is.");
        } else {
            successes.add("Bill correctly marked as not overdue.");
        }
    }

    // Test that Bill getters return correct values
    private void testBillValues() {
        LocalDate due = LocalDate.now().plusDays(10);
        Bill bill = new Bill("WATER", due, 55.55);
        if (!bill.getUtilityType().equals("WATER")) {
            errors.add("Bill utility type should be WATER.");
        } else {
            successes.add("Bill utility type is correct.");
        }
        if (!bill.getDueDate().equals(due)) {
            errors.add("Bill due date is incorrect.");
        } else {
            successes.add("Bill due date is correct.");
        }
        if (bill.getAmount() != 55.55) {
            errors.add("Bill amount is incorrect.");
        } else {
            successes.add("Bill amount is correct.");
        }
        if (bill.isPaid()) {
            errors.add("Bill should not be marked as paid by default.");
        } else {
            successes.add("Bill default paid status is correct.");
        }
    }

    // Test that utility constructors correctly assign values and types
    private void testUtilityValues() {
        LocalDate date = LocalDate.of(2023, 1, 1);

        Electricity e = new Electricity(200, date);
        if (!e.getType().equals("ELECTRICITY")) {
            errors.add("Electricity utility type should be ELECTRICITY.");
        } else {
            successes.add("Electricity utility type is correct.");
        }
        if (e.getValue() != 200) {
            errors.add("Electricity value is incorrect.");
        } else {
            successes.add("Electricity value is correct.");
        }
        if (!e.getDate().equals(date)) {
            errors.add("Electricity date is incorrect.");
        } else {
            successes.add("Electricity date is correct.");
        }

        Water w = new Water(300, date);
        if (!w.getType().equals("WATER")) {
            errors.add("Water utility type should be WATER.");
        } else {
            successes.add("Water utility type is correct.");
        }
        if (w.getValue() != 300) {
            errors.add("Water value is incorrect.");
        } else {
            successes.add("Water value is correct.");
        }
        if (!w.getDate().equals(date)) {
            errors.add("Water date is incorrect.");
        } else {
            successes.add("Water date is correct.");
        }

        Gas g = new Gas(150, date);
        if (!g.getType().equals("GAS")) {
            errors.add("Gas utility type should be GAS.");
        } else {
            successes.add("Gas utility type is correct.");
        }
        if (g.getValue() != 150) {
            errors.add("Gas value is incorrect.");
        } else {
            successes.add("Gas value is correct.");
        }
        if (!g.getDate().equals(date)) {
            errors.add("Gas date is incorrect.");
        } else {
            successes.add("Gas date is correct.");
        }
    }

    // Test cost calculations for each utility type
    private void testUtilityCalculations() {
        Electricity e = new Electricity(100, LocalDate.now());
        double costE = e.calculateCost(0.10);
        if (Math.abs(costE - 10.0) > 0.001) {
            errors.add("Electricity cost calculation failed. Expected 10.0, got " + costE);
        } else {
            successes.add("Electricity cost calculation is correct.");
        }

        Gas g = new Gas(50, LocalDate.now());
        double costG = g.calculateCost(0.20);
        if (Math.abs(costG - 10.0) > 0.001) {
            errors.add("Gas cost calculation failed. Expected 10.0, got " + costG);
        } else {
            successes.add("Gas cost calculation is correct.");
        }

        Water w = new Water(1000, LocalDate.now());
        double costW = w.calculateCost(0.001);
        if (Math.abs(costW - 1.0) > 0.001) {
            errors.add("Water cost calculation failed. Expected 1.0, got " + costW);
        } else {
            successes.add("Water cost calculation is correct.");
        }
    }

    // Test validations in SimpleValidator (email, positive, date)
    private void testSimpleValidator() {
        if (!SimpleValidator.isPositive(5)) {
            errors.add("Positive validator failed for a positive number.");
        } else {
            successes.add("Positive validator works for positive number.");
        }
        if (SimpleValidator.isPositive(-1)) {
            errors.add("Positive validator passed for a negative number.");
        } else {
            successes.add("Negative number correctly failed positive validator.");
        }
        if (!SimpleValidator.isValidEmail("test@example.com")) {
            errors.add("Email validator failed for a valid email.");
        } else {
            successes.add("Email validator works for valid email.");
        }
        if (SimpleValidator.isValidEmail("not-email")) {
            errors.add("Invalid email passed the validator.");
        } else {
            successes.add("Invalid email correctly failed validation.");
        }
        if (!SimpleValidator.isValidDate(LocalDate.now())) {
            errors.add("Today's date should be valid.");
        } else {
            successes.add("Today's date is valid.");
        }
        if (SimpleValidator.isValidDate(LocalDate.now().plusDays(1))) {
            errors.add("Future date should be invalid.");
        } else {
            successes.add("Future date correctly marked as invalid.");
        }
    }

    // Test utility usage validation
    private void testSimpleValidatorUsage() {
        if (!SimpleValidator.isValidUsage(0)) {
            errors.add("Usage of 0 should be valid.");
        } else {
            successes.add("Usage of 0 is valid.");
        }
        if (!SimpleValidator.isValidUsage(50)) {
            errors.add("Usage of 50 should be valid.");
        } else {
            successes.add("Usage of 50 is valid.");
        }
        if (!SimpleValidator.isValidUsage(100.5)) {
            errors.add("Usage of 100.5 should be valid.");
        } else {
            successes.add("Usage of 100.5 is valid.");
        }
        if (SimpleValidator.isValidUsage(-10)) {
            errors.add("Negative usage should be invalid.");
        } else {
            successes.add("Negative usage correctly marked invalid.");
        }
    }

    // Test date formatting in DateHelper
    private void testDateHelper() {
        LocalDate date = LocalDate.of(2023, 10, 25);
        if (!DateHelper.toDatabaseFormat(date).equals("2023-10-25")) {
            errors.add("DateHelper.toDatabaseFormat failed.");
        } else {
            successes.add("DateHelper.toDatabaseFormat is correct.");
        }
        if (!DateHelper.toUiFormat(date).equals("Oct 25, 2023")) {
            errors.add("DateHelper.toUiFormat failed.");
        } else {
            successes.add("DateHelper.toUiFormat is correct.");
        }
    }

    // Test that User getters work correctly
    private void testUser() {
        User u = new User("john", "secret");
        if (!u.getUsername().equals("john")) {
            errors.add("User username getter failed.");
        } else {
            successes.add("User username getter is correct.");
        }
        if (!u.getPassword().equals("secret")) {
            errors.add("User password getter failed.");
        } else {
            successes.add("User password getter is correct.");
        }
    }
}
