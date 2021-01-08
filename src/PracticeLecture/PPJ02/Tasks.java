package PracticeLecture.PPJ02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tasks {
    public static void task1() {
        int integerVariable = 311;
        char charVariable = 'a';
        float floatVariable = (float) 3.3;
        double doubleVariable = 3.2;
        byte byteVariable = 110;


        System.out.println(charVariable+integerVariable);
        System.out.println(integerVariable+charVariable);
        System.out.println(doubleVariable+floatVariable);
        System.out.println(integerVariable+byteVariable);
    }

    public static void task2() {
        System.out.println("Give me your number: ");
        Scanner in = new Scanner(System.in);
        byte wrt = in.nextByte();
//        int wrt = in.nextInt();
        String s1 = String.format("%7s", Integer.toBinaryString(wrt & 0xFF)).replace(' ', '0');
        String s2 = new StringBuilder(s1).reverse().toString();
        ArrayList<String> outputArrayList = new ArrayList<>();
        int currentPower = -1;

        for (int i = 0; i < s2.length(); i++){
            int c = (int) s2.charAt(i) - 48;
            currentPower += 1;
            if (c == 0) {
                outputArrayList.add("0");
            } else {
                outputArrayList.add(Integer.toString((int)Math.pow(2, currentPower)));
//                outputArrayList.add("1");
            }
        }
        Collections.reverse(outputArrayList);
        StringBuilder finalOutput = new StringBuilder();
        for (String s : outputArrayList) {
            finalOutput.append(s).append(" ");
        }
        System.out.println(finalOutput);
    }

    public static void task3() {
        System.out.println("Give me your number: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        int input =  in.nextInt();
        String output = Character.toString((char) input);
        System.out.println(">"+output+"< - "+ input);
    }

    public static void task4() {
        int A = 13;
        int B = 19;
        System.out.println("Before: " + A);
        System.out.println("Before: " + B);
        A = A^B;
        B = A^B;
        A = A^B;

        System.out.println("After: " +A);
        System.out.println("After: " +B);
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}
