// Christopher Mangan COMP 171

import java.util.Scanner;

public class Assignment6_2 {
    public static void main( String[] Args ){
        Scanner input = new Scanner( System.in );
        System.out.println( "Welcome to OVERLOAD MANIA! \n" );

        // METHOD 1
        int randomNumber10to100 = (int)( Math.random() * 91D )+ 10;
        overloadAttack( randomNumber10to100 );

        // METHOD 2
        double randomNumber0to1 = Math.random();
        overloadAttack( randomNumber0to1 );

        // METHOD 3
        System.out.println( "Enter a string and I will do something amazing." );
        String userString = input.nextLine();
        overloadAttack( userString );

        // METHOD 4
        int method4Return = overloadAttack( randomNumber10to100, randomNumber0to1 );
        System.out.println( String.format("\nThe integer value of %d raised to %.4f times 4 is %d.", randomNumber10to100, randomNumber0to1, method4Return ) );

        // METHOD 5
        System.out.println( "\nEnter an integer between -10 and 10 and I will do something magical." );
        int userInt = input.nextInt();
        if( userInt >= -10 && userInt <= 10 && userInt != 0 ){
            double method5Return = overloadAttack( randomNumber10to100, userInt );
            System.out.println( String.format("%d divided by %d is equal to %.4f.", randomNumber10to100, userInt, method5Return ) );
        } else {
            System.out.println( "Bad range!" );
        }
        input.close();

        // METHOD 6
        int randomInt0to1 = (int)(Math.random() * 2);
        boolean positive = randomInt0to1 == 0 ? false : true;
        double someNumber = randomNumber10to100 * randomNumber0to1;
        double sqrtSomeNumber = Math.sqrt( someNumber );

        double method6Return = overloadAttack( sqrtSomeNumber, positive );


        System.out.println( "\tThe random boolean is " + positive + "." );
        System.out.println( String.format( "\tThe random integer %d multiplied by %.4f is %.4f.", randomNumber10to100, randomNumber0to1, someNumber ) );
        System.out.println( String.format( "\tThe square of %.4f is %.4f.", someNumber, sqrtSomeNumber ) );
        System.out.println( String.format("\tThe %s cube of %.4f is %.4f.", ( positive ? "positive" : "negative" ), sqrtSomeNumber, method6Return ) );

    }

    // METHOD 1
    private static void overloadAttack( int someNumber ){
        int sum = 0;
        for ( int i = 0; i < someNumber; i++ ){
            sum += i;
        }
        System.out.println( "The sum from 1 to " + someNumber + " is " + sum );
    }

    // METHOD 2
    private static void overloadAttack( double someNumber ){
        System.out.println( String.format("The random number is %.3f", someNumber ));
    }

    // METHOD 3
    private static void overloadAttack( String someString ){
        for( int i = ( someString.length() - 1 ); i >= 0; i--){
            System.out.print( someString.charAt( i ));
        }
        System.out.print( "\n" ); // for ease of reading
    }

    // METHOD 4
    private static int overloadAttack( int someNumber, double someOtherNumber ){
        return (int)Math.pow(someNumber, someOtherNumber * 4);
    }

    // METHOD 5
    private static double overloadAttack(int someNumber, int someOtherNumber){
        if (someOtherNumber != 0) { // this uses not as its most likely that someOtherNumer is not equal to 0
            return someNumber / someOtherNumber;
        } else {
            System.out.println( "The second number cannot equal 0." );
            return 0;
        }
    }

    // METHOD 6
    private static double overloadAttack(double someNumber, boolean positive){
        someNumber = Math.pow( someNumber, 3 );
        return positive ? someNumber : -someNumber;
    }
}
