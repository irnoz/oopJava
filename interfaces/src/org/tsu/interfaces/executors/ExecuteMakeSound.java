package org.tsu.interfaces.executors;

import org.tsu.interfaces.Animals.AnimalInterface;

public class ExecuteMakeSound implements ExecuteMakeSoundInterface {
    @Override
    public void execute(AnimalInterface[] animals) {
        for (AnimalInterface animal: animals) {
            animal.makeSound();
        }
    }
}
