package Lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Create a new ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt the user to enter 10 integers
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}

		// Invoke removeDuplicate method
		removeDuplicate(list);

		// Display the distinct integers
		System.out.print("The distinct integers are ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	/** Removes the duplicate elements from an array list of integers */
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j))
					list.remove(j);
			}
		}
	}
}

