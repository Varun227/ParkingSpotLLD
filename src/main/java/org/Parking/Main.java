package org.Parking;

import org.Parking.FareStrategy.RateStrategy;
import org.Parking.Vehicle.Vehicle;
import org.Parking.parkingspot.ParkingSpot;

import org.Parking.FareStrategy.ParkingFeeStrategy;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //TIP <b>Learn more</b> about IntelliJ IDEA code style settings, including how to save your

        List<ParkingSpot> parkingSpots = new ArrayList<>();
        ParkingFeeStrategy feeStrategy = new RateStrategy();

        parkingSpots.add(new ParkingSpot("1", "Car", "Car", false));

        parkingSpots.add(new ParkingSpot("2", "Bike", "Bike", false));

        parkingSpots.add(new ParkingSpot("3", "Truck", "Truck", false));

        ParkingSpot parkingSpot = new ParkingSpot("1", "Car", "Car", false);

        // Create a vehicle
        Vehicle vehicle = new Vehicle("ABCD1234", "Car", feeStrategy);
        // Check if the vehicle can park in the spot
        if (parkingSpot.canParkVehicle(vehicle)) {
            System.out.println("Vehicle can park in this spot.");
        } else {
            System.out.println("Vehicle cannot park in this spot.");
        }

        // Park the vehicle
        parkingSpot.ParkVehicle(vehicle);
        // Check if the spot is occupied
        if (parkingSpot.isOccupied()) {
            System.out.println("The spot is now occupied.");
        } else {
            System.out.println("The spot is still vacant.");
        }
    }
}