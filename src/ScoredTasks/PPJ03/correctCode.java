package ScoredTasks.PPJ03;

public class correctCode {
    public static void main(String[] args) {
        int a = 103685;
        int b = 77502;
        int c = a % b;

        System.out.println(c);
        c = 063107;

        //110011001000111
        //000000000000001

        if ((c & 0b1) == 0) {
            System.out.print('G');
        } else {
            System.out.print('2');
        }

        if (((c >> 1) & 0b1) == 0) {
            System.out.print('Q');
        } else {
            System.out.print('r');
        }

        if (((c >> 2) & 0b1) == 0) {
            System.out.print('}');
        } else {
            System.out.print('a');
        }

        if (((c >> 3) & 0b1) == 0) {
            System.out.print('t');
        } else {
            System.out.print('L');
        }

        if (((c >> 4) & 0b1) == 0) {
            System.out.print('u');
        } else {
            System.out.print('2');
        }

        if (((c >> 5) & 0b1) == 0) {
            System.out.print('l');
        } else {
            System.out.print('P');
        }

        if (((c >> 6) & 0b1) == 0) {
            System.out.print('4');
        } else {
            System.out.print('a');
        }

        if (((c >> 7) & 0b1) == 0) {
            System.out.print('c');
        } else {
            System.out.print('J');
        }


        if (((c >> 8) & 0b11) == 0) {
            System.out.print('a');
        } else if (((c >> 8) & 0b11) == 1) {
            System.out.print('1');
        } else {
            System.out.print('j');
        }

        if (((c >> 10) & 0b11) == 0) {
            System.out.print('e');
        } else if (((c >> 10) & 0b11) == 1) {
            System.out.print('e');
        } else {
            System.out.print(':');
        }

        if (((c >> 12) & 0b11) == 0) {
            System.out.print('i');
        } else if (((c >> 12) & 0b11) == 1) {
            System.out.print('t');
        } else {
            System.out.print(':');
        }

        if (((c >> 14) & 0b11) == 0) {
            System.out.print('D');
        } else if (((c >> 14) & 0b11) == 1) {
            System.out.print(')');
        } else {
            System.out.print('<');
        }
    }
}
