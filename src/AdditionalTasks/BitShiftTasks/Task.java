package AdditionalTasks.BitShiftTasks;

import java.util.ArrayList;
import java.util.List;

public class Task {
    /*
     * Dane są cztery zmienne typu int o wartościach W, X, Y, Z. Utwórz program, który
     * policzy sumę wszystkich wartości. Jeżeli wartość sumy będzie większa od A(16) należy
     * wyświetlić tylko wartości, których 5 bit jest jedynką.
     * W przeciwnym przypadku należy wyświetlić tylko te liczby,
     * których koniunkcja bitowa z wartością A3(16) będzie wartością mniejszą od 5.
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Give me number: ");
            java.util.Scanner input = new java.util.Scanner(System.in);
            list.add(input.nextInt());
        }

        int w = list.get(0);
        int x = list.get(1);
        int y = list.get(2);
        int z = list.get(3);


        int sum = w + x + y + z;
        int wBin = Integer.parseInt(Integer.toBinaryString(w));
        int xBin = Integer.parseInt(Integer.toBinaryString(x));
        int yBin = Integer.parseInt(Integer.toBinaryString(y));
        int zBin = Integer.parseInt(Integer.toBinaryString(z));
        int aBin = Integer.parseInt(Integer.toBinaryString(0xA3));

        if (sum > 0xA) {
            if (((wBin >> 4) & 0b1) == 1) System.out.println(w);
            if (((xBin >> 4) & 0b1) == 1) System.out.println(x);
            if (((yBin >> 4) & 0b1) == 1) System.out.println(y);
            if (((zBin >> 4) & 0b1) == 1) System.out.println(z);
        } else {
            if ((wBin & aBin) < 5) System.out.println(w);
            if ((xBin & aBin) < 5) System.out.println(x);
            if ((yBin & aBin) < 5) System.out.println(y);
            if ((zBin & aBin) < 5) System.out.println(z);

        }
    }

}
