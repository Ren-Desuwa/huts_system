package model;

import java.time.LocalDate;

public class Gas extends Utility {
    public Gas(double cubicMeters, LocalDate date) {
        super(cubicMeters, date, "GAS");
    }

	// Optional: Add gas-specific method
	public double calculateCost(double ratePerCubicMeter) {
		return this.value * ratePerCubicMeter;
	}
}