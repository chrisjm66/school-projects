//Chris Mangan COMP171
import java.util.Scanner;

public class Assignment4_1 {

	public static void main(String[] args) {
		// Input - grabs character from user to process
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a single letter to be converted into an encrypted number.");
		char letter = input.next().charAt(0);
		
		input.close();
		
		// Process
		int ascii = (int)letter; // Converts char to a number which will coorespond to ascii/unicode
		int alphabetOrder;
		int encryptedNumber;

		// This if statements decides if int ascii is a capital or lowercase letter and converts it into a letter accordingly.
		if ( ascii >= 65 && ascii <= 90 ) { // 65 = A 90 = Z
			alphabetOrder = ascii - 64;
		} else if ( ascii >= 97 && ascii <= 122 ) { // 97 = a, 122 = z
			alphabetOrder = ascii - 96;
		} else {
			alphabetOrder = 0;
			System.out.println("Invalid input.");
		}
		
		encryptedNumber = ( alphabetOrder * 25 ) - 15;
		
		// Output
		if ( alphabetOrder == 0 ) {
			System.out.println("You didn't enter a letter. No encryption for you!");
		} else {
			System.out.println("You entered the letter " + letter + ", which has been encrypted to the number " + encryptedNumber );
		}
		

	}

}
