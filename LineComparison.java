package lineComparison;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to LINE COMPARISON COMPUTATION PROGRAM.");

		// VARIABLES
		double x1 = Math.random();
		double y1 = Math.random();
		double x2 = Math.random();
		double y2 = Math.random();
		float lineLength = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Line length is " + lineLength + " units.");
	}
}