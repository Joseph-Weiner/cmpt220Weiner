
import java.util.Scanner;
public class Problem2_9 {

	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
      // Prompt the user for Inputs
	  System.out.println("Please enter the Starting velocity in meters per second, the ending velocity, and the time in seconds: ");
	  double v0 = input.nextDouble();
	  double v1 = input.nextDouble();
	  double t = input.nextDouble();
	  double acc = ( v1 - v0 ) / t;
	  System.out.println("The average acceleration is " + acc);
	}

}
