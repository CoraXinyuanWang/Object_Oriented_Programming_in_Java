public class CreateArray {
    public static void main(String[] args) {
        ArrayList<GeometricObject> shapes = new ArrayList<>();
        shapes.add(new Circle(3, "Blue", false));
        shapes.add(new Rectangle(2, 3, "Black", true));
        shapes.add(new Octagon(5));

        System.out.println("Sum of Areas: " + sumArea(shapes));
        printSorted(shapes);
    }

    public static double sumArea(ArrayList<GeometricObject> shapes) {
        double sum = 0;
        for (GeometricObject shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }

    public static void printSorted(ArrayList<GeometricObject> shapes) {
        Collections.sort(shapes, (a, b) -> Double.compare(a.getArea(), b.getArea()));
        for (GeometricObject shape : shapes) {
            System.out.println(shape);
        }
    }
}
