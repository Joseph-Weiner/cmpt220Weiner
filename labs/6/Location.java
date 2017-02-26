package Lab6;

public class Location {
	//I know I usually call these ProblemX_Number but the IDE wouldn't import the class into the 
	//test file without calling the class and file location for some reason
	//really odd but this program took over an hour so I don't want to break it

    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) {

        int row = 0;
        int column = 0;
        double maxValue = a[row][column];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        return new Location(row,column,maxValue);
    }


}