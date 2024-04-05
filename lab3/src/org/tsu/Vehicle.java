package org.tsu;

import java.sql.SQLOutput;

public class Vehicle {
    String model;

    int horsePower;
    int maxSpeed;

    {
        model = "generic model";
    }

    public Vehicle() {
        super();
    }

    public Vehicle(String model, String maker, int horsePower, int maxSpeed) {
        this.model = model;

        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

class Car extends Vehicle {
    String maker;

    public Car(String model, String maker, int horsePower, int maxSpeed) {
        super(model, maker, horsePower, maxSpeed);
        this.maker = maker;
        System.out.println(this.maker);
    }

    @Override
    public String toString() {
        return super.toString() + "SportsCar{" +
                "maker='" + this.maker + '\'' +
                '}';
    }

}

class Bus extends Vehicle {
    String maker;

    public Bus(String model, String maker, int horsePower, int maxSpeed) {
        super(model, maker, horsePower, maxSpeed);
        this.maker = "Ford";
    }

    @Override
    public String toString() {
        return super.toString() + "SportsCar{" +
                "maker='" + maker + '\'' +
                '}';
    }
}
class SportsCar extends Vehicle {
    String maker;

    public SportsCar(String model, String maker, int horsePower, int maxSpeed) {
        super(model, maker, horsePower, maxSpeed);
        this.maker = "BMW";
    }

    @Override
    public String toString() {
        return super.toString() + "SportsCar{" +
                "maker='" + maker + '\'' +
                '}';
    }
}

