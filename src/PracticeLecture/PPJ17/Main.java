package PracticeLecture.PPJ17;

import static AuxiliaryFunctions.Array.*;

public class Main {
    // task 1
    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    public static double findMax(double[] array) {
        double max = Integer.MIN_VALUE;
        for (double i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    public static void task1() {
        int[] arrayInt = new int[10];
        double[] arrayDouble = new double[10];

        fillIntArray(arrayInt, 20, -10);
        fillDoubleArray(arrayDouble, 10.0, -10.0);

        System.out.println(findMax(arrayInt));
        System.out.printf("%.2f", findMax(arrayDouble));
    }

    // task 2
    public static int[] splitToDigits(int element) {
        int[] array = new int[0];

        while (element > 0) {
            array = java.util.Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = (element % 10);
            element = element / 10;
        }

        return array;
    }


    public static void task2() {
        int a = 2734621;
        printIntArray(splitToDigits(a));

    }

    //task 3
    public static int calculatePower(int n) {
        int length = 0;
        long temp = 1;
        while (temp <= n) {
            length++;
            temp *= 10;
        }
        return length;
    }

    public static boolean armstrongNumber(int number) {
        int sum = 0, element, temp, power;
        power = calculatePower(number);
        temp = number;
        while (number > 0) {
            element = number % 10;
            number = number / 10;
            sum = (int) (sum + (Math.pow(element, power)));
        }

        return (temp == sum);
    }

    public static void task3() {
        int number = 153;
        System.out.println(armstrongNumber(number) ? number + " to liczba Armstronga" : number + " to nie liczba Armstronga");
    }


    // task 4
    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {
        int[][] coordinates = new int[(screenWidth / side) * (screenHeight / side)][2];
        int k = 0;

        for (int i = 0; i < screenWidth; i += side) {
            for (int j = 0; j < screenHeight; j += side) {
                coordinates[k][0] = i;
                coordinates[k][1] = j;
                k++;
                if (j + side > screenHeight - side)
                    break;
            }
            if (i + side > screenWidth - side)
                break;
        }
        return coordinates;
    }


    public static void main(String[] args) {
        //task4
        print2DArray(calculateSquares(8, 4, 2));
    }

}
