package Lab10;

public class Problem13_9 {
	public static void main(String[] args) {
		// Create three Circle objects
		CircleLab10 circle1 = new CircleLab10(5, "red", true);
		CircleLab10 circle2 = new CircleLab10(5, "green", false);
		CircleLab10 circle3 = new CircleLab10(4, "green", false);

		// Display results
		System.out.println("Circle1 radius: " + circle1.getRadius());
		System.out.println("Circle2 radius: " + circle2.getRadius());
		System.out.println("Circle3 radius: " + circle3.getRadius());

		System.out.println("Circle1 is " + (circle1.equals(circle2) ? "" : "not ") +
			"equal to circle2");

		System.out.println("Circle1 is " + (circle1.equals(circle3) ? "" : "not ") +
			"equal to circle3");
	}

}
