package model;

import java.time.LocalDate;

public class Electricity extends Utility {
    public Electricity(double kwh, LocalDate date) {
        super(kwh, date, "ELECTRICITY");
    }

    // Optional: Add electricity-specific method
    public double calculateCost(double ratePerKwh) {
        return this.value * ratePerKwh;
    }
}
