import java.util.*;


public class GeometricObjects {
    private ArrayList<SimpleGeometricObject> objects;

    public GeometricObjects() {
        objects = new ArrayList<>();
    }

    public void add(SimpleGeometricObject obj) {
        objects.add(obj);
    }

    public double sumArea() {
        double totalArea = 0;
        for (SimpleGeometricObject obj : objects) {
            totalArea += obj.getArea();
        }
        return totalArea;
    }

    public void printSorted() {
        Collections.sort(objects, new Comparator<SimpleGeometricObject>() {
            @Override
            public int compare(SimpleGeometricObject o1, SimpleGeometricObject o2) {
                return Double.compare(o1.getArea(), o2.getArea());
            }
        });

        for (SimpleGeometricObject obj : objects) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        GeometricObjects geoObjects = new GeometricObjects();
        geoObjects.add(new Circle(5));  // Assume Circle is defined elsewhere
        geoObjects.add(new Rectangle(3, 4));  // Assume Rectangle is defined elsewhere
        geoObjects.add(new Octagon(5));

        System.out.println("Total area of all geometric objects: " + geoObjects.sumArea());
        System.out.println("Sorted geometric objects by area:");
        geoObjects.printSorted();
    }
}
