package org.tsu;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Caye", 500, 300, "Porsche"),
                new Bus("Bus Model", 200, 120, "Mercedes"),
                new SportsCar("Sports Car Model", 600, 320, "BMW"),
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }

        vehicles = null;
        System.gc();

        System.out.println("Garbage collector invoked.");
    }
}
