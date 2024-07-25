package org.example.parkingProblem;

import org.example.custom.classes.SimpleHashMap;

public class Parking {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(5,5); // a parking lot with 5 spots
        System.out.println(lot.hashCode());

        Car car1 = new Car("ABC123");
        Car car2 = new Car("XYZ789");

        lot.parkCar(car1); // Returns true if the car was successfully parked
        lot.parkCar(car2); // Same as above
        lot.leaveCar(0);


    }
}
