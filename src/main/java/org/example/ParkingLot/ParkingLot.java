package org.example.ParkingLot;
import java.util.*;


import org.example.parkingspot.ParkingSpot;
import org.example.Vehicle.Vehicle;

public class ParkingLot {
    private String name;
    private List<ParkingSpot> parkingSpots;

    public ParkingLot(List<ParkingSpot> parkingSpots) {
        this.name = "Default Parking Lot";
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findAvailableSpot(String vehicleType) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied() && spot.getSpotType().equals(vehicleType)) {
                return spot; // Found an available spot for the vehicle type
            }
        }
        return null; // No available spot found for the given vehicle type
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if (spot != null) {
            spot.ParkVehicle(vehicle); // Mark the spot as occupied
            System.out.println(
                    "Vehicle parked successfully in spot: " + spot.getSpotNumber());
            return spot;
        }
        System.out.println(
                "No parking spots available for " + vehicle.getVehicleType() + "!");
        return null;
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }


    public void vacateSpot(ParkingSpot parkingSpot, Vehicle vehicle){
        System.out.println("Invalid operation! Either the spot is already vacant "
                + "or the vehicle does not match.");
    }

    public ParkingLot(String name, List<ParkingSpot> parkingSpots) {
        this.name = name;
        this.parkingSpots = parkingSpots;
    }


    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }


}






