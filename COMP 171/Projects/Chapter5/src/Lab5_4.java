// Chris Mangan COMP171
import java.util.Scanner;
public class Lab5_4 {

	public static void main(String[] args) {
		// Input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string and I will change your life");
		String userInput = input.next();
		input.close();
		
		// Process/Output
		System.out.println( "You entered: \n" + userInput + "\n" );
		
		for( int i = 0; i < userInput.length(); i++) {
			System.out.print( userInput.charAt(i) + " ");
		}
		
		System.out.println("\n");
		
		for( int i = userInput.length() - 1; i >= 0; i--) {
			System.out.print(userInput.charAt(i));
		}
		
		System.out.println("\n");
		
		for( int i = userInput.length() - 1; i >= 0; i-=2) {
			System.out.print(userInput.charAt(i));
		}
	}

}
