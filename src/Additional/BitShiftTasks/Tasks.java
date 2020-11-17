package Additional.BitShiftTasks;

public class Tasks {
    public static void task1() {
        int dec = 13;
        int bin = 0b1101;
        int oct = 015;
        int hex = 0xD;

        if (dec == bin && bin == oct && oct == hex)
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static void task2() {
        int a = 41;

        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));
    }

    public static void task3() {
        /*
         *  5  -  0101
         *  6  -  0110
         *  7  -  0111
         * 12  -  1100
         *  4  -  0100
         * 13  -  1101
         *
         */

        int bin4 = 0b0100;

        System.out.println("Result: " + (bin4 | 0b1));
        System.out.println("Result: " + (bin4 | 0b10));
        System.out.println("Result: " + (bin4 | 0b11));
        System.out.println("Result: " + (bin4 | 0b1000));
        System.out.println("Result: " + (bin4 | 0b0));
        System.out.println("Result: " + (bin4 | 0b1001));

    }

    public static void task4() {
        /*
         *  1  -  0001
         *  4  -  0100
         *  5  -  0101
         *  0  -  0000
         */

        int bin5 = 0b0101;

        System.out.println("Result: " + (bin5 & 0b1));
        System.out.println("Result: " + (bin5 & 0b100));
        System.out.println("Result: " + (bin5 & 0b101));
        System.out.println("Result: " + (bin5 & 0b0));
    }

    public static void task5() {
        /*
         * 15  -  1111
         *  4  -  0100
         *  3  -  0011
         * 11  -  1011
         *  9  -  1001
         */

        int bin7 = 0b0111;

        System.out.println("Result: " + (bin7 | 0b1000));
        System.out.println("Result: " + (bin7 & 0b100));
        System.out.println("Result: " + (bin7 & 0b11));
        // System.out.println("Result: " + (bin7 & 0b1011));
        // System.out.println("Result: " + (bin7 & 0b1001));
    }

    public static void usingModulo(int output) {
        if (output % 2 == 0) System.out.println("number is even");
        else System.out.println("number is odd");
    }

    public static void usingBitShift(int output) {
        if ((output & 0b1) == 0) System.out.println("number is even");
        else System.out.println("number is odd");
    }


    public static void task6() {
        System.out.println("Give me number: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int output = input.nextInt();


        usingBitShift(output);
        usingModulo(output);
    }

    public static void task7() {
        int a = 32;
        System.out.println(a >> 2);
        System.out.println(a >> 1);
        System.out.println(a >> 3);
        System.out.println(a >> 5);
        System.out.println(a >> 7);
    }

    public static void task8() {
        int a = 4;
        System.out.println(a << 2);
        System.out.println(a << 1);
        System.out.println(a << 3);
        System.out.println(a << 4);
        System.out.println(a << 5);
        System.out.println(a << 6);
    }

    public static void task9() {

            System.out.println("Give me number: ");
            //7  -  0111
            java.util.Scanner input = new java.util.Scanner(System.in);
            int output = input.nextInt();

            // 1 bit
            System.out.println("First: "+(output & 0b1));
            // 2 bit
            System.out.println("Second: "+ ((output>>1) & 0b1));
            // 3 bit
            System.out.println("Third: " + ((output>>2) & 0b1));
            // 1 bit i 4 bit
            System.out.println("First: " + (output & 0b1) + " fourth: "+((output>>3) & 0b1));
            // 2 bit i 3 bit
            System.out.println("Second: " + ((output>>1) & 0b1)+ " third: "+((output>>2) & 0b1));

    }

    public static void task10() {

    }

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
        task9();
//        task10();
    }
}
