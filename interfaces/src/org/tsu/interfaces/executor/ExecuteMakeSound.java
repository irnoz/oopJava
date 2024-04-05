package org.tsu.interfaces.executor;

import org.tsu.interfaces.Animals.AnimalInterface;

public class ExecuteMakeSound implements ExecuteMakeSoundInterface {
    @Override
    public void execute(AnimalInterface[] animals) {
        for (AnimalInterface animal: animals) {
            animal.makeSound();
        }
    }
}
