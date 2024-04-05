package org.tsu;

public class Person extends Human {

    public Person(String firstName, String lastName, int age, String favouriteFood) {
        super(firstName, lastName, age, favouriteFood);
    }

    @Override
    void eatFood(String foodName) throws InvalidArgumentException {
        if (foodName == null) {
            throw new InvalidArgumentException("Error: Food name can not be null!");
        }
        if (foodName.equals("")) {
            throw new InvalidArgumentException("Error: Food name can not be empty!");
        }

        String foodMessage = String
                .format("%s %s is eating %s",
                        this.getFirstName(),
                        this.getLastName(),
                        foodName
                );

        System.out.println(foodMessage);
    }

    @Override
    void sayHelloTo(Human anotherHuman) throws InvalidArgumentException {
        String firstName = anotherHuman.getFirstName();

        if (firstName == null) {
            throw new InvalidArgumentException("Error: Another persons name can not be null!");
        }
        if (firstName.equals("")) {
            throw new InvalidArgumentException("Error: Another persons name can not be empty!");
        }

        String helloMessage = String.format("Hello %s!", firstName);

        System.out.println(helloMessage);
    }
}
