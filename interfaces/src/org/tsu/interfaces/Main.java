package org.tsu.interfaces;

import org.tsu.interfaces.Animals.*;
import org.tsu.interfaces.executor.*;
import org.tsu.interfaces.simulator.*;

public class Main {
    public static void main(String[] args) {
        SimulateBuyingAnimalsInterface simulator = new SimulateBuyingAnimals();
        ExecuteMakeSoundInterface executor = new ExecuteMakeSound();

        AnimalInterface[] animals = simulator.buyAnimals(10);
        executor.execute(animals);
    }
}
