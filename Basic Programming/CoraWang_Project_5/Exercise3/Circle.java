public class Circle extends SimpleGeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    
    public String toString() {
        return "Circle with radius " + radius + ": Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
