// Christopher Mangan COMP171
import java.util.Scanner;
public class Assignment5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		// Inputs - Floats used as dollars only go up to 2 decimal places
		System.out.println( "Please insert principal amount." );
		float principal = input.nextFloat();
		
		System.out.println( "Please insert time in years." );
		float time = input.nextFloat();
		
		int COMPOUNDS = 1;
		float interestRate = 5; // This will get divided in the loop. It is too ugly when put into a decimal and is easier to format.
		
		input.close();
		
		// Process
		float finalAmount, finalInterest;
		String stringFormat = "\t %.3f%% \t \t $%.2f \n";
		
		// Output
		System.out.println("\t Interest Rate \t \t Interest Earned");
		System.out.println("\t-------------------------------------------\n");
		for( int i = 0; i <= 24; i++) {
			finalAmount = (float) (principal * (Math.pow(( 1 + ((interestRate / 100) / COMPOUNDS )), (COMPOUNDS * time))));
			finalInterest = finalAmount - principal;
			//System.out.println( String.format(stringFormat, interestRate, finalInterest));
			System.out.printf(stringFormat, interestRate, finalInterest);
			
			interestRate+=.125;
		}
	}

}
