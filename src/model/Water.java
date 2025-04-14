package model;

import java.time.LocalDate;

public class Water extends Utility {
    public Water(double gallons, LocalDate date) {
        super(gallons, date, "WATER");
    }
        // Optional: Add water-specific method
    public double calculateCost(double ratePerGallon) {
    	        return this.value * ratePerGallon;
    }
}	
