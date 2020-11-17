package Theory;

public class RecurringInstructions {

    public static void whileInstruction(){
        int wrt = 0;
        while (wrt < 10){
            System.out.println("while: " + wrt);
            wrt++;
        }
    }

    public static void doWhileInstruction(){
        int wrt = 0;
        do {
            System.out.println("do-while: " + wrt);
            wrt++;
        } while (wrt < 10);
    }

    public static void forLoop(){
        for (int i = 0; i >= 0 ; i--) {
            System.out.println("for loop: " + i);
        }

        int suma = 0;

        for (int i = 1; i <=9 ; i++) {
            if (i < 3){
                suma--;
                continue;
            }else if (suma >7)
                break;
            suma = suma + 2*i;
        }
        System.out.println(suma);


    }

    public static void main(String[] args) {
        whileInstruction();
        doWhileInstruction();
        forLoop();
    }
}
