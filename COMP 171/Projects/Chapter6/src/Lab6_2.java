import java.util.Scanner;
public class Lab6_2 {

	public static void main(String[] Args) {
		Scanner input = new Scanner(System.in);
		double num1 = 0, num2 = 0, num3 = 0;
		
		System.out.println("You will enter three numbers and then I will sort them from least to greatest.");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a number now.");
			switch( i ) {
				case 0:
					num1 = input.nextDouble();
					break;
				case 1:
					num2 = input.nextDouble();
					break;
				case 2:
					num3 = input.nextDouble();
					break;
				default:
					System.out.println("Switch error.");
			}
		}
		input.close();
		displaySortedNumbers( num1, num2, num3 );

	}
	
	public static void displaySortedNumbers( double num1, double num2, double num3 ) {
		// This nests the min and max for the max values.
		double min = Math.min(Math.min(num1, num2), num3);
		double max = Math.max(Math.max(num1, num2), num3);
		double med = -1;
		
		// This uses the max value and nests the comparison the other values to see which one is lower to find the median. Could also compare it to max.
		if( max == num1 )
			med = num2 < num3 ? num3 : num2;
		else if ( max == num2 )
			med = num1 < num3 ? num3 : num1;
		else if ( max == num3 )
			med = num1 < num2 ? num2 : num1;
		
		
		System.out.println("\nThe numbers from least to greatest are:");
		System.out.println(String.format("%f \t %f \t %f", min, med, max ));
	}
}
