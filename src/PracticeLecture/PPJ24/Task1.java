package PracticeLecture.PPJ24;

class Figures {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.show());
        System.out.println("-----");

        Cuboid cuboid = new Cuboid(2,4,3);
        System.out.println(cuboid.showSurface());
        System.out.println(cuboid.showVolume());
        System.out.println("-----");

        Triangle triangle = new Triangle( 3);
        System.out.println(triangle.show());
        System.out.println("-----");

        Pyramid pyramid = new Pyramid(2);
        System.out.println(pyramid.showSurface());
        System.out.println(pyramid.showVolume());
        System.out.println("-----");

        Prism prism = new Prism(2,3);
        System.out.println(prism.showSurface());
        System.out.println(prism.showVolume());
        System.out.println("-----");

    }
}

class Rectangle {
    private double a;
    private double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double show() {
        return a * b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}

class Cuboid extends Rectangle {
    private double height;

    Cuboid(double a, double b, double height) {
        super(a, b);
        this.height = height;
    }

    public double showSurface() {
        return 2 * super.show() + 2 * height * getA() + 2 * getB();
    }

    public double showVolume() {
        return super.show() * height;
    }
}

class Triangle {
    private double a;

    Triangle(double a) {
        this.a = a;
    }

    public double show() {
        return (Math.pow(a, 2) * Math.sqrt(3)) / 4;
    }

    public double getA() {
        return a;
    }
}

class Pyramid extends Triangle {

    Pyramid(double a) {
        super(a);
    }

    public double showSurface() {
        return 4 * super.show();
    }

    public double showVolume() {
        return (Math.pow(super.getA(), 3) * Math.sqrt(2)) / 12;
    }
}

class Prism extends Triangle {
    private double height;

    Prism(double a, double height) {
        super(a);
        this.height = height;
    }

    public double showSurface() {
        return 2 * super.show() + 3 * getA() * height;
    }

    public double showVolume() {
        return super.show() * height;
    }

}

