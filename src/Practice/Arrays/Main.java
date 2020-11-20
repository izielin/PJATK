package Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //zadanie 1
    public static void task1() {
        double[] arrayDouble = new double[10];

        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = (int) (Math.random() * 100); // wypełnianie losowymi wartościami z zakresu 0-100
        }

        System.out.println("Whole array: ");
        for (double v : arrayDouble) {
            System.out.print(v + ", ");
        }
        System.out.println();

        System.out.println("Even index: ");
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(i % 2 == 0 ? arrayDouble[i] + ", " : ""); // wybieranie tylko parzystego i
        }

        /*
        alternatywne rozwiązanie

        for (int i = 0; i < arrayDouble.length; i+=2) {
            System.out.print(arrayDouble[i]);
        }
         */

        System.out.println();

        System.out.println("Odd cast int value: ");
        for (double v : arrayDouble) {
            System.out.print((int) v % 2 != 0 ? v + ", " : "");
        }

    }

    //zadanie 2
    public static void task2() {
        char[] arrayChar = {'a', '!', 'w'}; //dowolne znaki
        int min = 128; // przypisanie największej możliwej wartości kodu ascii + 1, dla pewności, że każdy podany znak będzie mniejszy od zmiennej min
        char resoult = '0';

        for (char c : arrayChar) { // alternatywnie for(int i=0;i<arrayChar.length;i++)
            if ((int) c < min) {
                min = (int) c;
                resoult = c;
            }
        }
        System.out.println(resoult);
    }

    //zadanie 3
    public static void readCharArray(char[] array) {
        // odczytywanie wszystkich wartości w tablicy
        for (char c : array) {
            System.out.print(c + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        char[] arrayChar = new char[5];
        int counter = 0;

        for (int i = 0; i < arrayChar.length; i++) {
            /*
            posługujemy się kodem ascii, dużych liter jest 26, stąd losujemy wartość między 0 i 26
            korzystamy z funkcji (Math.random() * (max - min)) + min
            gdzie max to liczba na której zakres się kończy
            a min to liczba na której zakres się zaczyna
             */
            arrayChar[i] = (char) ('A' + (Math.random() * (26)));
        }

        readCharArray(arrayChar);

        System.out.println("Podaj znak który chcesz znaleźć: ");
        Scanner in = new Scanner(System.in);
        char input = in.next().charAt(0);

        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == input)
                counter += 1; // sprawdzamy czy wprowadzony znak jest taki sam jak znajdujący się w tablicy na pozycji z indeksem i
            arrayChar[i] = '0';
        }

        System.out.println(counter);
        readCharArray(arrayChar);

    }

    //zadanie 4
    public static void task4() {
        int[] arrayInt = new int[(int) ((Math.random() * (15 - 10)) + 10)];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.random() * arrayInt.length);
        }

        for (int i = arrayInt.length - 1; i >= 0; i--) {
            /*
            ten if-else jest użyty tylko żeby wydruk w terminalu ładnie wyglądał
            równie dobrze wystarczy użyć System.out.print(i+" ");
             */

            if (i >= 10)
                System.out.print(i + " ");
            else
                System.out.print(" " + i + " ");
        }
        System.out.println();

        for (int k : arrayInt) {
            for (int j = 0; j < arrayInt.length; j++) {
                if (k == j) System.out.print(" * ");
                else System.out.print(" . ");
            }
            System.out.println();
        }
    }

    //zadanie 5
    public static int[] fillIntArray(int[] array) {
        // wypełnianie tablicy losowymi wartościami 20-120
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 10) + 10);
        }
        return array;
    }

    public static int[] appendToExistingArray(int[] array, int element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
        return array;
    }

    public static void readIntArray(int[] array) {
        // odczytywanie wszystkich wartości w tablicy
        for (int v : array) {
            System.out.print(v + ", ");
        }
        System.out.println();
    }

    public static int searchMax(int[] arr) {
        // wyszukiwanie największej liczby w tablicy
        int max = Integer.MIN_VALUE; // deklaracja najmniejszą wartością int żeby mieć pewność że każda liczba w tablicy będzie większa od zmiennej min
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    public static int searchMin(int[] arr) {
        // wyszukiwanie najmniejszej liczby w tablicy
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) min = i;
        }
        return min;
    }

    public static void task5() {
        /*
        ten przykład trochę sam sobie skomplikowałem bo każda z tablic wejściowych może mieć inną długość
        a to komplikuje warunek przy utworzeniu tablicy łączącą w sobie tablice wejściowe
         */
        int[] array1 = new int[(int) ((Math.random() * (25 - 10)) + 10)];
        int[] array2 = new int[(int) ((Math.random() * (25 - 10)) + 10)];

        fillIntArray(array1); // uzupełnianie tablicy 1
        fillIntArray(array2); // uzupełnianie tablicy 2

        // nowa tablicę zawierająca wszystkie elementy z obu tablic
        int[] array3 = new int[array1.length + array2.length]; // inicjujemy długość jako sumę długości obu tablic wejściowych
        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length)
                array3[i] = array1[i]; // uzupełnianie pierwszej części tablicy 3 liczbami z tablicy 1
            /*
            uzupełnianie drugiej części tablicy 3 liczbami z tablicy 2
            ponieważ indeksy pętli for rosną do sumy array1.length + array2.length a indeksy w array2 są tylko od 0 do array2.length
            musimy zmniejszyć i o array1.length, dzięki temu i pokrywa się z indeksami array2 i nie dostajemy błędu ArrayIndexOutOfBoundsException
             */
            else array3[i] = array2[i - array1.length];
        }

        // nowa tablica zawierająca elementy występujące w obu tablicach
        int length = 0; // zmienna reprezentująca obecną długość 4 tablicy
        /*
        do tablicy 4 można podejść dwojako, albo zadeklarować ją jako: "int[] array4 = new int[array1.length + array2.length];"
        wtedy większość tablicy przyjmie wartości 0 a do jej uzupełniania wykorzystujemy instrukcję: "array4[length++] = array1[i];"
        która powinna być umieszczona zamiast instrukcji: "array4 = appendToExistingArray(array4, array1[i]);"

        zastosowane przez mnie rozwiązanie jest nieco bardziej zaawansowane i zakłada rozszerzanie tablicy array4 według
        ilości powtarzających się liczb
         */
        int[] array4 = new int[0];

        // szukamy wspólnych liczb w obu tablicach
        for (int i = 0; i < Math.max(array1.length, array2.length); i++) {
            for (int j = 0; j < Math.min(array1.length, array2.length); j++) {
                if (array1.length > array2.length) {
                    if (array1[i] == array2[j])
                        array4 = appendToExistingArray(array4, array1[i]);
                } else {
                    if (array2[i] == array1[j])
                        array4 = appendToExistingArray(array4, array2[i]);
                }
            }
        }

        // szukanie największych i najmniejszych wartości w obu tablicach wejściowych
        int maxArray1 = searchMax(array1);
        int maxArray2 = searchMax(array2);
        int minArray1 = searchMin(array1);
        int minArray2 = searchMin(array2);
        int finalMax = Math.max(maxArray1, maxArray2); // równie dobrze można zapisać to tak: maxArray1 > maxArray2 ? maxArray1 : maxArray2
        int finalMin = Math.min(minArray1, minArray2); // równie dobrze można zapisać to tak: minArray1 < minArray1 ? minArray1 : minArray2

        //nowa tablica liczb całkowitych z przedziału pomiędzy elementem o najmniejszej a największej wartości z obu tablic wejściowych
        int[] array5 = new int[finalMax - finalMin];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = finalMin + i;
        }

        System.out.println("\n" + "Pierwsza tablica wejściowa: ");
        readIntArray(array1);
        System.out.println("\n" + "Druga tablica wejściowa: ");
        readIntArray(array2);
        System.out.println("\n" + "Tablica zawierająca elementy występujące w obu tablicach: ");
        readIntArray(array3);
        System.out.println("\n" + "Tablica zawierająca elementy występujące w obu tablicach");
        readIntArray(array4);
        System.out.println("\n" + "Tablica liczb całkowitych z przedziału pomiędzy elementem o najmniejszej a największej wartości z obu tablic wejściowych");
        readIntArray(array5);

    }

    // zadanie 6
    public static void readDoubleArray(double[] array) {
        // odczytywanie wszystkich wartości w tablicy
        for (double v : array) {
            System.out.printf("%.2f ", v);
        }
        System.out.println();
    }

    public static void task6() {
        int length = 13;
        double[] arrayDouble = new double[length];
        int[] arrayInt = new int[length];
        int tempInt;
        double tempDouble, temp;


        for (int i = 0; i < length; i++) {
            arrayDouble[i] = Math.random() * 1000;
            arrayInt[i] = (int) (Math.random() * 1000);
        }

        double[] arrayResult = new double[length];
        for (int i = 0; i < arrayResult.length; i++) {
            arrayResult[i] = arrayDouble[i] + arrayInt[i];
        }

        for (int i = 0; i < arrayResult.length; i++) {
            for (int j = i + 1; j < arrayResult.length; j++) {
                if (arrayResult[i] > arrayResult[j]) {
                    temp = arrayResult[i];
                    tempInt = arrayInt[i];
                    tempDouble = arrayDouble[i];
                    arrayResult[i] = arrayResult[j];
                    arrayInt[i] = arrayInt[j];
                    arrayDouble[i] = arrayDouble[j];
                    arrayResult[j] = temp;
                    arrayInt[j] = tempInt;
                    arrayDouble[j] = tempDouble;
                }
            }
        }

        System.out.println("\n" + "Tabela liczb całkowitych:");
        readIntArray(arrayInt);
        System.out.println("\n" + "Tabela liczb zmiennoprzecinkowych:");
        readDoubleArray(arrayDouble);
        System.out.println("\n" + "Tabela sum:");
        readDoubleArray(arrayResult);
    }

    //zadanie 7
    public static int getSize(int[][] array, int row) {

        int column = 0;
        int[] elementsInRows = new int[row];
        double total = 0;

        for (int i = 0; i < row; i++) {
            elementsInRows[i] = array[i].length;
        }

        if (Arrays.stream(elementsInRows).distinct().count() == 1) // sprawdzanie czy wszystkie elementy w tablicy są takie same
            column = elementsInRows[0];
        else {
            System.out.println("Liczba elementów w  tablicach nie jest taka sama, program nie może być wykonywany dalej");
            System.exit(0);
        }

        return column;
    }

    public static void task7() {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        /*
        na potrzeby zadania wystarczy zmiennej row i col przypisać wartość 4
        wywołanie funkcji get size zapewnia poprawne działanie algorytmu dla tablicy zwierającej więcej tablic w sobie
        oraz przerywa działanie programu jeżeli któraś z wewnętrznych tablic ma inną długość
         */

        int row = array.length;
        int column = getSize(array, row);

        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                if (j % 2 == 0)
                    System.out.print(array[i][j] + " ");
                else
                    System.out.print(array[column - 1 - i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("TASK 1: ");
        task1();
        System.out.println("\n" + "TASK 2: ");
        task2();
        System.out.println("\n" + "TASK 3: ");
        task3();
        System.out.println("\n" + "TASK 4: ");
        task4();
        System.out.println("\n" + "TASK 5: ");
        task5();
        System.out.println("\n" + "TASK 6: ");
        task6();
        System.out.println("\n" + "TASK 7: ");
        task7();
    }
}
