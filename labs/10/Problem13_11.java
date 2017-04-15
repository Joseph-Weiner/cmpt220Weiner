package Lab10;

public class Problem13_11 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Create an Octagon object
		OctagonLab10 octagon1 = new OctagonLab10(5);

				// Display area and perimeter of object
				System.out.println("\nOctagon:\nArea: " + octagon1.getArea() + 
					"\nPerimeter: " + octagon1.getPerimeter());

				// Create new object using the clone method
				System.out.println("Cloning Octagon...");
				OctagonLab10 octagon2 = (OctagonLab10)octagon1.clone();

				// Compare the two object using compareTo method
				int result = (octagon1.compareTo(octagon2));
				if (result == 1)
					System.out.println("Octagon is greather than its clone.");
				else if (result == -1)
					System.out.println("Octagon is less than its clone."); 
				else
					System.out.println("Octagon is equal to its clone.");
	}

}
