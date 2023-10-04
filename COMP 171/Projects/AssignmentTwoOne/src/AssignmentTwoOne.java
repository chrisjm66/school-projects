// Chris Mangan, COMP 171 Assignment 2.1
import java.util.Scanner;
public class AssignmentTwoOne {
    public static void main( String[] args ){
        Scanner input = new Scanner( System.in );

        // Inputs
        System.out.println( "Insert speed of train in miles per hour" );
        double velocity = input.nextDouble();
        System.out.println( "Insert miles until crashing" );
        double distance = input.nextDouble();

        input.close();

        // Processing
        double hoursUntilCrashing = distance / velocity;

        // Output
        System.out.println( "The train is traveling at " + velocity + " miles per hour." );
        System.out.println( "The train has " + distance + " miles until crashing." );
        System.out.println( "The train will crash in " + hoursUntilCrashing + " hours." );
    }
}