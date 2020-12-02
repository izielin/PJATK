package Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static AuxiliaryFunctions.Arrays.*;

public class Main {

    //zadanie 1
    public static void task1() {
        double[] doubles = new double[10];

        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = (int) (Math.random() * 100); // wypełnianie losowymi wartościami z zakresu 0-100
        }

        System.out.println("Cała tablica: ");
        printDoubleArray(doubles);
        System.out.println();

        System.out.println("Wartości na parzystych indeksach: ");
        for (int i = 0; i < doubles.length; i += 2) { // można też zwiększać i o jeden za każdym przejściem pętli co da taki sam efekt: for (int i = 0; i < numbers.length; i++)
            System.out.print(doubles[i]);  // tylko wtedy musimy zadbać o to żeby wybierać tylko parzyste i: System.out.print(i % 2 == 0 ? doubles[i] + ", " : "");
        }
        System.out.println();

        System.out.println("Wartości które po rzutowaniu na int są nieparzyste: ");
        for (double v : doubles) {
            System.out.print((int) v % 2 != 0 ? v + ", " : "");
        }
    }

    //zadanie 2
    public static void task2() {
        char[] chars = {'a', '!', 'w'}; //dowolne znaki
        int minimumAsciiCode = 128; // przypisanie największej możliwej wartości kodu ascii + 1, dla pewności, że każdy podany znak będzie mniejszy od zmiennej min
        char result = '0';

        for (char c : chars) { // alternatywnie for(int i=0;i<chars.length;i++)
            if ((int) c < minimumAsciiCode) { // if ((int) char[i] < minimumAsciiCode)
                minimumAsciiCode = c; // minimumAsciiCode = (int) char[i];
                result = c; // result = char[i];
            }
        }
        System.out.println(result);
    }

    //zadanie 3
    public static void task3() {
        char[] chars = new char[5];
        int counter = 0;

        for (int i = 0; i < chars.length; i++) {
            /*
            posługujemy się kodem ascii, dużych liter jest 26, stąd losujemy wartość między 0 i 26
            korzystamy z funkcji (Math.random() * (max - min)) + min
            gdzie max to liczba na której zakres się kończy
            a min to liczba na której zakres się zaczyna
             */
            chars[i] = (char) ('A' + (Math.random() * (26)));
        }

        printCharArray(chars);

        System.out.println("Podaj znak który chcesz znaleźć: ");
        Scanner in = new Scanner(System.in);
        char input = in.next().charAt(0);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == input)
                counter += 1; // sprawdzamy czy wprowadzony znak jest taki sam jak znajdujący się w tablicy na pozycji z indeksem i
            chars[i] = '0';
        }

        System.out.println(counter);
        printCharArray(chars);

    }

    //zadanie 4
    public static void task4() {
        int[] numbers = new int[(int) ((Math.random() * (15 - 10)) + 10)];

        /*
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * numbers.length);
        }
        */
        fillIntArray(numbers, numbers.length, 0);

        for (int i = numbers.length - 1; i >= 0; i--) {
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

        for (int n : numbers) {
            for (int i = 0; i < numbers.length; i++) {
                if (n == i) System.out.print(" * ");
                else System.out.print(" . ");
            }
            System.out.println();
        }
    }

    //zadanie 5
    public static int searchMax(int[] array) {
        // wyszukiwanie największej liczby w tablicy
        int max = Integer.MIN_VALUE; // deklaracja najmniejszą wartością int żeby mieć pewność że każda liczba w tablicy będzie większa od zmiennej min
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    public static int searchMin(int[] array) {
        // wyszukiwanie najmniejszej liczby w tablicy
        int min = Integer.MAX_VALUE;
        for (int i : array) {
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

        int highRange, lowRange;
        System.out.println("Podaj zakres w jakim mają zostać rozlosowane liczby: ");
        Scanner scanner = new Scanner(System.in);
        highRange = scanner.nextInt();
        lowRange = scanner.nextInt();

        fillIntArray(array1, highRange, lowRange); // uzupełnianie tablicy 1
        fillIntArray(array2, highRange, lowRange); // uzupełnianie tablicy 2

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

        /*
        do tablicy 4 można podejść dwojako, albo zadeklarować ją jako: "int[] array4 = new int[array1.length + array2.length];"
        wtedy większość tablicy przyjmie wartości 0 a do jej uzupełniania wykorzystujemy instrukcję: "array4[length++] = array1[i];"
        która powinna być umieszczona zamiast instrukcji: "array4 = appendToExistingArray(array4, array1[i]);"

        zastosowane przez mnie rozwiązanie jest nieco bardziej zaawansowane i zakłada rozszerzanie tablicy array4 według
        ilości powtarzających się liczb
         */

        // nowa tablica zawierająca elementy występujące w obu tablicach
        int[] array4 = new int[0];

        // szukamy wspólnych liczb w obu tablicach
        for (int k : array1) {
            for (int i : array2) {
                if (k == i)
                    array4 = appendIntToExistingArray(array4, k);
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
        printIntArray(array1);
        System.out.println("\n" + "Druga tablica wejściowa: ");
        printIntArray(array2);
        System.out.println("\n" + "Tablica zawierająca elementy występujące w obu tablicach: ");
        printIntArray(array3);
        System.out.println("\n" + "Tablica zawierająca elementy występujące w obu tablicach");
        printIntArray(array4);
        System.out.println("\n" + "Tablica liczb całkowitych z przedziału pomiędzy elementem o najmniejszej a największej wartości z obu tablic wejściowych");
        printIntArray(array5);

    }

    // zadanie 6
    public static void task6() {
        int length = 13;
        double[] doubles = new double[length];
        int[] numbers = new int[length];
        int tempInt;
        double tempDouble, temp;


        for (int i = 0; i < length; i++) {
            doubles[i] = Math.random() * 1000;
            numbers[i] = (int) (Math.random() * 1000);
        }

        double[] results = new double[length];
        for (int i = 0; i < results.length; i++) {
            results[i] = numbers[i] + numbers[i];
        }

        for (int i = 0; i < results.length; i++) {
            for (int j = i + 1; j < results.length; j++) {
                if (results[i] > results[j]) {
                    temp = results[i];
                    tempInt = numbers[i];
                    tempDouble = doubles[i];
                    results[i] = results[j];
                    numbers[i] = numbers[j];
                    doubles[i] = doubles[j];
                    results[j] = temp;
                    numbers[j] = tempInt;
                    doubles[j] = tempDouble;
                }
            }
        }

        System.out.println("\n" + "Tabela liczb całkowitych:");
        printIntArray(numbers);
        System.out.println("\n" + "Tabela liczb zmiennoprzecinkowych:");
        printDoubleArray(doubles);
        System.out.println("\n" + "Tabela sum:");
        printDoubleArray(results);
    }

    //zadanie 7
    public static int getSize(int[][] array, int row) {
        int column = 0;
        int[] elementsInRows = new int[row];

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
        int[][] array2D = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        /*
        na potrzeby zadania wystarczy zmiennej row i col przypisać wartość 4
        wywołanie funkcji getSize zapewnia poprawne działanie algorytmu dla tablicy zwierającej więcej tablic w sobie
        (co możecie sprawdzić dodając kolejne 4-elementowe tablice, do tablicy array2D)
        oraz przerywa działanie programu jeżeli któraś z wewnętrznych tablic ma inną długość
         */

        int rowSize = array2D.length;
        int columnSize = getSize(array2D, rowSize);

        for (int j = 0; j < columnSize; j++) {
            for (int i = 0; i < rowSize; i++) {
                if (j % 2 == 0)
                    System.out.print(array2D[i][j] + " ");
                else
                    System.out.print(array2D[columnSize - 1 - i][j] + " ");
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
