package Lab10;

public class RectangleLab10 extends GeometricObject{
	private double width;
	private double height;

	public RectangleLab10() {
	}

	public RectangleLab10(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public RectangleLab10(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this. width = width;
	}

	/** Return height */
	public double getheight() {
		return height;
	}

	/** Set a new height */
	public void setheight(double height) {
		this.height = height;
	}

	@Override /** Return area */
	public double getArea() {
		return width * height;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * (width * height);
	}

	@Override /** Return String discription of this rectangle */
	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}
