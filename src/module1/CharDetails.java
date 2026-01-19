package module1;
import java.util.Scanner;
public class CharDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a single character: ");
		char input = scan.next().charAt(0);
		int unicodeValue = (int) input;
		System.out.println("Unicode Value: " + unicodeValue);
		System.out.println("Is it a letter? " + Character.isLetter(input));
		System.out.println("Is it a digit? " + Character.isDigit(input));
		
	}

}
