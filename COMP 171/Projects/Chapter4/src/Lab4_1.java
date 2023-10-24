// Chris Mangan COMP171
public class Lab4_1 {

	public static void main(String[] args) {
		//Input
		int num1 = (int)(Math.random() * 100) + 1;
		int num2 = (int)(Math.random() * 100) + 1;
		
		
		// Process
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		int square1 = (int)Math.pow(num1, 2);
		int square2 = (int)Math.pow(num2, 2);
		
		double sqrt1 = Math.sqrt(num1);
		double sqrt2 = Math.sqrt(num2);
		
		//Output
		System.out.println("Num1 = " + num1 + "; Num2 = " + num2);
		System.out.println("The max is " + max + " and the minimum is " + min);
		System.out.println("The square of number one is " + square1 + " and the square of number two is " + square2);
		System.out.println("The root of number one is " + sqrt1 + " and the root of number two is " + sqrt2);
	}

}
