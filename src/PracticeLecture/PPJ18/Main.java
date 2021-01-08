package PracticeLecture.PPJ18;

import java.util.Scanner;

import static AuxiliaryFunctions.Array.print2DArray;

public class Main {
    public static boolean isPalindrome(char[] array, int startIndex, int endIndex) {
        // jeżeli tablica jest pusta lub ma 1 element jest to palindrom
        if (array.length == 0 || array.length == 1)
            return true;
        // jeżeli indeks początkowy jest większy niż indeks końcowy -> cała tablica została sprawdzona
        if (startIndex >= endIndex)
            return true;
        // jeżeli elementy na odpowiednich indeksach nie są równe ->nie jest to palindrom
        if (array[startIndex] != array[endIndex])
            return false;
        // powtarzaj przesuwając oba indeksy w stronę środka tabeli o 1
        return isPalindrome(array, startIndex + 1, endIndex - 1);
    }

    static String printFromMiddle(char[] a, int x) {
        if (a[x] != a[a.length - 1 - x])
            return null;
        if (x > 0)
            return a[x - 1] + "" + printFromMiddle(a, x - 1) + a[a.length - x];
        else
        return "";
    }

    static void task1() {
        char[] chars = {'k', 'a', 'j', 'a', 'k'};

        System.out.println(isPalindrome(chars, 0, chars.length - 1));
        System.out.println(printFromMiddle(chars, chars.length/2));

    }


    public static int recursiveFibonacciSeries(int n) {
        if (n <= 1)
            return n;
        else
            return recursiveFibonacciSeries(n - 1) + recursiveFibonacciSeries(n - 2);
    }

    static void task3() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(recursiveFibonacciSeries(i) + ", ");
        }
        System.out.println();
    }


    static void task4() {
        int[][] array = new int[8][8];

        ringFill(array, 0);
        print2DArray(array);
    }

    private static void ringFill(int[][] array, int s) {
        if (s > array.length / 2) {
            return;
        }
        for (int i = s; i < array.length - s; i++) {
            for (int j = s; j < array.length - s; j++) {
                array[i][j] = s + 1;
            }
        }
        ringFill(array, s + 1);

    }

    public static void main(String[] args) {
        System.out.println("---Zadanie 1 & 2---");
        task1();

        System.out.println("---Zadanie 3---");
        task3();

        System.out.println("---Zadanie 4---");
        task4();

    }

}
