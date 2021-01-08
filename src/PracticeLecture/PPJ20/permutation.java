package PracticeLecture.PPJ20;

import java.util.Scanner;

public class permutation {
    /*
    Recursive function that prints all (n! Permutations) letters on the screen starting with the letter a
    in given range 0 to 26.


    */


    public static void createPermutation(int n, char[] elements) {
        if (n == 1) {
            printArray(elements);
            return;
        }
        createPermutation(n - 1, elements);

        for (int i = 0; i < n-1; i++) {
            if (n % 2 == 0) {
                swap(elements, i, n - 1);
            } else {
                swap(elements, 0, n - 1);
            }
            createPermutation(n - 1, elements);
        }
    }

    public static void swap(char[] input, int a, int b) {
        char tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    public static void printArray(char[] input) {
        System.out.print('\n');
        for (char c : input) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] elements = new char[n];


        for (int i = 0; i < n; i++) {
            elements[i] = (char) (97 + i);
        }

        createPermutation(n, elements);
    }
}
