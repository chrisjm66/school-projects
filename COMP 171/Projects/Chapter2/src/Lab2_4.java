// Chris Mangan COMP 171 Lab 2.4
import java.util.Scanner;
public class Lab2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		// Input Time Difference
		System.out.println( "Please enter time different from GMT" );
		int timeDifference = input.nextInt();
		input.close();
		
		// Get and process time; index 0 is hours, 1 is mins, and 2 is seconds
		int[] time = getTime( timeDifference );
		
		// Output
		System.out.println( "The time in GMT" + timeDifference + " is " + time[0] + ":" + time[1] + ":" + time[2] + ".");
	}
	public static int[] getTime( int timeDifference ) {
		long timeMilliseconds = System.currentTimeMillis();
		
		
		long totalSeconds = timeMilliseconds / 1000;
		long totalMinutes = timeMilliseconds / 1000 / 60;
		long totalHours = timeMilliseconds / 1000 / 60 / 60;
		
		// This takes the modulus of the next measurement to get the remaining time left; ex totalseconds % 60
		int hours = (int)totalHours % 24  + timeDifference;
		int minutes =  (int)totalMinutes  % 60;
		int seconds =  (int)totalSeconds  % 60;
		
		if ( hours < 0 ) {
			hours = hours + 24;
		}
		
		int[] table = { hours, minutes, seconds };
		
		return table;
	}

}

