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
		
		// Processes game outcome
		switch( userChoice ) {
			case 0:
				if (computerChoice == 2 || computerChoice == 3) {
					userWon = true;
				} else if (computerChoice == 1 || computerChoice == 4){
					userWon = false;
				} else
					draw = true;
				break;
			case 1:
				if (computerChoice == 0 || computerChoice == 4) {
					userWon = true;
				} else if (computerChoice == 2 || computerChoice == 3){
					userWon = false;
				} else
					draw = true;
				break;
			case 2:
				if (computerChoice == 1 || computerChoice == 3) {
					userWon = true;
				} else if (computerChoice == 0 || computerChoice == 4){
					userWon = false;
				} else
					draw = true;
				break;
			case 3:
				if (computerChoice == 1 || computerChoice == 4) {
					userWon = true;
				} else if (computerChoice == 0 || computerChoice == 2){
					userWon = false;
				} else
					draw = true;
				break;
			case 4:
				if (computerChoice == 0 || computerChoice == 2) {
					userWon = true;
				} else if (computerChoice == 1 || computerChoice == 3){
					userWon = false;
				} else
					draw = true;
				break;
			default:
				userWon = false;
				draw = true;
				System.out.println("Processing Error");
				break;
		}
		
		// Output
		System.out.println("You picked " + userWord + " and the computer chose " + computerWord);
		if ( draw ) {
			System.out.println("It's a draw!");
		} else if ( userWon ) {
			System.out.println("Congrats! You won!");
		} else {
			System.out.println("You lost. Better luck next time!");
		}

	}

}
