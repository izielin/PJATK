package TheoryLecture;

import java.util.Scanner;

public class Arrays {
    /*
     *
     * statyczne (static array) - indeksacja elementów i wielkość są ustalane przed uruchomieniem programu;
     * dynamiczne - na zadanym stosie (fixed stack-dynamic array) - indeksacja elementów jest ustalona, a miejsce jest alokowane podczas opracowania deklaracji;
     * dynamiczne - na zadanej stracie (fixed heap-dynamic array) - indeksacja elementów jak i powiązanie miejsca następuje po alokacji zasobów;
     * dynamiczne - na stercie (heap-dynamic array) - indeksacja elementów jak i zarezerwowane miejsce mogą sią zmienić w czasie życia tablicy;
     *
     * Tablicą jest zmienna składająca się z zestawu elementów. Każdy element jest zmienną typu protego lub odnośnikowego.
     * Wszystkie element tablicy są takiego samego typu
     * Liczba elementów nie może być większa od największej liczby typu int
     * Z każdym elementem tablicy związany jest index. Indeks jest nieujemną liczbą, poczynając od numeru 0
     *
     */
    public static void lecture1() {
        //fill
        int[] numbers = new int[10];
//        int[] numbers = {10,20,30};
        String[] strings = {"Ewa", "Jan", "Maciej"};
        System.out.println(numbers.length);

        for (String string : strings) {
            System.out.println(string);
        }

        for (int i : numbers) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        //===============================
        //search
        int valS = 15;
        for (int val : numbers) {
            if (val == valS)
                System.out.println("znaleziono na indeksie " + val);
        }
        System.out.println("nie znaleziono szukanego elementu");

        //===============
        //delete
        int[] arrSt = new int[10];
        int fill = 0;

        System.out.println("\n" + "Wypełnij tablicę: ");
        Scanner scanner = new Scanner(System.in);
        while (fill < arrSt.length) {
            arrSt[fill++] = scanner.nextInt();
        }

        int delIndex = 5;
        for (int i = delIndex; i < fill; i++) {
            arrSt[i] = arrSt[i + 1];
        }
        fill--;
        arrSt[fill] = 0;

        //============
        int[][] arr2D = new int[2][3]; // int[][] arr2D = {{3,2,1},{8,5,7}}
        double[][] double2D = new double[2][];
        double2D[0] = new double[100];
        double2D[1] = new double[1000];
    }

    public static void printIntArray(int[] array, int fill) {
        for (int i = 0; i < fill; i++) {
            System.out.print(array[i] + ((i < fill - 1) ? ", " : "\n"));
        }
    }

    public static void fillArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        int fill = 0;
        int data;
        //insert base data
        while ((data = scanner.nextInt()) != 0) {
            array[fill++] = data;
            printIntArray(array, fill);
        }

        //insert additional data
        System.out.println("Insert element: ");
        data = scanner.nextInt();
        int pos = 1;

        for (int i = fill - 1; i >= pos; i--) {
            array[i + 1] = array[i];
        }

        array[pos] = data;
        fill++;

        printIntArray(array, fill);

        //delete element
        System.out.println("Delete element: ");
        pos = scanner.nextInt();
        for (int i = pos; i < fill; i++) {
            array[i] = array[i + 1];
        }
        fill--;

        printIntArray(array, fill);
    }

    public static void main(String[] args) {
        fillArray();
    }
}
