package org.example.Vehicle;

import org.example.FareStrategy.ParkingFeeStrategy;

public class BusVehicle extends Vehicle {
    public BusVehicle(String licensePlate, String vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
