package org.tsu.interfaces.simulators;

import org.tsu.interfaces.Animals.*;
import java.util.Random;

public class SimulateBuyingAnimals implements SimulateBuyingAnimalsInterface {
    /**
     *
     * @param animalsCount how many animals should be bought
     * @return array of animals that were bought
     */
    @Override
    public AnimalInterface[] buyAnimals(int animalsCount) {
        AnimalInterface[] animals = new AnimalInterface[animalsCount];
        Random random = new Random();
        for (int i = 0; i < animalsCount; i++) {
            int number = random.nextInt(3) + 1;
            switch (number) {
                case 1:
                    animals[i] = new Dog();
                    break;
                case 2:
                    animals[i] = new Cat();
                    break;
                case 3:
                    animals[i] = new Fox();
                    break;
            }
        }
        return animals;
    }
}
