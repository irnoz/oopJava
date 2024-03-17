package org.tsu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * this function is not necessary
     * @param array to be printed in a pretty way
     */
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i] + "]");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

        // Sort Array
        int[] array = new int[] {1,23,4,6,43,2,3};
        int[] sortedArray = new ArraySorter().sort(array);
        printArray(array);
        System.out.println(Arrays.toString(sortedArray));

        // Person Class
        Person person = new Person("Jon", "Doe", 35, 1.78, 70.4);
        person.print();
        System.out.println("Is this person over the age of 21? \n" + (person.isOverAge() ? "Yes" : "No"));

        // Count Symbols
        System.out.println(CharacterCounter.count("abdgubdgub", 'b') + " characters found");
    }
}