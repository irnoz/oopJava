package org.tsu.interfaces.simulators;

import org.tsu.interfaces.Animals.AnimalInterface;

/**
 * SimulateBuyingAnimalsInterface interface provides buyAnimals function to populate array of animals with bought animals
 */
public interface SimulateBuyingAnimalsInterface {
    /**
     * This function simulates buying animals.
     * @param animalsCount how many animals should be bought
     * @return array of animals that were bought
     */
    AnimalInterface[] buyAnimals(int animalsCount);
}
