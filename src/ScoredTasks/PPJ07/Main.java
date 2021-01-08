package ScoredTasks.PPJ07;

import java.util.Scanner;

public class Main {

    //task 1
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        byte input = scanner.nextByte();

        StringBuilder builder = new StringBuilder();
        int rest = input;

        while (rest > 1) {
            input = (byte) rest;
            builder.append(input % 2);
            rest = input / 2;
        }
        builder.append(rest);

        System.out.println(builder.reverse());
    }

    //task 2
    public static String draw(int size) {

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == i || j == size - (i - 1) || j == size - i + 1)
                    System.out.print("*");
                else
                    System.out.print(".");
            }
            System.out.println();
        }

        return "End Task";
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println((input % 2) == 0 ? "Even number" : draw(input));

    }

    // task 3
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int tempInput = input;
        StringBuilder builder = new StringBuilder();
        StringBuilder romanBuilder = new StringBuilder();
        StringBuilder decBuilder = new StringBuilder();

        if (input < 4000) {
            while ((input - 1000) >= 0) {
                builder.append("M");
                romanBuilder.append("M+");
                decBuilder.append("1000+");
                input -= 1000;
            }
            while ((input - 900) >= 0) {
                builder.append("CM");
                romanBuilder.append("CM+");
                decBuilder.append("900+");
                input -= 900;
            }
            while ((input - 800) >= 0) {
                builder.append("DCCC");
                romanBuilder.append("DCCC+");
                decBuilder.append("800+");
                input -= 800;
            }
            while ((input - 700) >= 0) {
                builder.append("DCC");
                romanBuilder.append("DCC+");
                decBuilder.append("700+");
                input -= 700;
            }
            while ((input - 600) >= 0) {
                builder.append("DC");
                romanBuilder.append("DC+");
                decBuilder.append("600+");
                input -= 600;
            }
            while ((input - 500) >= 0) {
                builder.append("D");
                romanBuilder.append("D+");
                decBuilder.append("500+");
                input -= 500;
            }
            while ((input - 400) >= 0) {
                builder.append("CD");
                romanBuilder.append("CD+");
                decBuilder.append("400+");
                input -= 400;
            }
            while ((input - 100) >= 0) {
                builder.append("C");
                romanBuilder.append("c+");
                decBuilder.append("100+");
                input -= 100;
            }
            while ((input - 90) >= 0) {
                builder.append("XC");
                romanBuilder.append("XC+");
                decBuilder.append("90+");
                input -= 90;
            }
            while ((input - 80) >= 0) {
                builder.append("LXXX");
                romanBuilder.append("LXXX+");
                decBuilder.append("80+");
                input -= 80;
            }
            while ((input - 70) >= 0) {
                builder.append("LXX");
                romanBuilder.append("LXX+");
                decBuilder.append("70+");
                input -= 70;
            }
            while ((input - 60) >= 0) {
                builder.append("LX");
                romanBuilder.append("LX+");
                decBuilder.append("60+");
                input -= 60;
            }
            while ((input - 50) >= 0) {
                builder.append("L");
                romanBuilder.append("L+");
                decBuilder.append("50+");
                input -= 50;
            }
            while ((input - 40) >= 0) {
                builder.append("XL");
                romanBuilder.append("XL+");
                decBuilder.append("40+");
                input -= 40;
            }
            while ((input - 10) >= 0) {
                builder.append("X");
                romanBuilder.append("X+");
                decBuilder.append("10+");
                input -= 10;
            }
            while ((input - 9) >= 0) {
                builder.append("IX");
                romanBuilder.append("IX+");
                decBuilder.append("9+");
                input -= 9;
            }
            while ((input - 8) >= 0) {
                builder.append("VIII");
                romanBuilder.append("VIII+");
                decBuilder.append("8+");
                input -= 8;
            }
            while ((input - 7) >= 0) {
                builder.append("VII");
                romanBuilder.append("VII+");
                decBuilder.append("7+");
                input -= 7;
            }
            while ((input - 6) >= 0) {
                builder.append("VI");
                romanBuilder.append("VI+");
                decBuilder.append("6+");
                input -= 6;
            }
            while ((input - 5) >= 0) {
                builder.append("V");
                romanBuilder.append("5+");
                decBuilder.append("5+");
                input -= 5;
            }
            while ((input - 4) >= 0) {
                builder.append("IV");
                romanBuilder.append("IV+");
                decBuilder.append("4+");
                input -= 4;
            }
            while ((input - 1) >= 0) {
                builder.append("I");

                romanBuilder.append("I+");
                decBuilder.append("1+");
                input -= 1;
            }


        } else System.out.println("Limit to 4000");
        System.out.println(builder + " = " + romanBuilder + " = " + decBuilder + " = " + tempInput);

    }


    public static void main(String[] args) {


//        task1();
        task2();
//        task3();


    }
}
