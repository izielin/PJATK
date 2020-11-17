package Practice.Loops;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task1() {
        System.out.println("\n" + "TASK 1");

        List<Integer> months = new ArrayList<>();
        months.add(31);
        months.add(29);
        months.add(31);
        months.add(30);
        months.add(31);
        months.add(30);
        months.add(31);
        months.add(31);
        months.add(30);
        months.add(31);
        months.add(30);
        months.add(31);

        int day = 13;
        int month = 11;
        int sumOfDays = -1;

        for (int i = 0; i < months.size(); i++) {
            if (i < (month - 1)) sumOfDays += months.get(i);
            else if (i == (month - 1)) sumOfDays += day;
            else break;
        }
        System.out.println(sumOfDays);
    }

    private static void task2() {
        System.out.println("\n" + "TASK 2");
        for (int i = 1; i < 11; i++) {
            System.out.print(i+" ");
        }

    }

    private static void task3() {
        System.out.println("\n" + "TASK 3");

        int wrt = 5;
        for (int i = 1; i < 11; i++) {
            System.out.print(i * wrt+" ");
        }
    }

    private static void task4() {
        System.out.println("\n" + "TASK 4");

        int a = 0;

        while (a != 0) {
            System.out.println("while loop");
        }

        do {
            System.out.println("do-while loop");
        } while (a != 0);

    }

    private static void task5() {
        System.out.println("\n" + "TASK 5");
        for (int i = 0; i < 10; i++) {
            System.out.println(1 / Math.pow(2, i));
        }
    }

    private static void task6() {
        System.out.println("\n" + "TASK 6");
        int total;
        for (int row = 1; row <= 8; row++) {
            for (int col = 0; col <= 8; col++) {
                total = row + col;
                if (total % 2 != 0) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void task7() {
        System.out.println("\n" + "TASK 7");
        int total;
        for (int row = 0; row <= 6; row++) {
            for (int num = 0; num <= row; num++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void task8() {
        System.out.println("\n" + "TASK 8");
        for (int i = 75; i <= 150; i++) {
            System.out.println((char) (i) + " - " + i);
        }
    }

    private static void task9() {
        System.out.println("\n" + "TASK 9");

        byte input = 11;
        if (input < 10) {
            System.out.println((char) ('0' + input));
        } else {
            System.out.println((char) ('A' + (input - 10)));
        }
    }


}
