package org.example.parkingProblem;

public class ParkingLot {

    private ParkingSpot[] spots;

    public ParkingLot(int carSpots, int bikeSpots) {
        spots = new ParkingSpot[carSpots+bikeSpots];
        for (int i = 0; i < carSpots; i++) {
            spots[i] = new ParkingSpot(i);
        }
        for(int i=carSpots; i< carSpots+bikeSpots; i++) {
            spots[i] = new ParkingSpot(i);
        }
    }

    public boolean parkCar(Car car) {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied()) {
                return spot.park(car);
            }
        }
        return false; // Lot full
    }

    public boolean leaveCar(int spotNumber) {
        if (spotNumber >= 0 && spotNumber < spots.length) {
            return spots[spotNumber].leave();
        }
        return false;
    }
}
