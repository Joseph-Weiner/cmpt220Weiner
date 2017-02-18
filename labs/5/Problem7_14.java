
import java.util.Scanner;

public class Problem7_14 {

    static final int SIZE = 10;

    public static void main(String[] args) {

        int[] numbers = new int[SIZE];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers to get their gcd: ");
        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextInt();

        System.out.println("The GCD is " + gcd(numbers));

    }

    public static int gcd(int... numbers) {
        int gcd = 1;
        int minimum = getMinimum(numbers);
        int length = numbers.length - 1;

        int count = 0;
        for (int i = 2; i <= minimum; i++) {

            for (int k = 0; k <= length; k++) {
                if (numbers[k] % i == 0) {
                    count++;
                    if (count == length) gcd = i;
                } else {
                    count = 0;
                }
            }
        }

        return gcd;
    }

    public static int getMinimum(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        return minimum;
    }


}