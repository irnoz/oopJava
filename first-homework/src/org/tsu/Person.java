package org.tsu;

public class Person {

    String firstName;
    String lastName;
    int age;
    double height;
    double weight;

    public Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void print() {
        System.out.println("Persons firstname is " + firstName);
        System.out.println("Persons lastname is " + lastName);
        System.out.println("Persons age is " + age);
        System.out.println("Persons height is " + height);
        System.out.println("Persons weight is " + weight);
    }

    public boolean isOverAge() {
        return age >= 21;
    }
}
