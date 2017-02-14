import java.util.Scanner;

public class Problem5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to be factorized: ");
		int mainNumber = input.nextInt();
		
		
		for(int n = 2; n < mainNumber; ){ // JA: This is better done with a while loop
			// JA: The last factor is missed, because at the end n is equal to mainNumber but the for loop exists
			if (mainNumber % n == 0){
				System.out.println(n + " ");
				mainNumber /= n;
			} else {
				n++;
			}
		}
	}

}
