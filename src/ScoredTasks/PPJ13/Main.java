package ScoredTasks.PPJ13;

import static AuxiliaryFunctions.Array.printByteArray;

public class Main {
    //task 1

    public static boolean isPrimeNumber(byte number) {
        int m, flag = 0;
        m = (int) number / 2;

        if (number == 0 || number == 1) return false;
        else {

            for (int i = 2; i < m; i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }

        }
        return flag == 0;
    }

    public static void task1() {
        byte[] array = new byte[10];

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (byte) (Math.random() * 128);
        }

        for (byte b : array) {
            if (isPrimeNumber(b)) counter += 1;
        }

        byte[] primaryNumber = new byte[counter];
        byte[] rest = new byte[array.length - counter];

        int k = 0, m = 0;
        for (byte b : array) {
            if (isPrimeNumber(b))
                primaryNumber[k++] = b;
            else rest[m++] = b;
        }


        printByteArray(array);
        printByteArray(primaryNumber);
        printByteArray(rest);
    }

    //task2
    public static void task2() {
        int[] tab = {1, 2, 3, 4, 1, 2, 3, 4};
        float counter = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == tab[j]) {
                    counter += 1;
                    break;
                }
            }
        }
        System.out.println(counter >= (float) (tab.length / 2.0));
    }

    // task3
    public static int[] fibonacciSeries() {
        int[] fibonacciSeries = new int[11];

        int n = 10, t1 = 0, t2 = 1;

        for (int i = 0; i <= n; ++i) {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            fibonacciSeries[i] = sum;
        }
        return fibonacciSeries;
    }

    public static void task3() {
        int[] arr = {10, 3, 12, 5, 15, 8, 13, 21};
        int[] fibonacci = fibonacciSeries();

        for (int k : arr) {
            for (int i : fibonacci) {
                if (k == i)
                    System.out.println("liczba " + k + " należy do ciągu Fibonacciego");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n" + "Zadanie 1");
        task1();
//        System.out.println("\n" + "Zadanie 2");
//        task2();
//        System.out.println("\n" + "Zadanie 3");
//        task3();
    }
}
