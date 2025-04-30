package org.Parking.FareStrategy;

import org.Parking.CommonEnum.DurationType;

public interface ParkingFeeStrategy {

    double calculateParkingFee(String vehicleType, int duration, DurationType durationType);
}
