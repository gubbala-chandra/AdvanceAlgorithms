package org.example.parkingProblem;

public class ParkingSpot {

    private boolean isOccupied;
    private Vehicle parkedCar;
    private int spotNumber;

    public ParkingSpot(int number) {
        this.spotNumber = number;
        this.isOccupied = false;
        this.parkedCar = null;
    }

    public boolean park(Car car) {
        if (!isOccupied) {
            this.parkedCar = car;
            this.isOccupied = true;
            return true;
        }
        return false;
    }

    public boolean leave() {
        if (isOccupied) {
            this.parkedCar = null;
            this.isOccupied = false;
            return true;
        }
        return false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public int getSpotNumber() {
        return spotNumber;
    }
}
