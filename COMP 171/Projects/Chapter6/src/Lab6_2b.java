// Christopher Mangan COMP 171
import java.util.Scanner;
public class Lab6_2b {
	public static void main(String[] Args) {
		Scanner input = new Scanner(System.in);
		double num1 = 0, num2 = 0, num3 = 0;
		
		System.out.println("Enter three numbers and then I will sort them from least to greatest.");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		input.close();
		displaySortedNumbers( num1, num2, num3 );

	}
	
	public static void displaySortedNumbers( double num1, double num2, double num3 ) {
		// This nests the min and max for the max values.
		double min = Math.min(Math.min(num1, num2), num3);
		double max = Math.max(Math.max(num1, num2), num3);
		double med = (num1 + num2+ num3) - min - max;
		
		System.out.println("\nThe numbers from least to greatest are:");
		System.out.printf("%f \t %f \t %f", min, med, max );
	}
}
