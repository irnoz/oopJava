package org.tsu;

public class Main {

    public static void printPyramid(char symbol, int height) {
        StringBuilder pyramid = new StringBuilder();

        for (int i = 1; i <= height; i++) {
            pyramid.append(" ".repeat(height - i));
            pyramid.append(String.valueOf(symbol).repeat(2 * i - 1));
            pyramid.append("\n");
        }

        System.out.println(pyramid.toString());
    }

    public static void main(String[] args) {
        // Class Person
        Person jonDoe = new Person("Jon Doe", 35);
        System.out.println(jonDoe.toString());

        jonDoe.setAgeFromString("20");
        System.out.println(jonDoe.toString());

        System.out.println(jonDoe.sayMyName(3));

        // Print Pyramid
        char symbol = '*';
        int height = 5;
        printPyramid(symbol, height);

    }
}