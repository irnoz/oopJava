package org.tsu;

public class Counter {
    public static int getOccurrencesOf(char target, String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                counter++;
            }
        }
        return counter;
    }
}
