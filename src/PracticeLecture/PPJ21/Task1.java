package PracticeLecture.PPJ21;

import java.util.Arrays;
import java.util.Scanner;

import static AuxiliaryFunctions.Array.*;


public class Task1 {

    public static void mix(int[] monthNumber, String[] monthName) {
        boolean isMixed = false;
        while (!isMixed) {
            isMixed = true;
            int rand1 = (int) (Math.random() * monthNumber.length);
            int rand2 = (int) (Math.random() * monthNumber.length);

            int tmp = monthNumber[rand1];
            String tmp2 = monthName[rand1];
            monthNumber[rand1] = monthNumber[rand2];
            monthName[rand1] = monthName[rand2];
            monthNumber[rand2] = tmp;
            monthName[rand2] = tmp2;

            for (int i = 1; i < monthNumber.length; i++) {
                if (monthNumber[i - 1] == monthNumber[i] - 1) {
                    isMixed = false;
                    break;
                }
            }
        }


    }

    public static void selectionSort(String[] monthName, int[] monthNumber) {
        int n = monthNumber.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (monthNumber[j] < monthNumber[min_idx])
                    min_idx = j;

            int temp = monthNumber[min_idx];
            String temp2 = monthName[min_idx];
            monthNumber[min_idx] = monthNumber[i];
            monthName[min_idx] = monthName[i];
            monthNumber[i] = temp;
            monthName[i] = temp2;
        }
    }

    public static void bubbleSort(String[] monthName, int[] monthNumber) {
        int n = monthNumber.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (monthNumber[j] > monthNumber[j + 1]) {
                    int temp = monthNumber[j];
                    String temp2 = monthName[j];
                    monthNumber[j] = monthNumber[j + 1];
                    monthName[j] = monthName[j + 1];
                    monthNumber[j + 1] = temp;
                    monthName[j + 1] = temp2;
                }
    }

    public static void insertionSort(String[] monthName, int[] monthNumber) {
        int n = monthNumber.length;
        for (int i = 1; i < n; ++i) {
            int key = monthNumber[i];
            String key2 = monthName[i];
            int j = i - 1;

            while (j >= 0 && monthNumber[j] > key) {
                monthNumber[j + 1] = monthNumber[j];
                monthName[j + 1] = monthName[j];
                j --;
            }
            monthNumber[j + 1] = key;
            monthName[j + 1] = key2;
        }
    }

    public static int[][] split(int[] data, int splitIndex){
        int[] first = new int[splitIndex];
        int[] second = new int[data.length-splitIndex];

        for (int i = 0; i < first.length; i++) {
            first[i] = data[i];
        }

        for (int i = 0; i < second.length; i++) {
            second[i] = data[i+splitIndex-1];
        }

        return new int[][]{first, second};
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (high <= low) return;

        int mid = (low+high)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array, low, mid, high);
    }

    public static void merge(int[] array, int low, int mid, int high) {
        // Creating temporary subarrays
        int[] leftArray = new int[mid - low + 1];
        int[] rightArray = new int[high - mid];

        // Copying our subarrays into temporaries
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];

        // Iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        // Copying from leftArray and rightArray back into array
        for (int i = low; i < high + 1; i++) {
            // If there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void main(String[] args) {
        String[] monthName = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};
        int[] monthNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        mix(monthNumber, monthName);
        printIntArray(monthNumber);
        printStringArray(monthName);

        mergeSort(monthNumber, 0, monthNumber.length-1);
        printIntArray(monthNumber);
        printStringArray(monthName);

        print2DArray(split(monthNumber, 4));

    }
}
