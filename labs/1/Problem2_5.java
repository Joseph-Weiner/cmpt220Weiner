
import java.util.Scanner;
public class Problem2_5 {

  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//Prompt the user for the 2 inputs
    System.out.println("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuity = input.nextDouble();
    double gratuityAmount = gratuity * .01 * subtotal;
    double total = subtotal + gratuityAmount;
    System.out.println("The gratuity is $" + gratuityAmount + " and the total is $" + total);
	}

}
