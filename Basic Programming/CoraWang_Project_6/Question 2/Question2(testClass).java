public class TestObjectsWithException {
    public static void main(String[] args) {
        // Circle creations with individual exception handling inside the constructors
        new Circle(-1, "Red", true); // Should print messages for both InvalidRadiusException and InvalidColorException
        new Circle(5, "Red", false); // Should print message for InvalidColorException
        new Circle(-5, "Black", true); // Should print message for InvalidRadiusException
        new Rectangle(4, 5, "Green", true); // No exceptions expected
        new Rectangle(3, 5, "Red", false); // Should print message for InvalidColorException
    }
}

