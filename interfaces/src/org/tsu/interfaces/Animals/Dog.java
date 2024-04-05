package org.tsu.interfaces.Animals;

public class Dog implements AnimalInterface {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
