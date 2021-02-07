package PracticeLecture.PPJ23.Wyraz;

public class Main {
    public static void main(String[] args) {
        Wyraz wyraz = new Wyraz();

        int limit = (int)(Math.random()*100);
        for (int i = 0; i < limit; i++) {
            wyraz.dodajZnak((char)(65 + Math.random()*(89-65)));
        }

        wyraz.wyswietl();
        System.out.println();
        System.out.println(wyraz.length());

    }
}

class Wyraz {

    private char[] chars;
    private int anInt;

    Wyraz() {
        this.chars = new char[100];
        this.anInt = 0;
    }

    public void dodajZnak(char anChar) {
        if (anChar < chars.length-1) {
            chars[anInt] = anChar;
            this.anInt++;
        } else {
            System.out.println("tablica pełna");
        }
    }

    public void wyswietl(){
        for (int i = 0; i < anInt; i++) {
            System.out.print(chars[i] + ((i < anInt - 1) ? ", " : ""));
        }
    }

    public int length(){
        return anInt;
    }

}
