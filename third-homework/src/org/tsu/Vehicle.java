package org.tsu;

class Vehicle extends Object {
    String model;
    int horsepower;
    int maxSpeed;

    {
        model = "Initialized Model";
    }

    public Vehicle(String model, int horsepower, int maxSpeed) {
        this.model = model;
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Horsepower: " + horsepower + ", Max Speed: " + maxSpeed;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + this + " is garbage collected.");
    }
}
