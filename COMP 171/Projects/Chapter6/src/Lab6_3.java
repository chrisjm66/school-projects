// Christopher Mangan COMP 171
import java.util.Scanner;
public class Lab6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer.");
		int userInt = input.nextInt();
		System.out.println("\n" + userInt + " squared is " + numberSquare( userInt ) );
		
		System.out.println("Please enter a double.");
		double userDouble = input.nextDouble();
		System.out.println("\n" + userDouble + " squared is " + numberSquare( userDouble ) );
		
		System.out.println("Please enter a float.");
		float userFloat = input.nextFloat();
		System.out.println("\n" + userFloat + " squared is " + numberSquare( userFloat ) );
		input.close();
		
	}
	
	public static int numberSquare( int number ) {
		return number * number;
	}
	
	public static double numberSquare( double number ) {
		return number * number; 
	}
	
	public static float numberSquare( float number ) {
		return number * number; 
	}
}
