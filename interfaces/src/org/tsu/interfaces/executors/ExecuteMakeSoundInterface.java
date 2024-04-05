package org.tsu.interfaces.executors;

import org.tsu.interfaces.Animals.AnimalInterface;

/**
 * ExecuteMakeSoundInterface interface provides abstract execute function to simulate animals making sound
 */
public interface ExecuteMakeSoundInterface {
    /**
     * execute(AnimalInterface[]) function executes makeSound() function of every animal in the array
     * @param animal list of animals
     */
    void execute(AnimalInterface[] animal);
}
