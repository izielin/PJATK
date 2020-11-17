package Practice.IfStatement;

public class Lecture {
    public static void main(String[] args) {
        // AND - & OR - | XOR - ^
        // AND - && OR - || NOT - !

        boolean a = true;
        boolean b = false;

        int c = 16;
        int d = 20;

        // <,>  <=, >=  ==, !=

        if(c > 20 || d > 4){
            System.out.println("something goes here");
        } else if (c == d) {
            System.out.println("another statement");
        }
        else {
            System.out.println("something else goes here");
        }
    }
}
