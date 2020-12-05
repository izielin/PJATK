package ScoredTasks.PPJ09;

import java.util.Scanner;

public class KsawerysCode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Zad1---");
        double val = sc.nextDouble();
        boolean czyA = val > 10;
        boolean czyC = !czyA;
        boolean czyB = val <= 15;
        System.out.println("Podana liczna należy do zbiorów:" + 
            (czyA?" A":" ") +
            (czyB?" B":" ") +
            (czyC?" C":" "));

        System.out.println("---Zad2---");
        int deg = (int)(Math.random()*360);
        deg += 22-90; // Obrót
        if(deg < 0){
            deg += 360; // Przywrócenie grupy modulo 360
        }
        deg /= 45; // Podzielenie na 1/8 tarczy
        String kierunek = switch (deg) {
            case 0 -> "północ";
            case 1 -> "północny-wschód";
            case 2 -> "wschód";
            case 3 -> "południowy-wschód";
            case 4 -> "południe";
            case 5 -> "południowy-zachód";
            case 6 -> "zachód";
            case 7 -> "północny-zachód";
            default -> "Coś poszło nie tak";
        };
        System.out.println("Wylosowany kierunek to '" + kierunek + "'");


        System.out.println("---Zad3---");
        double data = sc.nextInt();
        double srcData = data;
        String fromUnit = sc.next();
        String toUnit = sc.next();
        switch(fromUnit){
            case "ml": data /= 1000; break;
            case "dl": data /= 10; break;
            case "l": break;
        }

        data /= 1.125; // Kwarta staropolska

        switch(toUnit){
            case "galon": data /= 4; break; // Galon to 4 kwarty
            case "pint": data *= 2; break; // 2 pinty to 1 kwarta
            case "kwarta": break;
        }
        System.out.println(srcData + " " + fromUnit + " to " + data + " " + toUnit);

    }
}
