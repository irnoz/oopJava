package org.tsu;

public class CharacterCounter {
    public static int count(String string, char character) {
        int counter = 0;
        for (char c : string.toCharArray()) {
            if (c == character) {
                counter++;
            }
        }
        return counter;
    }
}
