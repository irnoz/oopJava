package org.tsu;

public class ArraySorter {
    public int[] sort(int[] array) {
        if (array.length == 0) return array;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] > newArray[j]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * This function simply swaps two elements
     */
    private static int getItself(int firstElement, int secondElement) {
        return firstElement;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a + " " + b);
        a = getItself(b, b = a);
        System.out.println(a + " " + b);
    }
}
