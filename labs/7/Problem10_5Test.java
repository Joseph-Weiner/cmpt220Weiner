package Lab7;

import java.util.Scanner;

import Lab7.Problem10_5.StackOfIntegers;

public class Problem10_5Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Enter a positive integer: ");
	        int num = input.nextInt();

	        StackOfIntegers stack1 = new StackOfIntegers(20);

	        int factor = 2;
	        while (factor <= num) {
	            if (num % factor == 0) {
	                stack1.push(factor);
	                num /= factor;
	            } else {
	                factor++;
	            }
	        }
	        while (!stack1.empty()) {
	            System.out.print(stack1.pop() + " ");
	        }


	    }

	}
