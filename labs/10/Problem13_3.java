package Lab10;

public class Problem13_3 {
	public static void display(Object[] objects) {

        int count = 1;
        for (Object o : objects) {
            System.out.printf("%4s\n", o.toString());
            if (count % 10 == 0) {
                System.out.println("");
            }
            count++;
        }

	}
}
