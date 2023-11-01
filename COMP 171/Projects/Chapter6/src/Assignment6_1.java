// Christopher Mangan COMP 171
import java.util.Scanner;
public class Assignment6_1 {

	public static void main(String[] args) {
		
		String userInput = getInput();
		String output = buildOutputString( userInput );
		
		System.out.println( "Your encrypted string is: \n" + output );
	}
	
	public static int getCypher( char letter ) {
		int ascii = (int)letter; // Converts char to a number which will coorespond to ascii/unicode
		int alphabetOrder;
		int encryptedNumber;
		
		alphabetOrder = ascii - 64;  // 65 = A 90 = Z	
		encryptedNumber = ( alphabetOrder * 25 ) - 15;



		return encryptedNumber;
	}
	
	public static String getInput() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string and I will encrypt it for you:");
		String userInput = input.nextLine();
		input.close();
		
		return userInput;
	}
	
	public static String buildOutputString( String input ) {
		String output = " ";
		for (int i = 0; i < input.length(); i++ ) {
			char letter = input.charAt( i );
			int ascii = (int)letter;
			
			
			// ASCII: 32 = space, 97 = a, 122 = z,65 = A 90 = Z
			// This sorts through the 4 different possibilites of ASCII (uppercase, lowercase, space, or other) to output the correct data, then adds it to output like a chain.
			if( ascii >= 97 && ascii <= 122 ) {
				ascii -= 32;
				letter = (char)ascii;
				output += " " + getCypher( letter );
			} else if ( ascii >= 65 && ascii <= 90 ) {
				output += " " + getCypher( letter );
			} else if ( ascii == 32 ) {
				output += " > ";
			} else {
				output = output + " " + letter;
			}
			

		}
		return output;
	}
}
