package Lab6;

import java.util.Date;
import java.util.GregorianCalendar;

public class Problem9_5 {

	public static void main(String[] args) {
		//Print the date
		
		System.out.println(new Date().toString());
		
		//set up a new Gregorian calendar object and feed the program the value given by the textbook
		GregorianCalendar calendar1 = new GregorianCalendar();
		calendar1.setTimeInMillis(1234567898765L);
        
		
		System.out.printf("Year: %d Month: %d Day: %d",
				calendar1.get(GregorianCalendar.YEAR),
				calendar1.get(GregorianCalendar.MONTH),
				calendar1.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
