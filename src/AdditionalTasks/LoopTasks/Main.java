package AdditionalTasks.LoopTasks;

import java.util.Scanner;

public class Main {
    // task 1
    public static void task1() {
        int input = -1;
        int sum = 0, amount = -1;
        while (input != 0) {
            System.out.println("Podaj liczbę: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            sum += input;
            amount += 1;
        }

        System.out.println("sum: " + sum);
        System.out.println("amount: " + amount);
        System.out.println("byte: " + ((sum >> 1) & 0b1));
    }

    public static void byteToHex() {
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        byte input = scanner.nextByte();

        if (input < 10) {
            System.out.println((char) ('0' + input));
        } else if (input < 16) {
            System.out.println((char) ('A' + (input - 10)));
        } else {
            System.out.println("Choose value between 0-15");
        }
    }

    public static void byteTo4() {
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        byte input = scanner.nextByte();
        int rest = Integer.MAX_VALUE;

        while (rest > 4) {
            rest = (byte) (input % 4);
            System.out.print(input / 4);
            input = (byte) rest;
        }
        System.out.print(rest);

        /*
        int VAL = 13;
        string s = "";
        while (VAL>=1){
            int rest = VAL %2;
            s = rest+s;
            Val/=2;
        }
        System.out.println(s);
         */

    }


    // task 2
    public static void draw(String character, int size) {
        int targetSize = size * 2 + 1;
        for (int i = 1; i <= targetSize; i++) {
            for (int j = 1; j <= targetSize; j++) {
                if (j <= size || j == targetSize || j == size + 2 || i == 1 && j != size + 1 || i == targetSize && j != size + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static String draw2(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || // first & last line
                        j >= i && j <= size - (i - 1) && i < size / 2 + 1 || // top triangle
                        j >= size - i + 1 && j <= i && i > size / 2 - 1 // bottom triangle
                )
                    System.out.print("*");
                else
                    System.out.print('.');
            }
            System.out.println();
        }
        return "End Task";
    }

    public static String draw3(int size) {
        int targetSize = size * 2 + 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= targetSize; j++) {
                if (j == 1 || j == size // first rectangle vertical edges
                        || j == size + 2 || j == targetSize  // second rectangle vertical edges
                        || i == size && j != size + 1 // bottom edge
                        || i == 1 && j != size + 1 //top edge
                        || i == size / 2 + 1 && j != size + 1 && j > size + 1 // horizontal arm of cross
                        || j == size + 2 + size / 2 // vertical arm of cross
                        || j == i && i < size + 1 || j == size - (i - 1) || j == size - i + 1 // diagonals
                )
                    System.out.print("*");
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
        return "End Task";
    }

    public static void task2() {
        System.out.println("Podaj rozmiar i znak: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
//        String character = scanner.next();
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(i);
        System.out.println((size % 2) == 0 ? "Even number" : draw3(size));
//            System.out.println();
//
//        }
    }

    // task 3
    public static void task3() {
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        float cash = scanner.nextFloat();

        int pln10 = 0;
        int pln5 = 0;
        int pln2 = 0;
        int pln1 = 0;
        int gr50 = 0;
        int gr20 = 0;
        int gr10 = 0;
        int gr5 = 0;
        int gr2 = 0;
        int gr1 = 0;

        // 10 zł
        while ((cash - 10.0) >= 0) {
            pln10++;
            cash = (float) (cash - 10.0);
        }

        // 5 zł
        while ((cash - 5.0) >= 0) {
            pln5++;
            cash = (float) (cash - 5.0);
        }
        // 2 zł
        while ((cash - 2.0) >= 0) {
            pln2++;
            cash = (float) (cash - 2.0);
        }
        // 1 zł
        while ((cash - 1.0) >= 0) {
            pln1++;
            cash = (float) (cash - 1.0);
        }
        // 50gr
        while ((cash - .5) >= 0) {
            gr50++;
            cash = (float) (cash - .5);
        }
        // 20gr
        while ((cash - .2) >= 0) {
            gr20++;
            cash = (float) (cash - .2);
        }
        // 10gr
        while ((cash - .1) >= 0) {
            gr10++;
            cash = (float) (cash - .1);
        }
        // 5gr
        while ((cash - .05) >= 0) {
            gr5++;
            cash = (float) (cash - .05);
        }
        // 2gr
        while ((cash - .02) >= 0) {
            gr2++;
            cash = (float) (cash - .02);
        }
        // 1gr
        while ((cash - .01) >= 0) {
            gr1++;
            cash = (float) (cash - .01);
        }

        System.out.println(pln10 + " * 10 zł");
        System.out.println(pln5 + " * 5 zł");
        System.out.println(pln2 + " * 2 zł");
        System.out.println(pln1 + " * 1 zł");
        System.out.println(gr50 + " * 50 gr");
        System.out.println(gr20 + " * 20 gr");
        System.out.println(gr10 + " * 10 gr");
        System.out.println(gr5 + " * 5 gr");
        System.out.println(gr2 + " * 2 gr");
        System.out.println(gr1 + " * 1 gr");

    }

    public static void main(String[] args) {
//        task1();
//        byteToHex();
//        byteTo4();
        task2();
//        task3();
    }
}
