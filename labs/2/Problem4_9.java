
import java.util.Scanner;
public class Problem4_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c1 = input.next().charAt(0);
        input.close();

        System.out.println("The Unicode for the character " + c1 + " is " + (int) c1);
    }
}