package org.example.Vehicle;

import org.example.FareStrategy.ParkingFeeStrategy;

import org.example.CommonEnum.DurationType;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    private ParkingFeeStrategy feeStrategy;

    public Vehicle(String vehicleNumber, String vehicleType, ParkingFeeStrategy feeStrategy) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.feeStrategy = feeStrategy;
    }


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public double calculateFee(int duration, DurationType durationType) {
        return feeStrategy.calculateParkingFee(vehicleType, duration, durationType);
    }
}
