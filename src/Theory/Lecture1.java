package Theory;

public class Lecture1 {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(012);
        System.out.println(0xA);
        System.out.println(0b1010);

        System.out.println(!true);
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || false);

        System.out.print("5 < 8 == ");
        System.out.println(5 < 8);

        System.out.print("8 % 2==");
        System.out.println(8 % 2);

        System.out.println(8 < 8 ? "8 jest mniejsze od 8" : 8 > 8 ? "8 jest większe od 8" : "8 jest równe 8");

        System.out.print((81 >> 7) & 1);
        System.out.print((81 >> 6) & 1);
        System.out.print((81 >> 5) & 1);
        System.out.print((81 >> 4) & 1);
        System.out.print(" ");
        System.out.print((81 >> 3) & 1);
        System.out.print((81 >> 2) & 1);
        System.out.print((81 >> 1) & 1);
        System.out.print((81 >> 0) & 1);
        System.out.println(" ");

        // ========================================

        // operator dodawania zapisany w bitach
        System.out.println(81 ^ 13);
        System.out.println((81 & 13) << 1);
        System.out.println(92 ^ 2);
        System.out.println((92 & 2) << 1);
    }
}
