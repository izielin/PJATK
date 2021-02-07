package PracticeLecture.PPJ26;

public class FlightController {
    public static void main(String[] args) {
        Rocket rocket = new Rocket("Saturn V", 900);
        rocket.refuel();
        rocket.start();
    }
}

class Rocket {
    String name;
    int fuelWeight;

    public Rocket(String name, int fuelWeight) {
        this.name = name;
        this.fuelWeight = fuelWeight;
    }

    public void refuel() {
        this.fuelWeight += (int) (Math.random() * 10000);
        System.out.println(this.fuelWeight);
    }

    public void start() {
        try {
            checkFuelLevel();
            System.out.println();
        } catch (Exception e) {
            System.out.println("za mało paliwa");
            e.printStackTrace();
        }
    }

    void checkFuelLevel() throws Exception {
        if (fuelWeight < 1000)
            throw new Exception();
    }
}
