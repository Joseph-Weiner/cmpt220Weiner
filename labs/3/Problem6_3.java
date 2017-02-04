import java.util.Scanner;

public class Problem6_3 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a integer: ");
	        int n1 = input.nextInt();

	        if (PalindromeCheck(n1)) {
	            System.out.println(n1 + " is a palindrome.");
	        } else {
	            System.out.println(n1 + " is NOT a palindrome.");

	        }

	}
	public static int flip(int n2) {

		int flip = 0;
		while (n2 != 0) {

			flip *= 10; // is ignored first iteration
			flip += n2 % 10;
			n2 /= 10;
    }

		return flip;
}

	public static boolean PalindromeCheck(int n2) {

		return (n2 == flip(n2));
}
}
