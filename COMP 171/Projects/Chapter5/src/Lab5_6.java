// Chris Mangan COMP171
public class Lab5_6 {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++) {
			if( i * 3 > 150 ) {
				break;
			}
			if( i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
