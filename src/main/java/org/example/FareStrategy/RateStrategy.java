package org.example.FareStrategy;

import org.example.CommonEnum.DurationType;

public class RateStrategy implements ParkingFeeStrategy {

    private double hourlyRate = 20.0;
    private double dailyRate = 250.0;

    public RateStrategy(double hourlyRate, double dailyRate) {
        this.hourlyRate = hourlyRate;
        this.dailyRate = dailyRate;
    }

    public RateStrategy() {

    }

    @Override
    public double calculateParkingFee(String vehicleType, int duration, DurationType durationType) {
        if (durationType == DurationType.HOURS) {
            return duration * hourlyRate;
        } else if (durationType == DurationType.DAYS) {
            return duration * dailyRate;
        }
        return 0;
    }
}
