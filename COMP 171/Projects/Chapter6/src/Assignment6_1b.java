import java.util.Scanner;
import java.lang.Character;
public class Assignment6_1b {

	public static void main(String[] args) {
		
		String userInput = getInput();
		String output = buildOutputString( userInput );
		
		System.out.println( "Your encrypted string is: \n" + output );
	}
	
	public static int getCypher( char letter ) {
		int alphabetOrder;
		int encryptedNumber;
		
		alphabetOrder = letter - 64;  // 65 = A 90 = Z	
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

			// ASCII: 32 = space, 97 = a, 122 = z,65 = A 90 = Z
			// This sorts through the 4 different possibilites of ASCII (uppercase, lowercase, space, or other) to output the correct data, then adds it to output like a chain.
			if( Character.isLetter( letter ) ) {
				output += " " + getCypher( Character.toUpperCase(letter) );
			} else if ( letter == 32 ) {
				output += " > ";
			} else {
				output = output + " " + letter;
			}
		}
		return output;
	}
}
