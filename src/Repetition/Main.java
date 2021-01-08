package Repetition;

import java.util.Arrays;

import static AuxiliaryFunctions.Array.print2DArray;

public class Main {

    // task 1
    static void fillCarpet(char[][] array, int s) {

        if (s > array.length / 2) {
            return;
        }
        for (int i = s; i < array.length - s; i++) {
            for (int j = s; j < array.length - s; j++) {
                array[i][j] = (s % 2 == 0) ? 'x' : 'o';
            }
        }
        fillCarpet(array, s + 1);
    }

    static void task1() {
        char[][] carpet = new char[7][7];

        fillCarpet(carpet, 0);
        print2DArray(carpet);
    }

    // task 2
    static int[][] moveRight(int[][] array, int length) {
        int[][] temp = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == 0) {
                    temp[i][j] = array[i][length - 1];
                } else {
                    temp[i][j] = array[i][j - 1];
                }
            }
        }
        return temp;

    }


    static int[][] moveDown(int[][] array) {
        int[][] temp = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    temp[i][j] = array[array.length - 1][j];
                } else {
                    temp[i][j] = array[i - 1][j];
                }
            }
        }

        return temp;
    }

    static int[][] moveDiagonally(int[][] array) {
        int[][] temp = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    temp[i][j] = array[(i+1)%3][(j+1)%3];
            }
        }

        return temp;
    }


    static void task2() {

        int[][] animation = {{1, 6, 4}, {3, 2, 8}, {5, 2, 9}};
        int step = 2;

        for (int i = 0; i < step+1; i++) {
            System.out.println("Przesunięcie o " + i);
            print2DArray(animation);
            animation = moveRight(animation, animation.length);

        }

        for (int i = 0; i < step+1; i++) {
            System.out.println("Przesunięcie o " + i);
            print2DArray(animation);
            animation = moveDown(animation);

        }

        for (int i = 0; i < step+1; i++) {
            System.out.println("Przesunięcie o " + i);
            print2DArray(animation);
            animation = moveDiagonally(animation);
        }
    }

    // Methods
// task 2
    static boolean search(int[] array, int x) {
        for (int j : array) {
            if (j == x)
                return true;
        }
        return false;
    }

    // task 3
    static double sum(double[] array) {
        double sum = 0;

        for (double j : array) {
            sum += j;
        }
        return sum;
    }

    // task 4
    static int factorialIterative(int n) {
        if (n == 1)
            return n;
        else {
            int factorial = 1;
            for (int i = n; i > 1; i--) {
                factorial *= i;
            }
            return factorial;
        }
    }

    //task 5
    static int factorialRecursive(int n) {
        if (n == 1)
            return n;
        else
            return n * factorialRecursive(n - 1);
    }

    //task 6
    static int[] sort(int a, int b, int c) {
        int[] tmp = {a, b, c};
        if (tmp[0] > tmp[1]) {
            tmp[1] = a;
            tmp[0] = b;
        }
        if (tmp[0] > tmp[2]) {
            tmp[2] = tmp[0];
            tmp[0] = c;
        }
        if (tmp[1] > tmp[2]) {
            int t = tmp[2];
            tmp[2] = tmp[1];
            tmp[1] = t;
        }
        return tmp;
    }

    // task 7
    static boolean isEqual(double[] array1, int[] array2) {

        double sum1 = 0;
        int sum2 = 0;

        for (double d : array1) {
            sum1 += d;
        }

        for (int i : array2) {
            sum2 += i;
        }

        return (int)sum1 == sum2;

    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4};
//        double[] arr2 = {1.1, 1.9, 3.0, 4.0};
//        System.out.println(search(arr, 4));
//        System.out.println(sum(arr2));
//
//        System.out.println(factorialIterative(10));
//        System.out.println(factorialRecursive(10));
//
//        System.out.println(Arrays.toString(sort(1, 2, 3)));
//        System.out.println(Arrays.toString(sort(1, 3, 2)));
//        System.out.println(Arrays.toString(sort(2, 1, 3)));
//        System.out.println(Arrays.toString(sort(2, 3, 1)));
//        System.out.println(Arrays.toString(sort(3, 1, 2)));
//        System.out.println(Arrays.toString(sort(3, 2, 1)));
//
//        System.out.println(isEqual(arr2, arr));

        task2();
    }
}
