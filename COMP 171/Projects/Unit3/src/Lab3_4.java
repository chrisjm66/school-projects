// Chris Mangan Lab 3.4
public class Lab3_4 {

	public static void main(String[] args) {
		
		int number = (int)(Math.random() * 12) + 1;
		System.out.println("Month: " + number);
		
		// Process
		switch( number ) {
			case 1: 
				System.out.println("January");
				break;
			case 2: 
				System.out.println("February");
				break;
			case 3: 
				System.out.println("March");
				break;
			case 4: 
				System.out.println("April");
				break;
			case 5: 
				System.out.println("May");
				break;
			case 6: 
				System.out.println("June");
				break;
			case 7: 
				System.out.println("July");
				break;
			case 8: 
				System.out.println("August");
				break;
			case 9: 
				System.out.println("September");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("It's the fourth quarter!");
				break;		
			default: 
				System.out.println("Fix your code");
				break;
		}
	}
}
