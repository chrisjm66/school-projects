// Chris Mangan COMP171
import java.util.Scanner;
public class Lab5_1 {
	public static void main(String[] Args) {
		// Input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write a string and I will repeat it for each character.");
		String userPhrase = input.next();
		input.close();
		
		// Process/Output
		int inputLength = userPhrase.length();
		int counter = 0;
		
		while ( counter < inputLength ) {
			System.out.println( userPhrase );
			counter++;
		}
		
	}
}
