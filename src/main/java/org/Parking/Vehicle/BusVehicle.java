package org.Parking.Vehicle;

import org.Parking.FareStrategy.ParkingFeeStrategy;

public class BusVehicle extends Vehicle {
    public BusVehicle(String licensePlate, String vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
