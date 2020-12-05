package PracticeLecture.SwitchCase;

public class Tasks {
    public static void task1() {
        System.out.println("Give me the number: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        double output = input.nextDouble();


        if (output > -15 && output < -10 || -5 < output && output < 0 || 5 < output && output < 10)
            System.out.println('A');
        if (output < -13 || -8 < output && output < -3) System.out.println('B');
        if (output > -4) System.out.println('C');

    }

    public static void task2() {
        int x = 4;
        long y = x * 4 - x++;
        if (y < 12) System.out.println("not enough");
        else System.out.println("ideal");
    }


    public static void teacherCode(int output) {
        int bit2 = output & 0b11;
        //   1010101
        // & 0000011
        //   0000011

        switch (bit2) {
            case 0b01:
                System.out.println("case 1");
                System.out.println(output & 0b111111);
                break;
            case 0b10:
                for (int i = 0; i < 9; i++) {
                    System.out.println(Math.pow(2, i));
                }
                break;
            case 0b11:
                double pi = Math.PI;
                System.out.format("%.12f%n", pi);
                break;
            case 0b00:
                System.out.println("#000000");
                break;

        }
    }

    public static void myCode(int output) {
        String lastBytes;
        lastBytes = (Integer.toString(output >> 1 & 0b1) + (output & 0b1));

        System.out.println(lastBytes);
        switch (lastBytes) {
            case "01":
                System.out.println((output >> 2) & 0b1 + (output >> 3) & 0b1 + (output >> 4) & 0b1 + (output >> 5) & 0b1);
                break;
            case "10":
                for (int i = 0; i < 9; i++) {
                    System.out.println(Math.pow(2, i));
                }
                break;
            case "11":
                double pi = Math.PI;
                System.out.format("%.12f%n", pi);
                break;
            case "00":
                System.out.println("#000000");
                break;

        }
    }

    public static void task3() {
        System.out.println("Give me the number: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int output = input.nextInt();

        teacherCode(output);
        myCode(output);
    }

    public static void task4() {
        int breakPoint = -1;
        int output;
        int max = Integer.MIN_VALUE;
        int maxSumNumber = 0;
        while (breakPoint != 0) {
            System.out.println("Give me the number: ");
            java.util.Scanner input = new java.util.Scanner(System.in);
            output = input.nextInt();
            breakPoint = output;

            int temp = 0;

            while (output > 0) {
                temp = temp + output % 10;
                output = output / 10;
            }

            if (temp > max) {
                max = temp;
                maxSumNumber = breakPoint;
            }

        }
        System.out.println("Max sum of digits was: " + max + " for: " + maxSumNumber);
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}
