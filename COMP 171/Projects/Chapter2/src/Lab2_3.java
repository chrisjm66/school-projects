// Chris Mangan COMP 171 Lab 2.3
import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		// Input
		System.out.println( "Please input temperature in degrees Fahrenheit" );
		double tempF = input.nextDouble();
		input.close();
		
		// Process
		double tempC =  (5/9D) * ( tempF - 32D );
		
		// Output
		System.out.println( tempF + " degrees F is " + tempC + " in degrees C." );
	}

}
