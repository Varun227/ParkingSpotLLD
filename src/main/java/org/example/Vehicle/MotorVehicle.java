package org.example.Vehicle;

import org.example.FareStrategy.ParkingFeeStrategy;

public class MotorVehicle extends Vehicle {
    public MotorVehicle(String licensePlate, String vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
