package org.Parking.Vehicle;

import org.Parking.FareStrategy.ParkingFeeStrategy;

public class CarVehicle extends Vehicle {
    public CarVehicle(String licensePlate, String vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
