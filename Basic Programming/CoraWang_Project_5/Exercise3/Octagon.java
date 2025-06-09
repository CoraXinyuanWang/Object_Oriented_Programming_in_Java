public class Octagon extends SimpleGeometricObject {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    
    public double getArea() {
        
        return 2 * (1 + Math.sqrt(2)) * side * side;
    }

   
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public String toString() {
        return "Octagon with side " + side + ": Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
