package lineComparison;

public class LineComparison {

	float length;

	public static void main(String[] args) {
		System.out.println("Welcome to LINE COMPARISON COMPUTATION PROGRAM.\n");

		// VARIABLES
		double x1, y1, x2, y2;

		LineComparison line1 = new LineComparison();
		LineComparison line2 = new LineComparison();

		// LINE LENGTHS EQUALITY CHECK
		for (int count = 1; count <= 2; count++) {
			x1 = Math.random();
			y1 = Math.random();
			x2 = Math.random();
			y2 = Math.random();
			if (count == 1)
				line1.length = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			else
				line2.length = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		}
		System.out.println("Line1 length is " + line1.length + " units.");
		System.out.println("Line1 length is " + line2.length + " units.");
		System.out.println("The two lines are of equal length. True or false?  = " + line1.equals(line2));
	}
}