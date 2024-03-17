package org.tsu;

public class Main {
    public static void main(String[] args) {
        // Person class
        Person jonDoe = new Person("Jon Doe", 35);

        System.out.println(jonDoe.toString());
        jonDoe.setAgeFromString("30");
        System.out.println(jonDoe.toString());

        System.out.println(jonDoe.sayMyName(5));

        // Pyramid builder
        System.out.println(PyramidBuilder.buildPyramid('*', 5));
    }
}
