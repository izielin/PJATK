package PracticeLecture.PPJ23;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        // 1 -> pole,2-> objętość
        System.out.println(square.show(1));
        System.out.println(square.show(2));

        Cylinder cylinder = new Cylinder(4,5);
        System.out.println(cylinder.show(1));
        System.out.println(cylinder.show(2));

        SphereIn sphereIn = new SphereIn(square);
        System.out.println(sphereIn.show());

        SphereOn sphereOn = new SphereOn(square);
        System.out.println(sphereOn.show());

        SphereOn sphereOn2 = new SphereOn(cylinder);
        System.out.println(sphereOn2.show());
    }
}


class Atom {
    private String name;
    private String mass;
    private String chargeOfTheAtom;

    Atom() {
    }

    Atom(String name, String mass, String charge) {
        this.name = name;
        this.mass = mass;
        this.chargeOfTheAtom = charge;
    }

    @Override
    public String toString() {
        return "Nazwa atomu: " + name + ", masa atomu: " + mass + ", ładunek atomu: " + chargeOfTheAtom;
    }
}

class Square {
    private double side;

    Square() {
    }

    Square(double side) {
        this.side = side;
    }

    public String show(int choice) {
        if (choice == 1) {
            return "Pole kwadratu wynosi: " + Math.pow(side, 2.0) + " j^2";
        } else {
            return "Objętość sześcianu wynosi: " + Math.pow(side, 3.0) + " j^3";
        }
    }

    public double getSide() {
        return side;
    }
}

class Cylinder {
    private double height;
    private double radius;

    Cylinder() {
    }

    Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public String show(int choice) {
        if (choice == 1) {
            return "Pole podstawy wynosi: " + Math.pow(radius,2.0)*Math.PI + " j^2";
        } else {
            return "Objętość sześcianu wynosi: " + Math.pow(radius,2.0)*Math.PI*height + " j^3";
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}

class SphereIn{
    private double radius;

    SphereIn(Cylinder cylinder){
        this.radius = cylinder.getRadius();
    }

    SphereIn(Square square){
        this.radius = square.getSide()/2;
    }


    public String show() {
            return "Objetość kuli wynosi: " + 0.75*Math.pow(radius,3.0)*Math.PI + " j^3";
    }

}


class SphereOn{
    private double radius;

    SphereOn(Cylinder cylinder){
        double d = Math.sqrt((Math.pow(cylinder.getHeight(), 2) + Math.pow(2*cylinder.getRadius(), 2)));
        this.radius = 0.5*d;
    }

    SphereOn(Square square){
        this.radius = square.getSide()*Math.sqrt(3);
    }

    public String show() {
        return "Objetość kuli wynosi: " + ((double)4/3)*Math.pow(radius,3)*Math.PI + " j^3";
    }
}