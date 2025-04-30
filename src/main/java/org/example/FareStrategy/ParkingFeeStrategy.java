package org.example.FareStrategy;

import org.example.CommonEnum.DurationType;

public interface ParkingFeeStrategy {

    double calculateParkingFee(String vehicleType, int duration, DurationType durationType);
}
