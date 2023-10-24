// Chris Mangan COMP171
import java.util.Scanner;
public class Lab4_2 {

	public static void main(String[] args) {
		//Input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two strings and I will tell you if the second is part of the first.");
		System.out.println("Enter String 1");
		String string1 = input.nextLine();
		
		System.out.println("Enter String 2");
		String string2 = input.nextLine();
		
		// Process
		int isSubstring = string1.indexOf(string2);
		
		// Output
		if(isSubstring == -1) {
			System.out.println("\n" + string2 + " is not a subset of " + string1);
		} else {
			System.out.println("\n" + string2 + " is a subset of " + string1);
		}
		
		//OPTION 2
		
		System.out.println("Enter two strings and I will tell you if the second is part of the first.");
		System.out.println("Please input both strings separated by a space.");
		String string3 = input.next();
		String string4 = input.next();
		
		input.close();
		
		// Process
		int isSubstring2 = string3.indexOf(string4);
		
		// Output
		if(isSubstring2 == -1) {
			System.out.println("\n" + string4 + " is not a subset of " + string3);
		} else {
			System.out.println("\n" + string4 + " is a subset of " + string3);
		}
	}

}
