import java.util.*;

// this is our updated GeometricObject Class
class GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated = new java.util.Date();

    public GeometricObject() {}

    public GeometricObject(String color, boolean filled) throws InvalidColorException {
        setColor(color); // Set color with validation
        this.filled = filled;
        this.dateCreated = new java.util.Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws InvalidColorException {
        if ("Red".equalsIgnoreCase(color)) {
            throw new InvalidColorException(color);
        }
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public double getArea() {
        return 0.0;  // Default implementation
    }

    public double getPerimeter() {
        return 0.0;  // Default implementation
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\nColor: " + color + " and filled: " + filled;
    }
}

// Circle class
class Circle extends GeometricObject implements Comparable<Circle>{
    private double radius;
    public Circle() {}
    public Circle (double radius) {
    	this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(); // Avoid calling superclass constructor that might set values
        try {
            setRadius(radius);
        } catch (InvalidRadiusException e) {
            System.out.println(e.getMessage());  // Print and handle radius exception immediately
        }
        try {
            setColor(color);  // This could still throw an InvalidColorException
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());  // Print and handle color exception immediately
        }
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius < 0) {
            throw new InvalidRadiusException(radius);
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("Circle created on " + getDateCreated() + " with radius " + radius);
    }
    
    public int compareTo(Circle o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius + " has area: " + getArea();
    }
}

// Rectangle class
class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;
    
    public Rectangle () {}

    public Rectangle(double width, double height, String color, boolean filled) {
        super();  // Call default super constructor to avoid any preset actions
        try {
            setColor(color);  // This could throw InvalidColorException
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());  // Handle and print the exception here
        }
        this.width = width;
        this.height = height;
        setFilled(filled);
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
    public int compareTo(Rectangle o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width + " and height " + height + " has area: " + getArea();
    }
}

// Exception for invalid radius
class InvalidRadiusException extends Exception {
    private double radius;

    public InvalidRadiusException(double radius) {
        super("Invalid radius: " + radius + ". Radius cannot be negative.");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

// Exception for invalid color
class InvalidColorException extends Exception {
    private String color;

    public InvalidColorException(String color) {
        super("Invalid color: '" + color + "'. Color can't be red.");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

// Test class to demonstrate object creation and exception handling
