package TheoryLecture;

import java.util.Scanner;

/*
Nagłówek funkcji opisuje:
    1. kto może z niej korzystać public/private/protected
    2. czy jest funkcją statyczną czy nie-statyczną
        static - do wywołania metody nie potrzebujemy obiektu danej klasy
    3. czy i jakiego typu rezultat dostarcza
    4. jaką ma nazwę i jakie jest jej przeznaczenie
    5. parametry metody
    6. czy wysyła wyjątki
 */



public class Functions {

    public static double returnFaceValue(double gr, int value, String faceValue) {
        
        int count = 0;
        while (gr - value > 0) {
            count++;
            gr -= value;
        }
        if (count > 0) {
            System.out.println(count + " * " + faceValue);
        }
        return gr;
    }

    public static void main(String[] args) {

        String[] faceValues = {"10 zł", "5 zł", "2 zł", "1 zł", "50 gr", "20 gr", "10 gr", "5 gr", "2 gr", "1 gr"};
        int[] value = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Scanner scanner = new Scanner(System.in);

        double cash = scanner.nextDouble();

        double gr = cash * 100 + 0.1;

        System.out.printf(cash + " zł = " + "%.0f gr", gr);
        System.out.println();


            for (int i = 0; i < value.length; i++) {
                gr = returnFaceValue(gr, value[i], faceValues[i]);
            }



    }
}
