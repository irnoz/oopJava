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
}
