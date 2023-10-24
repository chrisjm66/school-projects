// Chris Mangan Lab 3.3
import java.util.Scanner;
public class Lab3_3 {
	
	public static void main(String[] args) {
		// Input
		Scanner input = new Scanner( System.in );
		
		System.out.println("Please enter an integer.");
		int number = input.nextInt();
		input.close();
		
		// Process & Output
		int mod6 = number % 6;
		int mod5 = number % 5;
		
		// Output
		
		if ( mod5 == 0 && mod6 == 0 ) {
			System.out.println("The number you entered is divisible by 6 and 5.");
		}
		if ( mod5 == 0 ^ mod6 == 0) {
			System.out.println("The number entered is divisible by 5 or 6 but not both.");
		}
		if ( mod5 == 0 || mod6 == 0 ) {
			System.out.println("The number entered is divisible by 5 or 6.");
		}
		if ( mod5 != 0 && mod6 != 0 ){
			System.out.println("The number entered is not divisible by 5 or 6.");
		}
		

	}

}
