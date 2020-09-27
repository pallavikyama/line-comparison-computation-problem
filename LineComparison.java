package lineComparison;

public class LineComparison {

	// VARIABLES
	double x1, y1, x2, y2;
	float length;

	public float lengthCal() {

		// LINE LENGTHS EQUALITY CHECK
		x1 = Math.random();
		y1 = Math.random();
		x2 = Math.random();
		y2 = Math.random();
		return (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	public static void main(String[] args) {
		System.out.println("Welcome to LINE COMPARISON COMPUTATION PROGRAM.\n");

		LineComparison line1 = new LineComparison();
		LineComparison line2 = new LineComparison();
		line1.length = line1.lengthCal();
		line2.length = line2.lengthCal();
		System.out.println("Line1 length is " + line1.length + " units.");
		System.out.println("Line1 length is " + line2.length + " units.");
		System.out.println("\nComparing the two lines : " + Float.compare(line1.length, line2.length));
		if (Float.compare(line1.length, line2.length) > 0)
			System.out.println("Line1 is longer than line2.");
		else if (Float.compare(line1.length, line2.length) < 0)
			System.out.println("Line1 is shorter than line2.");
		else if (line1.equals(line2) == true)
			System.out.println("Line1 and line2 are of equal length.");
	}
}