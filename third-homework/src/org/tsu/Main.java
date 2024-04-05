package org.tsu;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Caye", 300, 230, "Porsche"),
                new Bus("Bus Model", 100, 150, "Mercedes"),
                new SportsCar("Sports Car Model", 5000, 350, "BMW"),
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }

        vehicles = null;
        System.gc();

        System.out.println("Garbage collector invoked.");
    }
}
