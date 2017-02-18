
import java.util.Scanner;

public class Problem7_19 {

    static int size = 100;

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("First number is size of list...");
        System.out.print("Enter list: ");
        size = input.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }
        if (isSorted(num)) System.out.print("The list is already sorted.\n");
        else System.out.print("The list is not sorted.\n");

    }

    public static boolean isSorted(int[] num) {

        for (int i = 0; i < num.length - 1; i++) {

            if (num[i] > num[i + 1]) return false;

        }
        return true;
    }
    public static void printArray(int[] array, int numPerLine) {

                for (int i = 0; i < array.length; i++) {

                    System.out.printf("%4d ", array[i]);
                    if ((i + 1) % numPerLine == 0) System.out.println("");
                }
    }
}