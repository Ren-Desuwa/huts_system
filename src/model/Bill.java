/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Ireneo III
 */
public class Bill{
    private int id;
    private String utilityType; // "ELECTRICITY", "WATER", "GAS"
    private LocalDate dueDate;
    private double amount;
    private boolean isPaid;
    
    public Bill(String utilityType,LocalDate dueDate, double amount) {
    	this.utilityType = utilityType;
        this.dueDate = dueDate;
        this.amount = amount;
        this.isPaid = false;
    }
    
    public boolean isOverdue() {
        return !isPaid && LocalDate.now().isAfter(dueDate);
    }

    // Getters only
    public int getId() { return id; }
    public String getUtilityType() { return utilityType; }
    public double getAmount() { return amount; }
    public LocalDate getDueDate() { return dueDate; }
    public boolean isPaid() { return isPaid; }
}
