// Abstract class
abstract class Shape {
    // Empty method (abstract method)
    abstract void numberOfSides();
}

// Trapezoid class
class Trapezoid extends Shape {
    void numberOfSides() {
        System.out.println("Trapezoid has 4 sides.");
    }
}

// Triangle class
class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides.");
    }
}

// Hexagon class
class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides.");
    }
}

// Main class
public class Q7 {
    public static void main(String[] args) {

        Shape s;

        s = new Trapezoid();
        s.numberOfSides();

        s = new Triangle();
        s.numberOfSides();

        s = new Hexagon();
        s.numberOfSides();
    }
}