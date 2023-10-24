// Chris Mangan COMP171
public class Lab5_5 {

	public static void main(String[] args) {
		System.out.println("\t\tMultiplication Table");
		System.out.println("\t\t--------------------\n");
		System.out.print("\t");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%-5s", i);
		}
		
		System.out.print("\n     ");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%-5s", "-----");

		}
		
		System.out.print("\n");
		
		// Main Table
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "   |\t");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%-5s",i * j );
			}
			System.out.print("\n");
		}
	}

}
