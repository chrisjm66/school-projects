// Chris Mangan Assignment 2.2 COMP 171
import java.util.Scanner;
import java.lang.Math;
public class Assignment2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		// Inputs - Floats used as dollars only go up to 2 decimal places
		System.out.println( "Please insert principal amount." );
		float principal = input.nextFloat();
		
		System.out.println( "Please insert interest rate as a decimal." );
		float interestRate = input.nextFloat();
		
		System.out.println( "Please insert compounds per year." );
		float compounds = input.nextFloat();
		
		System.out.println( "Please insert time in years." );
		float time = input.nextFloat();
		
		input.close();
		
		// Processing
		float finalAmount = (float) (principal * (Math.pow(( 1 + (interestRate / compounds )), (compounds * time))));
		float finalInterest = finalAmount - principal;
		
		System.out.println( "After " + time + " years at a " + interestRate * 100 + "% interest rate compounding " + compounds + " per year with an initial investment of $" + principal + ":");
		System.out.println( "You would have $" + finalAmount + ", earning a compound interest of " + finalInterest);
		
	}
}
