
public class Problem6_1 {

	public static void main(String[] args) {
		System.out.println("The first 100 pentagonal numbers are as follows: ");
		//need a for loop to increment the pentagonal numbers
		//printf not println because it is formatted
		//need to have 10 lines with 10 numbers on each
		for (int j = 1; j <= 100; j++){
			System.out.printf("%10s",(j % 10 != 0) ? getPentagonalNumber(j) + " " : getPentagonalNumber(j) + "\n");
		}
	}
	public static int getPentagonalNumber(int n){
		return n * (3 * n - 1) / 2;
		
	}

}
