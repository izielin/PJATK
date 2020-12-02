package Practice.ArraysAdvance;

import static AuxiliaryFunctions.Arrays.*;

public class Rectangle {


    public static void main(String[] args) {
        int[] x = new int[10];
        int[] y = new int[10];
        fillIntArray(x, 20, -20);
        fillIntArray(y, 20, -20);

        bubbleSortAscending(x);
        bubbleSortAscending(y);

        printIntArray(x);
        System.out.println();
        printIntArray(y);
        System.out.println();

        System.out.println("Punkt A ma współrzędne: " + x[0] + ", " + y[0]);
        System.out.println("Punkt B ma współrzędne: " + x[x.length - 1] + ", " + y[0]);
        System.out.println("Punkt C ma współrzędne: " + x[x.length - 1] + ", " + y[y.length - 1]);
        System.out.println("Punkt D ma współrzędne: " + x[0] + ", " + y[y.length - 1]);

        System.out.println("Wysokość: " + Math.abs(y[y.length - 1] - y[0]));
        System.out.println("Szerokość: " + Math.abs(x[x.length - 1] - x[0]));

        System.out.println("środek: " + Math.abs(x[x.length - 1] - x[0] / 2) + ", " + Math.abs(y[y.length - 1] - y[0]) / 2);

    }


}
