// Christopher Mangan Lab 3.2

import java.util.Scanner;
public class Lab3_2 {
	public static void main( String[] args) {
		// Input
		Scanner input = new Scanner( System.in );
		
		System.out.println("Please enter an integer.");
		int number1 = input.nextInt();
		
		System.out.println("Please enter another integer.");
		int number2 = input.nextInt();
		input.close();
		
		int number1Mod = number1 % 2;
		int number2Mod = number2 % 2;
		
		// Process and Output
		if ( number1Mod == 0) { // number1 Even
			if ( number2Mod == 0 ) //number2 Odd
				System.out.println("Both numbers are even.");
			else
				System.out.println("One number is even and the other is odd.");
		} else {
			if ( number2Mod == 0 ) //number 1 odd, number2 Even
				System.out.println("One number is even and the other is odd.");
			else //number 1 odd, number2 odd
				System.out.println("Both numbers are odd.");
		}

	}
}