// Chris Mangan COMP 171 Assignment 3.1
import java.util.Scanner;
public class Assignment3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.println("Enter the number cooresponding to your choice. \n 0 - Rock \n 1 - Paper \n 2 - Scissors \n 3 - Lizard \n 4 - Spock");
		int userChoice = input.nextInt();
		input.close();
		
		// Process
		String userWord, computerWord;
		int computerChoice = (int)(Math.random() * 5);
		boolean userWon = false, draw = false; // Booleans used as they use less data than a string
		
		// This sets the word for the output. I would separate this into a function/module if we covered it.
		switch( userChoice ) {
			case 0:
				userWord = "Rock";
				break;
			case 1:
				userWord = "Paper";
				break;
			case 2:
				userWord = "Scissors";
				break;
			case 3:
				userWord = "Lizard";
				break;
			case 4:
				userWord = "Spock";
				break;
			default:
				userWord = "Unknown";
				break;
		}
		switch( computerChoice ) {
			case 0:
				computerWord = "Rock";
				break;
			case 1:
				computerWord = "Paper";
				break;
			case 2:
				computerWord = "Scissors";
				break;
			case 3:
				computerWord = "Lizard";
				break;
			case 4:
				computerWord = "Spock";
				break;
			default:
				computerWord = "Unknown";
				break;
		}
		
		// Processes game outcome; First it uses a switch to get the user's choice and uses another switch statement to print the outcome and set the booleans
		
		System.out.println("You picked " + userWord + " and the computer chose " + computerWord);
		
		switch( userChoice ) {
			case 0: // User Choice: Rock
				switch(computerChoice) {
					case 1:
						System.out.println("Paper covers rock.");
						userWon = false;
						break;
					case 2:
						System.out.println("Rock crushes scissors.");
						userWon = true;
						break;
					case 3:
						System.out.println("Rock crushes lizard.");
						userWon = true;
						break;
					case 4:
						System.out.println("Spock vaporizes rock.");
						userWon = false;
						break;
					default:
						userWon = false;
						draw = true;
				}
				break;
			case 1: // User Choice: Paper
				switch(computerChoice) {
					case 1:
						System.out.println("Paper covers rock.");
						userWon = true;
						break;
					case 2:
						System.out.println("Scissors cuts paper.");
						userWon = false;
						break;
					case 3:
						System.out.println("Lizard eats paper.");
						userWon = false;
						break;
					case 4:
						System.out.println("Paper disproves spock.");
						userWon = true;
						break;
					default:
						userWon = false;
						draw = true;
					}
				break;
			case 2: // User choice: Scissor
				switch(computerChoice) {
					case 0:
						System.out.println("Rock crushes scissors.");
						userWon = false;
						break;
					case 1:
						System.out.println("Scissors cuts paper.");
						userWon = true;
						break;
					case 3:
						System.out.println("Scissors decapitates lizard.");
						userWon = true;
						break;
					case 4:
						System.out.println("Spock smashes scissors.");
						userWon = false;
						break;
					default:
						userWon = false;
						draw = true;
				}
				break;
			case 3: // User Choice: Lizard
				switch(computerChoice) {
					case 0:
						System.out.println("Rock crushes lizard.");
						userWon = false;
						break;
					case 1:
						System.out.println("Lizard eats paper.");
						userWon = true;
						break;
					case 2:
						System.out.println("Scissors decapitates lizard.");
						userWon = false;
						break;
					case 4:
						System.out.println("Lizard poisons spock.");
						userWon = true;
						break;
					default:
						userWon = false;
						draw = true;
				}
				break;
			case 4:
				switch(computerChoice) {
				case 0:
					System.out.println("Spock vaporizes rock.");
					userWon = true;
					break;
				case 1:
					System.out.println("Paper disproves spock.");
					userWon = false;
					break;
				case 2:
					System.out.println("Spock decapitates scisors.");
					userWon = true;
					break;
				case 3:
					System.out.println("Lizard poisons spock.");
					userWon = false;
					break;
				default:
					userWon = false;
					draw = true;
			}
				break;
			default:
				userWon = false;
				draw = true;
				System.out.println("Processing Error");
				break;
		}
		
		// Final Output

		if ( draw ) {
			System.out.println("It's a draw!");
		} else if ( userWon ) {
			System.out.println("Congrats! You won!");
		} else {
			System.out.println("You lost. Better luck next time!");
		}

	}

}
