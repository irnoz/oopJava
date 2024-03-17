package org.tsu;

/*
   *
  ***
 *****
 */

public class PyramidBuilder {
    public static String buildPyramid(char symbol, int height) {
        StringBuilder pyramid = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            pyramid.append(" ".repeat(height - i));
            pyramid.append(String.valueOf(symbol).repeat(2 * i - 1));
            pyramid.append('\n');
        }
        return pyramid.toString();
    }
}
