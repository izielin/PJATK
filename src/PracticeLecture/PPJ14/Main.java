package PracticeLecture.PPJ14;

import java.util.Scanner;

import static AuxiliaryFunctions.Array.*;

public class Main {

    public static void uniquePrint(float[] array) {
        // odczytywanie wszystkich wartości w tablicy
        int fill = array.length;
        for (float v : array) {
            if (v < -10)
                System.out.printf(" %.2f ", v);
            else if (v < 0 || v > 10)
                System.out.printf("  %.2f ", v);
            else
                System.out.printf("   %.2f ", v);
        }
        System.out.println();
    }

    public static void spiralPrint(int endingRowIndex, int endingColumnIndex, int[][] array) {
        int i, startingRowIndex = 0, startingColumnIndex = 0;

        while (startingRowIndex < endingRowIndex && startingColumnIndex < endingColumnIndex) {
            // Pierwszy rząd z pozostałych
            for (i = startingColumnIndex; i < endingColumnIndex; ++i) {
                System.out.print(array[startingRowIndex][i] + " ");
            }
            startingRowIndex++;

            // Ostatnia kolumna z pozostałych
            for (i = startingRowIndex; i < endingRowIndex; ++i) {
                System.out.print(array[i][endingColumnIndex - 1] + " ");
            }
            endingColumnIndex--;

            // ostatni rząd z pozostałych
            if (startingRowIndex < endingRowIndex) {
                for (i = endingColumnIndex - 1; i >= startingColumnIndex; --i) {
                    System.out.print(array[endingRowIndex - 1][i] + " ");
                }
                endingRowIndex--;
            }

            // Pierwsza kolumna z pozostałych
            if (startingColumnIndex < endingColumnIndex) {
                for (i = endingRowIndex - 1; i >= startingRowIndex; --i) {
                    System.out.print(array[i][startingColumnIndex] + " ");
                }
                startingColumnIndex++;
            }
        }
    }

    public static int[][] fill2DArray(int[][] source, int firstVal, int secondVal, int distance) {
        int[][] result = new int[source.length + 1][3];

        for (int i = 0; i < result.length - 1; i++) {
            System.arraycopy(source[i], 0, result[i], 0, result[i].length);
        }

        result[result.length - 1][0] = firstVal;
        result[result.length - 1][1] = secondVal;
        result[result.length - 1][2] = distance;
        return result;
    }

    // task 1
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long[] array = new long[(int) (Math.random() * (20 - 10) + 10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = t + i;
        }

        printLongArray(array);

        boolean isMixed = false;
        while (!isMixed) {
            isMixed = true;
            int rand1 = (int) (Math.random() * array.length);
            int rand2 = (int) (Math.random() * array.length);

            long tmp = array[rand1];
            array[rand1] = array[rand2];
            array[rand2] = tmp;

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] == array[i] - 1) {
                    isMixed = false;
                    break;
                }
            }
        }

        printLongArray(array);
    }

    // task 2
    public static void task2() {

        int[] array = new int[10];
        int[][] result = new int[0][3];

        fillIntArray(array, 200, -100);

        int[] arrayCopy = removeDuplicates(array, array.length);

        printIntArray(array);
        System.out.println();

        int distance = Integer.MAX_VALUE;
        for (int k : arrayCopy) {
            for (int i : arrayCopy) {
                int tempDistance = Math.abs(k + i);
                if (tempDistance <= distance) {
                    distance = tempDistance;
                    result = fill2DArray(result, k, i, distance);
                }
            }
        }

        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i][2] <= result[result.length - 1][2])
                System.out.print("\n" + "Suma najbliższa zeru to: " + result[i][2] + ", a została osiągnięta z liczb: " + result[i][1] + " i " + result[i][0]);

        }


    }

    // task3 is the same as task6 in file Practice.Arrays.Main

    //task 4
    public static void task4() {
        int[][] tab = {{1, 0, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1}};
        int counter = 0;

        for (int[] ints : tab) {
            for (int j = 0; j < ints.length; j++) {
                counter += 1;
            }
        }

        int[] result = new int[counter];
        int m = 0;
        for (int[] i : tab) {
            for (int j : i) {
                result[m++] = j;
            }
        }
        printIntArray(result);
    }

    //task 5
    public static void task5() {
        int[] array1 = new int[(int) ((Math.random() * (25 - 10)) + 10)];
        int[] array2 = new int[(int) ((Math.random() * (15 - 5)) + 5)];
        int[] array3 = new int[(int) ((Math.random() * (30 - 20)) + 20)];

        fillIntArray(array1, 50, 20);
        fillIntArray(array2, 100, 3);
        fillIntArray(array3, 40, -20);

        int[][] result = {array1, array2, array3};

        for (int i = 0; i < result.length; i++) {
            System.out.print("result[" + i + "] {");
            printIntArray(result[i]);
            System.out.println("}");
        }

    }

    //task 6
    public static void task6() {
        float[][] floats = new float[8][8];
        float rightDiagonal = 0;
        float leftDiagonal = 0;

        for (float[] aFloat : floats) {
            for (int j = 0; j < aFloat.length; j++) {
                fillFloatArray(aFloat, 100.0, -20.0);
            }
        }

        for (int i = 0; i < floats.length; i++) {
            for (int j = 0; j < floats[i].length; j++) {
                if (i == j) {
                    leftDiagonal += floats[i][j];
                }
                if ((floats[i].length - i) == j) {
                    rightDiagonal += floats[floats[i].length - i][j];
                }
            }
        }

        for (float[] aFloat : floats) {
            uniquePrint(aFloat);
        }

        System.out.println("Right diagonal: " + rightDiagonal);
        System.out.println("Left diagonal: " + leftDiagonal);
    }

    //zadanie 7

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wymiary tablicy: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] array2D = new int[rows][columns];
        int startPoint = 1;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                array2D[i][j] = startPoint;
                startPoint++;
            }

        spiralPrint(rows, columns, array2D);
    }

    public static void main(String[] args) {
//        System.out.println("ZADANIE 1");
//        task1();
        System.out.println("\n" + "ZADANIE 2");
        task2();
//        System.out.println("\n\n" + "ZADANIE 4");
//        task4();
//        System.out.println("\n\n" + "ZADANIE 5");
//        task5();
//        System.out.println("\n" + "ZADANIE 6");
//        task6();
//        System.out.println("\n" + "ZADANIE 7");
//        task7();
    }
}
