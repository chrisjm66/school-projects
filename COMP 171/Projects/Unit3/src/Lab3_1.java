// Christopher Mangan Lab 3.1

import java.util.Scanner;
public class Lab3_1 {
	public static void main( String[] args) {
		// Input
		Scanner input = new Scanner( System.in );
		
		System.out.println("Please enter an integer.");
		int number = input.nextInt();
		input.close();
		
		// Process and Output
		if ( number % 2 == 0 ) {
			System.out.println(number + " is an even number.");
		} else {
			System.out.println(number + " is an odd number.");
		}
	}
}
