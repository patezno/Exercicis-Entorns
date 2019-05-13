package org.lasencias;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] exemple1 = { 10, 7, 25, 25, 20, 12, 9 };
        System.out.println("El array desordenado es: " + Arrays.toString(exemple1));
        quickSort(exemple1, 0, exemple1.length - 1);
        System.out.println("El array ordenado es: " + Arrays.toString(exemple1));

        int[] exemple2 = { 5, 4, 3, 2, 1, 0 };
        System.out.println("\nEl array desordenado es: " + Arrays.toString(exemple2));
        quickSort(exemple2, 0, exemple2.length - 1);
        System.out.println("El array ordenado es: " + Arrays.toString(exemple2));
    }

    private static void quickSort(int[] inputArray, int low, int high) {

        int indexBaix = low;
        int indexAlt = high;

        int mitat = low + (high - low) / 2;
        int elementPivot = inputArray[mitat];

        while (indexBaix <= indexAlt) {

            while (inputArray[indexBaix] < elementPivot) {
                indexBaix++;
            }

            while (inputArray[indexAlt] > elementPivot) {
                indexAlt--;
            }

            if (indexBaix <= indexAlt) {
                swap(inputArray, indexBaix, indexAlt);
                indexBaix++;
                indexAlt--;
            }
        }

        if (low < indexAlt) {
            quickSort(inputArray, low, indexAlt);
        }

        if (indexBaix < high) {
            quickSort(inputArray, indexBaix, high);
        }
    }

    private static void swap(int[] arr, int iElement1, int iElement2) {
        int temp = arr[iElement1];
        arr[iElement1] = arr[iElement2];
        arr[iElement2] = temp;
    }
}
