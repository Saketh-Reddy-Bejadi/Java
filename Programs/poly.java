interface Shape {
    double area();
}
class Circle implements Shape {
    double radius;
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
public class poly {
    public static void main(String[] args) {
        // Creating Circle object with radius 5
        Shape shape = new Circle(5);
        System.out.println("Area: " + shape.area()); // Output: Area: 78.5398...
    }
}


