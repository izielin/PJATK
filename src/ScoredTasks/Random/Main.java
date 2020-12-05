package ScoredTasks.Random;

public class Main {
    public static void zad1(){
        System.out.println("Napisz true lub false, w zalezności czy za oknem pada: ");
        java.util.Scanner deszcz = new java.util.Scanner(System.in);
        boolean czyPada = deszcz.nextBoolean();

        System.out.println("Napisz true lub false, w zalezności czy za oknem świeci słońce: ");
        java.util.Scanner slonce = new java.util.Scanner(System.in);
        boolean czySwieciSlonce = slonce.nextBoolean();

        System.out.println((czyPada) ? ((czySwieciSlonce) ? "Singing In The Rain" : "November Rain") :
                (czySwieciSlonce) ? "Shiny Happy People" : "Cloud number nine");
    }

    public static void zad2(){
        System.out.println("Podaj liczbę dodatnią: ");
        java.util.Scanner input1 = new java.util.Scanner(System.in);
        int a = input1.nextInt();

        System.out.println("Ppodaj liczbę dodatnią: ");
        java.util.Scanner input2 = new java.util.Scanner(System.in);
        int b = input2.nextInt();

        int calosci = a/b;
        int reszta = a%b;

        System.out.println(calosci + " reszty " + reszta);
    }

    public static void zad3bit(){
        double losowanie1 = Math.random();
        double losowanie2 = Math.random();
        double losowanie3 = Math.random();
        double losowanie4 = Math.random();
        double losowanie5 = Math.random();

        boolean wynik1 = losowanie1>0.5;
        boolean wynik2 = losowanie2>0.5;
        boolean wynik3 = losowanie3>0.5;
        boolean wynik4 = losowanie4>0.5;
        boolean wynik5 = losowanie5>0.5;

        byte bit1 = (byte)(wynik1?1:0);
        byte bit2 = (byte)(wynik2?1:0);
        byte bit3 = (byte)(wynik3?1:0);
        byte bit4 = (byte)(wynik4?1:0);
        byte bit5 = (byte)(wynik5?1:0);

        System.out.println((bit1<<4)+(bit2<<3)+(bit3<<2)+(bit4<<1)+(bit5));
    }

    public static void zad3char(){
        int bit = (int)(Math.random()+0.5);
        char znak = 0; //000000
        znak=(char)(znak|bit);
        bit = (int)(Math.random()+0.5);
        znak=(char)(znak|bit<<1);
        bit = (int)(Math.random()+0.5);
        znak=(char)(znak|bit<<2);
        bit = (int)(Math.random()+0.5);
        znak=(char)(znak|bit<<3);
        bit = (int)(Math.random()+0.5);
        znak=(char)(znak|bit<<4);

        System.out.println(znak);
    }

    public static void main(String[] args) {
        zad3char();

    }
}
