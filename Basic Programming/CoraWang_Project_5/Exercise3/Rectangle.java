public class Rectangle extends SimpleGeometricObject {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    public double getArea() {
        return width * height;
    }

   
    public double getPerimeter() {
        return 2 * (width + height);
    }

    
    public String toString() {
        return "Rectangle with width " + width + " and height " + height + ": Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
