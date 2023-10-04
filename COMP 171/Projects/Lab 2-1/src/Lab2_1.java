// Christopher Mangan: COMP 171 Lab 2.1
import java.util.Scanner;
public class Lab2_1 {
    public static void main( String[] args ){
        Scanner input = new Scanner( System.in );
        
        System.out.println( "Enter the number of seconds" );
        int secondsInput = input.nextInt();
        
        // Input Processing
        int minutes = secondsInput / 60;
        int seconds = secondsInput % 60;
        
        //Output
        System.out.println( secondsInput + " is " + minutes + " minutes and " + seconds + " seconds.");
        
        input.close();
    }
}
