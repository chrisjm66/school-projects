import java.util.Scanner;
public class Lab6_1 {
	public static void main( String[] Args ) {
		Scanner input = new Scanner(System.in);
		
		for( int i = 0; i < 3; i++ ) {
			System.out.println("\nEnter a number and I will reverse it.");
			int userNumber = input.nextInt();
			
			reverse(userNumber);
		}
		input.close();
	}

	private static void reverse( int number ) {
		System.out.println("Your reversed number is: ");
		while ( number > 0 ) {
			System.out.print( number % 10 );
			number /= 10;
		}
		System.out.println("\n");
	}

}
