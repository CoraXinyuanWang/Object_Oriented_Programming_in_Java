import java.util.*;

public class SimpleGeometricObject {
	// Class Fields
	private String color;
	private boolean filled;
	private Date dateCreated;

	// Constructors
	public SimpleGeometricObject() {
		// No Arg Constructor
		dateCreated = new Date();
	}
	public SimpleGeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}

	// Custom Methods
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return ("color: " + color + ", filled: " + filled + 
			", date created: " + dateCreated);
	}

	public double getArea() {
        throw new UnsupportedOperationException("Method getArea() must be overridden in subclasses");
    }
}