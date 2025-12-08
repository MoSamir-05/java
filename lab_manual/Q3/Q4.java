class Point3D {
    double x, y, z;

    Point3D(double x) {
        this.x = x;
        this.y = 0;
        this.z = 0;
        printValues();
    }

    Point3D(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
        printValues();
    }

    Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        printValues();
    }

    void printValues() {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}

public class Q4 {
    public static void main(String[] args) {

        Point3D p1 = new Point3D(5.5);
        Point3D p2 = new Point3D(2.2, 3.3);
        Point3D p3 = new Point3D(1.1, 2.2, 3.3);
    }
}
