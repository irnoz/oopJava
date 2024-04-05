package org.tsu;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Jon", "Doe", 35, "Banana"),
                new Person("Jonathan", "Dalton", 30, null),
                new Person("", "", 0, "")
        };

        for (int i = 0; i < people.length; i++) {
            for (int j = i + 1; j < people.length; j++) {
                Person firstPerson = people[i];
                Person secondPerson = people[j];

                System.out.println("First person Data: " + firstPerson);
                System.out.println("Second person Data: " + secondPerson);

                try {
                    firstPerson.eatFood(firstPerson.getFavouriteFood());
                } catch (Exception invalidArgumentException) {
                    System.out.println(invalidArgumentException); // this is not necessary, but added for clarity
                    invalidArgumentException.printStackTrace();
                }

                try {
                    firstPerson.sayHelloTo(secondPerson);
                } catch (Exception invalidArgumentException) {
                    System.out.println(invalidArgumentException); // this is not necessary, but added for clarity
                    invalidArgumentException.printStackTrace();
                } finally {
                    System.out.format("End of iteration %d\n\n", (i + j) );
                }
            }
        }
    }
}
