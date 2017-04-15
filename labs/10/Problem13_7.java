package Lab10;

public class Problem13_7 {
	public static void main(String[] args) {
		// Create an array of five GeometricObjects
		GeometricObject[] squares = {new SquareLab10(4.5), new SquareLab10(14), 
			new SquareLab10(8.2), new SquareLab10(12), new SquareLab10(10)};

		// Display the area and invoke the howToColor 
		// method for each GeometricObject
		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nSquare #" + (i + 1));
		 	System.out.println("Area: " + squares[i].getArea());
		 	System.out.println("How to color: " + ((SquareLab10)squares[i]).howToColor());
		 } 
	}

}
