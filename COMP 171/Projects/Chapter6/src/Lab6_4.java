// Christopher Mangan COMP 171
import java.util.Scanner;

public class Lab6_4 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        // Int
        System.out.println("Enter an integer and I will repeat it to you.");
        int userInt = input.nextInt();
        echoInput(userInt);

        input.nextLine(); // This exists since nextInt doesn't read the newline which triggers nextLine

        // String
        System.out.println("\n Enter a string and I will repeat it to you.");
        String userString = input.nextLine();
        echoInput(userString);

        input.close();
    }

    public static void echoInput(int number) {
        System.out.println("You entered the number:" + number);
    }

    public static void echoInput(String userString) {
        System.out.println("You entered the string:" + userString);
    }
}
