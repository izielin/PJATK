package ScoredTask.PPJ09;

import java.util.Scanner;

class Main {
    public static void task1() {
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 10) System.out.println("A");
        if (a <= 15) System.out.println("B");
        if (a <= 10) System.out.println("C");
    }

    // task 2
    public static void task2() {
        double deg = (int) (Math.random() * 360);
        System.out.println(deg);

        double unit = (double) (360 / 8) / 2;
        if (deg >= 90 - unit && deg < 90 + unit) System.out.println("północ");
        else if (deg >= 90 + unit && deg < 180 - unit) System.out.println("północny-wschód");
        else if (deg >= 180 - unit && deg < 180 + unit) System.out.println("wschód");
        else if (deg >= 180 + unit && deg < 270 - unit) System.out.println("południowy-wschód");
        else if (deg >= 270 - unit && deg < 270 + unit) System.out.println("południe");
        else if (deg >= 270 + unit && deg < 360 - unit) System.out.println("południowy-zachód");
        else if (deg >= 360 - unit && deg < 0 + unit) System.out.println("zachód");
        else if (deg >= 0 + unit && deg < 90 - unit) System.out.println("północny-zachód");
    }

    //task 3

    public static String conversionOfUnits(double data, String toUnit) {
        double pint = 0.00211337642;
        double kwarta = 0.00105668821;
        double galon = 0.000264172052;

        return switch (toUnit) {
            case "pint" -> (data * pint + "pint");
            case "kwarta" -> (data * kwarta + "kwarta");
            case "galon" -> (data * galon + "galon");
            default -> "Nieobsługiwana jednostka";
        };
    }

    public static void task3() {
        System.out.println("Podaj wartość, podaj jednostkę [ml, dl, l], podaj jednostkę[pint, kwarta, galon]: ");
        Scanner scanner = new Scanner(System.in);
        double data = scanner.nextDouble();
        String fromUnit = scanner.next();
        String toUnit = scanner.next();

        switch (fromUnit) {
            case "ml" -> System.out.println(conversionOfUnits(data, toUnit));
            case "dl" -> System.out.println(conversionOfUnits(data*100, toUnit));
            case "l" -> System.out.println(conversionOfUnits(data*1000, toUnit));
            default -> System.out.println("Nieobsługiwana jednostka");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}
