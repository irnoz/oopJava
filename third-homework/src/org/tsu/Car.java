package org.tsu;

class Car extends Vehicle {
    String maker;

    public Car(String model, int horsepower, int maxSpeed, String manufacturer) {
        super(model, horsepower, maxSpeed);
        this.maker = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + ", maker: " + maker;
    }
}
