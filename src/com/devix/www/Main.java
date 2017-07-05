package com.devix.www;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arrays[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(arrays);
        printArray("Sorted array", arrays);

        int index = Arrays.binarySearch(arrays, 1);
        System.out.println("Didn't find 1 @ " + index);

        int newIndex = -index - 1;
        arrays = insertElements(arrays, 1, newIndex);
        printArray("With 1 added", arrays);
    }

    private static int[] insertElements(int original[], int element, int index) {
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index + 1, length - index);
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
