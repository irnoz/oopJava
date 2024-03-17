package org.tsu;

public class CharacterCounter {
    public static int count(String string, char character) {
        int counter = 0;
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i) == character) {
//                counter++;
//            }
//        }
        for (char c : string.toCharArray()) {
            if (c == character) {
                counter++;
            }
        }
        return counter;
    }
}
