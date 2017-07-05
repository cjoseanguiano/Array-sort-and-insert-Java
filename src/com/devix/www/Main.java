package com.devix.www;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arrays[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(arrays);
        printArray("Sorted array", arrays);

        int index = Arrays.binarySearch(arrays, 2);
        System.out.println("Didn't find 1@ " + index);

        int newIndex = -index - 1;
        arrays = insertElement(arrays, 1, newIndex);
        printArray("With 1 added", arrays);
    }

    private static int[] insertElement(int[] arrays, int i, int newIndex) {
        int lenght = arrays.length;
        int destination[] = new int[lenght + 1];
        System.arraycopy(arrays, 0, destination, 0, newIndex);
        destination[newIndex] = i;
        System.arraycopy(arrays, newIndex, destination, newIndex + 1, lenght - newIndex);
        return destination;
    }

    private static void printArray(String s, int[] arrays) {
        System.out.println(s + ": [lenght: " + arrays.length + "]");
        for (int i = 0; i < arrays.length; i++) {
            if (i != 0) {
                System.out.println(", ");
            }
            System.out.println(arrays[i]);
        }
        System.out.println();
    }
}
