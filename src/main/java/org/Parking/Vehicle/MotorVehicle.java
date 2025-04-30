package org.Parking.Vehicle;

import org.Parking.FareStrategy.ParkingFeeStrategy;

public class MotorVehicle extends Vehicle {
    public MotorVehicle(String licensePlate, String vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
