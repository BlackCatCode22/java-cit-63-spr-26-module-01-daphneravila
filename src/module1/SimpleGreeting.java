package module1;
import java.util.Scanner;
public class SimpleGreeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.println("Hello "+ name);
		
	}

}
