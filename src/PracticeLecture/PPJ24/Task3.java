package PracticeLecture.PPJ24;

public class Task3 {
}

class Vehicle{
    private String color;

    public Vehicle(String color) {
        this.color = color;
    }
}

class WheeledVehicle extends Vehicle{
    int numberOfAxles;

    public WheeledVehicle(String color, int numberOfAxles) {
        super(color);
        this.numberOfAxles = numberOfAxles;
    }
}

class TruckTractor extends WheeledVehicle{
    double mass;

    public TruckTractor(String color, int numberOfAxles, double mass) {
        super(color, numberOfAxles);
        this.mass = mass;
    }

    public void startDriving(){

    }
}