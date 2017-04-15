package Lab10;

public class OctagonLab10 {
	private double side;

	public OctagonLab10() {
	}

	/** Construct a Octagon of a specified side */
	public OctagonLab10(double side) {
		this.side = side;
	}

	/** Set a new specified side */
	public void setSide(double side) {
		this.side = side;
	}

	/** Return side */
	public double getSide() {
		return side;
	}

	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	public double getPerimeter() {
		return 8 * side;
	}

	public int compareTo(OctagonLab10 o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override /** Override the protected clone in method defined
		in the Object class, and strengthen its accessibility */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override /** Return a String description of this Octagon object*/
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter();
	}

}
