package PracticeLecture.PPJ04;

import java.util.InputMismatchException;

public class Tasks {
    public static void task1(){
        int a3 = 3;
//        int 3a = 3;
        int $re = 5;
//        int void = 4;
//        int null = 0;
    }
    public static void task2(){
        boolean czyPada = true;
        if(czyPada){
            System.out.println("Oh, it's rainy");
        } else {
            System.out.println("It's sunny right now");
        }
    }
    public static void task3(){
        System.out.println("Give me your number: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        double input;
        try {input = in.nextDouble();

            if (input < 10) {
                System.out.println("Lower than 10, 100 and 1000");
            } else if (input < 100) {
                System.out.println("Lower than 100, 1000");
            } else if (input < 1000) {
                System.out.println("Lower than 1000");
            } else {
                System.out.println("Greater than 1000");
            }

            //task 4
            if (input >= 0 ) System.out.println("A");
            if (input <= 1 ) System.out.println("B");
            if (input >= 0 && input <= 1 ) System.out.println("C");
        }
        catch (InputMismatchException e ) {
            System.out.println("You give number in wrong format");
        }
    }
    public static void task4(){
        //Dane są następujące zbiory:
        // ● A = (-15;-10]∪ (-5; 0) ∪ [5; 10)
        // ● B = (∞;-13]∪ (-8;-3)
        // ● C = (-4;∞)
        // Napisz program klasyfikujący zmienną X do tych przedziałów.

        System.out.println("Give me your number: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        double input;
        try {input = in.nextDouble();

            if (input > -15 && input <= -10 || input>-5 && input<0 || input>+5 && input <10  ) System.out.println("A");
            if (input <= -13 || input > -8 && input <-3) System.out.println("B");
            if (input <= -4 ) System.out.println("C");

        }
        catch (InputMismatchException e ) {
            System.out.println("You give number in wrong format");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}
