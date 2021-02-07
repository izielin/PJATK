package PracticeLecture.PPJ28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Theory {
    /*
    . - dowolny znak
    [a-z] [0-9] - zakres
    \d - numer
    \w -litera
    \s - znak biały
    a* - a powtórzy się 0 lub więcej razy
    a+ - a powtórzy się 1 lub więcej razy
    a{3} - a powtórzy się dokładnie 3 razy
    () - grupowanie - .(\d+/){3} - .89/09/7/
    ^a - każdy oprócz a
    a|b - a albo b
    a{0,9} - pojawi się 9 lub mniej razy
     */
    public static void main(String[] args) {
        String regex = "\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("tekst do przetworzenia");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String s = "";
        s += "s";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(12);
        stringBuilder.append('h');
        stringBuilder.append("GFJS");
        System.out.println(stringBuilder);
    }


}
