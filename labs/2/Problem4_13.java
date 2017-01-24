
import java.util.Scanner;
public class Problem4_13 {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char c1 = input.next().charAt(0);


        if (isVowel(c1)) {
            System.out.println(c1 + " is a vowel.");
        } else if (isConsonant(c1)) {
            System.out.println(c1 + " is a consonant.");
        } else {
            System.out.println("Input error.");
        }


    }

    // The following is in place to check a vowel, vowels are A E I O U 
    // This is not meant to be case sensitive
    public static boolean isVowel(char c1) {

        c1 = Character.toUpperCase(c1);

        return !(c1 != 'A' && c1 != 'E' && c1 != 'I' && c1 != 'O' &&c1 != 'U');

    }

    public static boolean isConsonant(char c1) {

        c1 = Character.toUpperCase(c1);

        return !isVowel(c1) && (c1 >= 'A' && c1 <= 'Z');

    }

}