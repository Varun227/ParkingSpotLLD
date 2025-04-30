package org.example.parkingspot;

import org.example.Vehicle.Vehicle;
public class ParkingSpot {
    private String spotNumber;
    private boolean isOccupied;
    private String Vehicle;
    private String spotType;

    public ParkingSpot(String spotNumber, String spotType, String Vehicle,
            boolean isOccupied) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
        this.spotType = spotType;
        this.Vehicle = Vehicle;

    }

    public boolean canParkVehicle(Vehicle vehicle) {
        if (vehicle.getVehicleType().equalsIgnoreCase(spotType)) {
            return true;
        } else {
            return false;
        }
    }

    public String getVehicle() {
        return Vehicle;

    }

    public void ParkVehicle(Vehicle vehicle) {
        if(isOccupied){
            System.out.println("Spot is already occupied.");
        } else {
            if(!canParkVehicle(vehicle)){
                System.out.println("This spot is not suitable for " + vehicle.getVehicleType());
            } else {
                this.Vehicle = vehicle.getVehicleType();
                this.isOccupied = true;
                System.out.println("Vehicle parked successfully.");
            }
        }
    }

    public String getSpotType() {
        return spotType;
    }

    public String getSpotNumber() {
        return spotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupy() {
        this.isOccupied = true;
    }

    public void vacate() {
        this.isOccupied = false;
    }
}
