// Christopher Mangan, COMP 171 Lab 2.2
import java.util.Scanner;
public class Lab2_2 {
    public static void main( String[] args){
        Scanner input = new Scanner( System.in );

        // Input
        System.out.println( "Insert number of feet" );
        double feetInput = input.nextDouble();

        // Process Input
        double meters = feetInput * 0.305;

        // Output & Close Input
        System.out.println( feetInput + " feet is equal to " + meters + " meters." );

        input.close();
    }
}
