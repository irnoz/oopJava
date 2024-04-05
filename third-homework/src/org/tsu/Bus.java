package org.tsu;


class Bus extends Vehicle {
    String maker;

    public Bus(String model, int horsepower, int maxSpeed, String manufacturer) {
        super(model, horsepower, maxSpeed);
        this.maker = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + ", maker: " + maker;
    }
}