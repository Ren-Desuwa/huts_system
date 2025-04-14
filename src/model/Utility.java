package model;

import java.time.LocalDate;

public class Utility {
    protected int id;
    protected double value; // kWh/gallons/m³
    protected LocalDate date;
    protected String type; // "ELECTRICITY", "WATER", "GAS"
    
    public Utility(double value, LocalDate date, String type) {
        this.value = value;
        this.date = date;
        this.type = type;
    }
    
    //getters and setters
    public double getValue() { return value; }
    public LocalDate getDate() { return date; }
    public String getType() { return type; }
    public int getId() { return id; }
}
