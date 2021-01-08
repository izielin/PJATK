package PracticeLecture.PPJ06;

import java.util.Scanner;

public class Main {
    public static void task1() {
        int x = 2 * 5 + (int) 3.14 * 4;
        System.out.println(x);
        x = x << -7;
        System.out.println(x);
        x = x >> 3;


        System.out.println(x);
    }

    public static double calculations(double height, double weight) {
        return (weight / Math.pow(height, height));
    }

    public static void task2() {
        double height;
        double weigth;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello in BMI calculator!");
        System.out.println("Your weight (kg): ");
        weigth = input.nextDouble();
        System.out.println("Your height (m): ");
        height = input.nextDouble();

        System.out.println(calculations(height, weigth));
    }

    public static void task3() {
        int high = Integer.MIN_VALUE;
        int medium = 0;
        int low = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int curr;
            Scanner input = new Scanner(System.in);
            System.out.println("Give number: ");
            curr = input.nextInt();

            if (curr > high){
                low=medium;
                medium = high;
                high=curr;
            } else if (curr>medium){
                low = medium;
                medium = curr;
            } else {
                low = curr;
            }

        }
        System.out.print(high + ", " + medium + ", " + low);
    }

    public static void task4() {
        int high = Integer.MIN_VALUE;
        int mid1 = 0;
        int mid2 = 0;
        int low = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            int curr;
            Scanner input = new Scanner(System.in);
            System.out.println("Give number: ");
            curr = input.nextInt();

            if (curr > high) {
                low = mid2;
                mid2 = mid1;
                mid1 = high;
                high = curr;
            } else if (curr > mid1) {
                low = mid2;
                mid2 = mid1;
                mid1 = curr;
            } else if (curr > mid2) {
                low = mid2;
                mid2 = curr;
            } else {
                low = curr;
            }
        }
        System.out.print(high - low);
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}
