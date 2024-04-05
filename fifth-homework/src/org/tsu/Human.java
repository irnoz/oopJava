package org.tsu;

public abstract class Human {
    private String firstName;
    private String lastName;
    private int age;
    private String favouriteFood;

    public Human(String firstName, String lastName, int age, String favouriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favouriteFood = favouriteFood;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    abstract void eatFood(String foodName) throws InvalidArgumentException;
    abstract void sayHelloTo(Human anotherHuman) throws InvalidArgumentException;

    @Override
    public String toString() {
        return "Human [" +
                "firstName = '" + (firstName == null || firstName.isEmpty() ? "NA" : firstName) + '\'' +
                ", lastName = '" + (lastName == null || lastName.isEmpty() ? "NA" : lastName) + '\'' +
                ", age = " + (age <= 0 ? "NA" : age) +
                ", favourite food = " + (favouriteFood == null || favouriteFood.isEmpty() ? "NA" : favouriteFood) +
                ']';
    }
}
