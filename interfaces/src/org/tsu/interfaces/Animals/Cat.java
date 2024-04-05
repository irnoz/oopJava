package org.tsu.interfaces.Animals;

public class Cat implements AnimalInterface {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
