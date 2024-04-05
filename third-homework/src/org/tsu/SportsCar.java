package org.tsu;

class SportsCar extends Vehicle {
    String maker;

    public SportsCar(String model, int horsepower, int maxSpeed, String manufacturer) {
        super(model, horsepower, maxSpeed);
        this.maker = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + ", maker: " + maker;
    }
}
