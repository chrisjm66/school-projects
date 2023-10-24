// Chris Mangan COMP171
import java.util.Scanner;
public class Lab5_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer to be added and enter 0 when you are done.");
		int currentInput = input.nextInt();
		int sum = 0;
		
		while (currentInput != 0) {
			sum+=currentInput;
			
			System.out.println("Enter another integer and enter 0 when done.");
			currentInput = input.nextInt();
		}
		input.close();
		System.out.println("You entered numbers which totaled to " + sum);
	}

}
