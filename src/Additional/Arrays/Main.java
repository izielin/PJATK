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

//    public static void printByteArray(byte[] array) {
//        // odczytywanie wszystkich wartości w tablicy
//        for (byte b : array) {
//            System.out.print(b + ", ");
//        }
//        System.out.println();
//    }

    public static void task1() {
        // rozdzielenie wartości z tablicy na cyfry parzyste i nieparzyste
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
        // sprawdzenie czy dana tablica jest palindromem
        int[] array1 = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] array2 = {1, 3, 4, 5, 2, 3, 4};

        System.out.println(palindrome(array1, 0, array1.length - 1));
        System.out.println(palindrome(array2, 0, array2.length - 1));
    }

    //task 3
    public static void task3() {
        // liczenie powtarzających się liter w tablicy
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
        for (boolean b : array) {
            System.out.print(b + ", ");
        }
        System.out.println();
    }

    public static void task4() {
        // dzielenie wartości z tablicy na dwie oddzielne - true i false
        Random random = new Random();

        boolean[] array = new boolean[10];
        boolean[] trueArray = new boolean[0];
        boolean[] falseArray = new boolean[0];

        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextBoolean();
            array[i] = (boolean) (Math.random() < 0.5);
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
            System.out.println(temp + " is not an armstrong number");

    }

    public static void task5() {
        // sprawdzanie czy liczba jest liczbą armstronga
        int[] array = {153, 333, 9, 1, 463, 371, 1634, 370, 515, 407, 80};
        for (int j : array) {
            armstrongNumber(j);
        }
    }

    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void task6() {
        // szukanie czy istnieje suma dwóch elementów z tablicy która jest większa niż suma pozostałych
        int[] tab = {2, 1, 3, 9, 4, 3, 2, 1};
        bubbleSortAscending(tab);

        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < tab.length - 2; i++) {
            sum += tab[i];
        }

        for (int i = tab.length - 2; i < tab.length; i++) {
            sum2 += tab[i];
        }

        System.out.println(sum2 > sum);

    }

    public static void fillIntArray(int[] array, int highRange, int lowRange) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (highRange - lowRange) + lowRange);
        }
    }

    public static int[] appendIntValueToExistingArray(int[] array, int element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
        return array;
    }

    private static int[] removeDuplicates(int[] originArray, int n) {
        int length = originArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (originArray[i] == originArray[j]) {
                    originArray[j] = originArray[length - 1];
                    length--;
                    j--;
                }
            }
        }

        return Arrays.copyOf(originArray, length);

    }

    public static void task7() {
        // utwórz dwie tablice zmiennych , wypełnij je cciągiem rosnącym i malejącym, utwórz 3 tablice
        // w której znajdą się unikalne sumy kolejnych indeksów z poprzednich tablic
        int size = 30;
        int[] asc = new int[size];
        int[] desc = new int[size];
        int[] sum = new int[size];

        fillIntArray(asc, 50, 100);
        fillIntArray(desc, 50, 100);

        bubbleSortAscending(asc);
        bubbleSortDescending(desc);

        for (int i = 0; i < asc.length; i++) {
            sum[i] = asc[i] + desc[i];
        }

        sum = removeDuplicates(sum, sum.length);

        Practice.Arrays.Main.printIntArray(asc);
        Practice.Arrays.Main.printIntArray(desc);
        Practice.Arrays.Main.printIntArray(sum);
    }

    public static void main(String[] args) {
        task7();
    }
}
