
import java.util.Scanner;
public class Problem3_5 {

	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("Welcome, when prompted, enter today's day. Days are 0-6, with 0 being Sunday, 1 being Monday, and so on.");
	  System.out.println("Enter today's day: ");
	  int today = input.nextInt();
	  System.out.println("Enter the number of days elapsed since today: ");
	  int daysAfterToday = input.nextInt();

      int futureDay = (today + daysAfterToday) % 7;
      
      String todayString = findDate(today);
      String futureDayString = findDate(futureDay);
      
	  System.out.println("Today is " + todayString + " and the future day is " + futureDayString);

	}
	public static String findDate(int date) {

	        String todayString;

	        switch (date) {
	            case 0:
	                todayString = "Sunday";
	                break;
	            case 1:
	                todayString = "Monday";
	                break;
	            case 2:
	                todayString = "Tuesday";
	                break;
	            case 3:
	                todayString = "Wednesday";
	                break;
	            case 4:
	                todayString = "Thursday";
	                break;
	            case 5:
	                todayString = "Friday";
	                break;
	            case 6:
	                todayString = "Saturday";
	                break;
	            default:
	                todayString = "Invalid Day";
	        }

	        return todayString;
	    }

}
