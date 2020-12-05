package PracticeLecture.Methods;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static AuxiliaryFunctions.Array.*;

public class Main {
    //task 1
    static void show(int a) {
        System.out.println(a);
    }

    // taks 2
    static void modifyValue(int wrt) {
        System.out.println(wrt);
        wrt *= 5;
        System.out.println(wrt);
    }

    //task 3
    static int findMax(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > a && b > c) return b;
        else return c;
    }

    static void task3() {
        int a = (int) (Math.random() * 100), b = (int) (Math.random() * 100), c = (int) (Math.random() * 100);
        System.out.println("Największą liczbą z " + a + ", " + b + ", " + c + ", jest: " + findMax(a, b, c));
    }

    // task 4
    static int count(char[] array, int length, char x) {
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (x == array[i])
                result++;
        }
        return result;
    }

    static void task4() {
        System.out.println("Wprowadź zdanie: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] sentence = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            sentence[i] = input.charAt(i);
        }

        char[] temp = new char[sentence.length];
        int k = 0;
        int length = sentence.length;
        for (char c : sentence) {
            boolean repeated = false;
            for (char value : temp) {
                if (c == value) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                System.out.println("Szukany znak " + c + " występuje " + count(sentence, length, c) + " razy");
                temp[k++] = c;
            }
        }

    }

    // task 5
    static int[] check(int flag, int[] array1, int[] array2) {

        int shorter = Math.min(array1.length, array2.length);
        int longer = Math.max(array1.length, array2.length);
        int[] longerArray;
        int[] result = new int[shorter];

        int m = 0;
        if (array1.length == array2.length) {
            return null;
        } else {
            if (array1.length == longer)
                longerArray = Arrays.copyOf(array1, array1.length);
            else
                longerArray = Arrays.copyOf(array2, array2.length);
            if (flag < 0) {
                for (int i = 0; i < shorter; i++) {
                    result[i] = array1[i] + array2[i];
                }

            } else {
                for (int i = 0; i < longerArray.length; i++) {
                    if (i > shorter - 1)
                        result[m++] = longerArray[i];
                }
            }
            return result;
        }
    }


    static void task5() {
        int[] array1 = new int[(int) (Math.random() * (25 - 10) + 10)];
        int[] array2 = new int[(int) (Math.random() * (25 - 10) + 10)];

        fillIntArray(array1, 30, -15);
        fillIntArray(array2, 20, -10);

        printIntArray(array1);
        printIntArray(array2);
        int flag = (int) (Math.random() * (10 + 10) - 10);

        try {
            printIntArray(Objects.requireNonNull(check(flag, array1, array2)));

        } catch (NullPointerException e) {
            System.out.println("Tablice są tej samej długości");
        }

    }

    // task 6
    static boolean isEqual(int[][] array1, int[][] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].length != array2[i].length) return false;
            else {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i][j] != array2[i][j]) return false;
                }
            }
        }

        return true;

    }


    static void task6() {
        int[][] array1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] array2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(isEqual(array1, array2));

    }

    // task 7
    static int[][] createTempArray(int size, int[][] originArray, int m, int n) {
        // wypełnienie macierzy nxn
        int[][] tempArray = new int[size][size];
        for (int i = 0; i < tempArray.length; ++i) {
            tempArray[i] = new int[size];
            for (int j = 0; j < tempArray[i].length; ++j) {
                tempArray[i][j] = originArray[i + m][j + n];
            }
        }
        return tempArray;
    }


    static void checkTaskConditions(int size, int[][] originArray, int n, int m) {
        int[][] tempArray = createTempArray(size, originArray, n, m);
        boolean flag = true;
        int above = tempArray[0][1], below = tempArray[1][0];

        int tempIndex = 0;

        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray[i].length; j++) {
                if (i == j) {
                    continue;
                } else if (above == below) {
                    flag = false;
                    break;
                } else if (i < j) {
                    if (above != tempArray[i][j]) {
                        flag = false;
                        break;
                    }
                } else {
                    if (below != tempArray[i][j]) {
                        flag = false;
                        break;
                    }
                }
            }

        }

        tempIndex++;

        if (!flag) {

            if (m == originArray.length - 1 - size && n == originArray[tempIndex].length - 1 - size)
                System.out.println("Nie znaleziono");
            else if (n < originArray[tempIndex].length - 1 - size)
                checkTaskConditions(size, originArray, n + 1, m);
            else if (m < originArray.length - 1 - size)
                checkTaskConditions(size, originArray, 0, m + 1);
        } else {
            System.out.println("Znaleziono prostokąt o rozmiarze " + size + "x" + size + " spełniający warunki zadania");
            print2DArray(tempArray);

            if (size + 1 < originArray.length) {
                System.out.println("rozpoczęto przeszukanie " + (size + 1) + "x" + (size + 1));
                checkTaskConditions(size + 1, originArray, 0, 0);
            } else {
                System.out.println("Przeszukano całą tabelę");
            }

        }

    }

    static void task7() {
        int[][] array2D = new int[25][25];

//      wypełnienie macierzy 25x25
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = ((Math.random()) < .5) ? 0 : 1;
            }
        }
        /*przypadek idealny
        int[][] array2D = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        */

        print2DArray(array2D);

        checkTaskConditions(3, array2D, 0, 0);
    }


    public static void main(String[] args) {
        task4();
    }

}
