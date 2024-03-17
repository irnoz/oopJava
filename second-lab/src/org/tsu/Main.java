package org.tsu;

import java.util.Arrays;

public class Main {

    public static void main(String [] args) {

        // Sort Array;
        int[] array = {16, 15, 4, 42, 8, 23};
        System.out.println(Arrays.toString(array));
        array = Sorter.sort(array);
        System.out.println(Arrays.toString(array));

        // Person Class
        Person jonDoe = new Person("Jon", "Doe", 30, 70.0, 1.78);
        jonDoe.printInfo();
        jonDoe.printIsOldEnoughToDrink();

        // Counter Class

        System.out.println(Counter.getOccurrencesOf('l', "helloworldbloble"));
    }

}
