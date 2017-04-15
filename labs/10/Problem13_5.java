package Lab10;

public class Problem13_5 {
	public static void main(String[] args) {
		// Create two Circle objects
		CircleLab10 circle1 = new CircleLab10(15, "red", true);
		CircleLab10 circle2 = new CircleLab10(10, "blue", false);

		// Display circle1
		System.out.println("\nCircle 1: ");
		print(circle1);

		// Display circle2
		System.out.println("\nCircle 2: ");
		print(circle2);

		// Display larger circle
		print("\nThe larger of the two circles was ");
		print(CircleLab10.max(circle1, circle2));

		// Create two Rectangle objects
		RectangleLab10 rectangle1 = new RectangleLab10(4, 5, "green", true);
		RectangleLab10 rectangle2 = new RectangleLab10(4.2, 5, "orange", true);

		// Display circle1
		System.out.println("\nRectangle 1: ");
		print(circle1);

		// Display circle2
		System.out.println("\nRectangle 2: ");
		print(circle2);

		// Display larger circle
		print("\nThe larger of the two rectangles was ");
		print(RectangleLab10.max(rectangle1, rectangle2));
	}

	// Displays a string
	public static void print(String s) {
		System.out.println(s);
	}

	// Displays a GeometricObject
	public static void print(GeometricObject o) {
		System.out.println(o);
	}

}
