// Chris Mangan COMP171
import java.util.Scanner;
public class Lab5_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int randomNumber = (int)(Math.random() * 101.0);
		boolean userCorrect = false;
		System.out.println("Enter a guess for the random number.");
		int userGuess = input.nextInt();
		
		while( userCorrect == false ) {
			if (userGuess < randomNumber ) {
				System.out.println("You were too low. Try again.");
				
			} else if (userGuess > randomNumber ){
				System.out.println("You were too high. Try again.");
				
			} else if ( userGuess == randomNumber ) {
				userCorrect = true;
				System.out.println("Good job!");
				
			}
			userGuess = input.nextInt();
		}
		input.close();
	}

}
