package AdditionalTasks.SwitchCase;

import java.util.Scanner;

public class Main {

    // task 1
    public static void task1() {
        System.out.println("Give me number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a <= 5) System.out.println("A");
        if (a >= -5) System.out.println("B");
        if (a <= 10 && a >= -10) System.out.println("C");

    }

    // task 2
    public static void task2() {
        double deg = (int) (Math.random() * 360);
        System.out.println(deg);

        double unit = (double) (365 / 8) / 2;

        if (deg >= 360 - unit && deg < 0 + unit) System.out.println("północ");
        else if (deg >= 0 + unit && deg < 90 - unit) System.out.println("północny-wchód");
        else if (deg >= 90 - unit && deg < 90 + unit) System.out.println("wschód");
        else if (deg >= 90 + unit && deg < 180 - unit) System.out.println("południowy-wschód");
        else if (deg >= 180 - unit && deg < 180 + unit) System.out.println("południe");
        else if (deg >= 180 + unit && deg < 270 - unit) System.out.println("południowy-zachód");
        else if (deg >= 270 - unit && deg < 270 + unit) System.out.println("zachód");
        else if (deg >= 270 + unit && deg < 360 - unit) System.out.println("północny-zachód");

    }
//task 3
    /*
     * cm - cal cm * 0.39370
     * cm - yard = 91,44 cm
     * cm - mila = 1,609 km = 160900 cm
     *
     * m - cal
     * m-yard
     * m-mila
     *
     * km-cal
     * km-yard
     * km-mila
     */
    public static String conversionOfUnits(double data, String toUnit){
        return switch (toUnit) {
            case "cal" -> (data * .39370 + " cale");
            case "yard" -> (data / 91.44 + " yard");
            case "mila" -> (data / 160900 + "mil");
            default -> "Error";
        };
    }

    public static void task3() {
        System.out.println("Podaj wartość, jednostkę [cm, m, km], jednostkę[cal, yard, mila] : ");
        Scanner scanner = new Scanner(System.in);
        double data = scanner.nextDouble();
        String fromUnit = scanner.next();
        String toUnit = scanner.next();

        switch (fromUnit) {
            case "cm" -> System.out.println(conversionOfUnits(data, toUnit));
            case "m" -> System.out.println(conversionOfUnits(data * 100, toUnit));
            case "km" -> System.out.println(conversionOfUnits(data * 10000, toUnit));
            default -> System.out.println("Nieobsługiwana jednostka/i");
        }

    }

    public static void main(String[] args) {
        task3();


    }
}
