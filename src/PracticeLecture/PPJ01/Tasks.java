package PracticeLecture.PPJ01;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // min max value of each type
        boolean booleanMaxValue = true; // 1
        boolean booleanMinValue = false; // 0
        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        float floatMinValue = Float.MAX_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;
        double doubleMinValue = Double.MIN_VALUE;
        char charMaxValue = Character.MAX_VALUE;
        char charMinValue = Character.MIN_VALUE;

        System.out.println(booleanMaxValue);
        System.out.println(booleanMinValue);
        System.out.println(intMinValue);
        System.out.println(intMaxValue);
        System.out.println(floatMaxValue);
        System.out.println(floatMinValue);
        System.out.println(doubleMaxValue);
        System.out.println(doubleMinValue);
        System.out.println(charMaxValue);
        System.out.println(charMinValue);

        // answer 14
        int x = 2 * 5 + 3 * 4 - 8;
        System.out.println(x);

        int y = 2 * (((5 + 3) * 4) - 8);
        System.out.println(y);

        //student app
        System.out.println("Give me your number: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        int studentId = in.nextInt();
        System.out.println("Hello student s" + studentId);
    }
}
