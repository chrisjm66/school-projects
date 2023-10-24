// Chris Mangan COMP171
import java.util.Scanner;
public class Lab5_3b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer to be added and enter 0 when you are done.");
		int currentInput;
		int sum = 0;
		
		do {
			System.out.println("Enter an integer and enter 0 when done.");
			currentInput = input.nextInt();
			
			sum+=currentInput;
		} while (currentInput != 0);

		input.close();
		System.out.println("You entered numbers which totaled to " + sum);
	}

}
