package Lab10;

public class CircleLab10 extends GeometricObject{
	private double radius;

	public CircleLab10() {
	}

	public CircleLab10(double radius, String string, boolean b) {
		this.radius = radius;
	}

	public void CircleLab10(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override /** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	@Override /** Return Perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override /** Return String description of Circle object */
	public String toString() {
		return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() +
			"\nDiameter: " + getDiameter() + "\nPerimeter: " + getPerimeter();
	}

}

	