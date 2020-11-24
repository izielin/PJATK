package Additional.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    // task 1
    public static byte[] appendToExistingArray(byte[] array, byte element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
        return array;
    }

    public static void printByteArray(byte[] array) {
        // odczytywanie wszystkich wartości w tablicy
        for (byte b : array) {
            System.out.print(b + ", ");
        }
        System.out.println();
    }

    public static void task1() {
        byte[] array = new byte[10];
        byte[] odd = new byte[0];
        byte[] even = new byte[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = (byte) (Math.random() * 5);
        }

        for (byte b : array) {
            System.out.println(b % 2 == 0);
            if (b % 2 != 0) odd = appendToExistingArray(odd, b);
            else even = appendToExistingArray(even, b);
        }

        printByteArray(array);
        printByteArray(odd);
        printByteArray(even);

    }

    // task 2 - palindrome
    public static boolean palindrome(int[] array, int start, int end) {

        // base case
        if (start >= end) {
            return true;
        }
        if (array[start] == array[end]) {
            return palindrome(array, start + 1, end - 1);
        } else {
            return false;
        }
    }

    public static void task2() {
        //palindrome
        int[] array1 = {1, 2, 3, 4, 4, 3, 2, 1};
        //not palindrome
        int[] array2 = {1, 3, 4, 5, 2, 3, 4};

        System.out.println(palindrome(array1, 0, array1.length - 1));
        System.out.println(palindrome(array2, 0, array2.length - 1));
    }

    //task 3
    public static void task3() {
        char[] chars = new char[50];
        char[] alphabet = new char[26];
        int[] countingArray = new int[26];


        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('a' + (Math.random() * (26)));
        }

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        for (int i = 0; i < alphabet.length; i++) {
            for (char aChar : chars) {
                if (alphabet[i] == aChar)
                    countingArray[i] += 1;
            }
        }

        for (char aChar : chars) {
            System.out.print(aChar + ", ");
        }
        System.out.println();


        for (int i = 0; i < alphabet.length; i++) {
            System.out.println("Char: " + alphabet[i] + " amount: " + countingArray[i]);
        }

    }

    public static boolean[] appendBooleanValueToExistingArray(boolean[] array, boolean element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
        return array;
    }

    public static void printBooleanArray(boolean[] array) {
        // odczytywanie wszystkich wartości w tablicy
        for (boolean b : array) {
            System.out.print(b + ", ");
        }
        System.out.println();
    }

    public static void task1_1() {
        Random random = new Random();

        boolean[] array = new boolean[10];
        boolean[] trueArray = new boolean[0];
        boolean[] falseArray = new boolean[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextBoolean();
        }

        for (boolean b : array) {
            if (b) trueArray = appendBooleanValueToExistingArray(trueArray, b);
            else falseArray = appendBooleanValueToExistingArray(falseArray, b);
        }

        printBooleanArray(array);
        printBooleanArray(trueArray);
        printBooleanArray(falseArray);
    }


    public static int getSizeof(int n) {
        int length = 0;
        long temp = 1;
        while (temp <= n) {
            length++;
            temp *= 10;
        }
        return length;
    }

    public static void armstrongNumber(int number) {
        int sum = 0, element, temp, power;
        power = getSizeof(number);
        temp = number;
        while (number > 0) {
            element = number % 10;
            number = number / 10;
            sum = (int) (sum + (Math.pow(element, power)));
        }
        if (temp == sum)
            System.out.println(temp + " in an armstrong number");
        else
            System.out.println( temp + " is not an armstrong number");

    }

    public static void task3_1() {
        int[] array = {153, 333, 9, 1, 463, 371, 1634, 370, 515, 407, 80};
        for (int j : array) {
            armstrongNumber(j);
        }
    }


    public static void main(String[] args) {
        task3_1();
    }
}