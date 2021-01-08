package PracticeLecture.PPJ22.balloon;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Donkey donkey = new Donkey(30.5);

        int mass5 = 0;
        int mass6 = 0;
        int mass7 = 0;
        int mass8 = 0;
        int mass9 = 0;

        boolean flyingDonkey = false;
        while (!flyingDonkey) {
            Balloon balloon = new Balloon();

            if (balloon.getHelium() == 0.005) {
                mass5++;
            } else if (balloon.getHelium() == 0.006) {
                mass6++;
            } else if (balloon.getHelium() == 0.007) {
                mass7++;
            } else if (balloon.getHelium() == 0.008) {
                mass8++;
            } else {
                mass9++;
            }

            donkey.balloons = donkey.addBalloons(donkey.balloons, balloon);
            flyingDonkey = donkey.isFlying();
        }
        System.out.println("JA LATAM!");
        System.out.println("łącznie użyto balonów: " + donkey.balloons.length + " w tym");
        System.out.println(mass5 + " balonów o pojemności 0.005 m^3");
        System.out.println(mass6 + " balonów o pojemności 0.006 m^3");
        System.out.println(mass7 + " balonów o pojemności 0.007 m^3");
        System.out.println(mass8 + " balonów o pojemności 0.008 m^3");
        System.out.println(mass9 + " balonów o pojemności 0.009 m^3");
    }
}

class Balloon {
    double helium;

    Balloon() {
        this.helium = Math.round((0.005 + Math.random() * (0.009 - 0.005))*1000.0)/1000.0;
    }

    double getLoad() {
        return ((this.helium * 6) / 0.007);
    }

    public double getHelium() {
        return helium;
    }
}

class Donkey {
    private double mass;
    Balloon[] balloons = new Balloon[0];

    Donkey(double mass) {
        this.mass = mass;
    }

    Balloon[] addBalloons(Balloon[] balloons, Balloon balloon) {
        balloons = Arrays.copyOf(balloons, balloons.length + 1);
        balloons[balloons.length - 1] = balloon;
        return balloons;
    }

    boolean isFlying() {
        double massInG = this.mass*1000;
        double sum = 0;
        for (Balloon balloon : this.balloons) {
            sum += balloon.getLoad();
        }
        return sum >= massInG;
    }
}

