package PracticeLecture.ScanerTasks;

public class Lecture {
    public static void main(String[] args) {
        int a = 13;
        int b = 17;

        int and = a&b;
        int or = a|b;
        int xor = a^b;

        System.out.println("and: " + and);
        System.out.println("or: " + or);
        System.out.println("xor: " + xor);

        // 1101
        // 0100
        // 13>>2 = 0011 = 3
        // 13<<2 = 110100 = 52

    }
}
