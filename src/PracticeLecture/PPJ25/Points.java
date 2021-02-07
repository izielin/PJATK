package PracticeLecture.PPJ25;

public class Points {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(0, 2);
        Point2D point2 = new Point2D(0, 0);

        System.out.println(point2.calculateDistance(point1));
    }
}

class Point2D {
    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point2D point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }
}

class Point3D extends Point2D {
    double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double calculateDistance(Point3D point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2) + Math.pow(point.z - this.z, 2));
    }
}
