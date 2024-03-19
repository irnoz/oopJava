package org.tsu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Sort Array
        int[] array = new int[] {1,23,4,6,43,2,3};
        int[] sortedArray = new ArraySorter().sort(array);
        System.out.println("Unsorted array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

        // Person Class
        Person person = new Person("Jon", "Doe", 35, 1.78, 70.4);
        person.print();
        System.out.println("Is this person over the age of 21? \n" + (person.isOverAge() ? "Yes" : "No"));

        // Count Symbols
        String searchString = "Hello World!";
        char characterToSearch = 'l';
        System.out.println(
                CharacterCounter.count(searchString, characterToSearch) +
                        " \"" + String.valueOf(characterToSearch) +
                        "\"s found" + " in \"" + searchString + "\""
        );
    }
}