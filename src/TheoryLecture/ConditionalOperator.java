package TheoryLecture;

import java.util.Scanner;

public class ConditionalOperator {
    private enum Day{SUNNY, CLOUDY}

    public static void one() {
        double sum = 1000;
        int count = 5;

        double average = (count == 0) ? 0 : sum / count;

        if (count == 0) average = 0;
        else average = sum / count;

        System.out.println(average);
    }

    public static void two() {
        //(-Infinity : 5> --> green
        //<0 : 5> --> green-red
        //<5 : Infinity) --> red

        Scanner input = new Scanner(System.in);
        System.out.println("Give number: ");
        int x = input.nextInt();

        //problem 1
        if (x <= 0)
            System.out.println("x->green");
        else if (x >= 5)
            System.out.println("x->red");
        else
            System.out.println("x-> red-green");

        //problem 2
        if (x >= 0 && x <= 5) {
            System.out.println("x-> red-green");
            System.out.println("another comment");
        }

        // ==================

    }

    public static void switchStatement1() {
        int x = 19;
        switch (x) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> System.out.print(x);
            case 10 -> System.out.print("A");
            case 11 -> System.out.print("B");
            case 12 -> System.out.print("C");
            case 13 -> System.out.print("D");
            case 14, 15 -> System.out.print((char) ('A' + (x - 10)));
            default -> System.out.println("Error");
        }
        /*
        * switch (x) {
            case 0:
                System.out.print(x);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.print(x);
                break;
            case 10:
                System.out.print("A");
                break;
            case 11:
                System.out.print("B");
                break;
            case 12:
                System.out.print("C");
                break;
            case 13:
                System.out.print("D");
                break;
            case 14:
            case 15:
                System.out.print((char) ('A' + (x - 10)));
                break;
        } */

    }

    public static void switchStatement2() {

        Day day = Day.SUNNY;
        switch (day){
            case SUNNY:
                System.out.println("sun");
                break;
            case CLOUDY:
                System.out.println("rain");
                break;
        }

        //=========

        final String animal = "DOG";
        String result=null;
        switch (animal) {
            case "DOG" -> result = "domestic animal";
            case "CAT" -> result = "feline";
            default -> result = "It's not a pet";
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
//        two();
        switchStatement2();
    }
}
