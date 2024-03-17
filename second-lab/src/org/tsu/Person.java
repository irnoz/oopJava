package org.tsu;

public class Person {
    String firstName;
    String lastName;
    int age;
    double weight;
    double height;

    public Person() { }

    public Person(String firstName, String lastName, int age, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    private boolean isOldEnoughToDrink() {
        return age >= 21;
    }

    void printIsOldEnoughToDrink() {
        System.out.print("This person ");
        System.out.print(isOldEnoughToDrink() ? "is " : "is not ");
        System.out.println("old enough to drink");

    }

    void printInfo() {
        System.out.println("This persons first name is " + firstName);
        System.out.println("This persons last name is " + lastName);
        System.out.println("This persons age is " + age);
        System.out.println("This persons weight is " + weight);
        System.out.println("This persons height is " + height);
    }
}
