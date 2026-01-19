package module1;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = scan.nextDouble();
		System.out.println("Addition: " + (num1 + num2));
		System.out.println("Subrtraction: " + (num1 - num2));
		System.out.println("Multiplication: " + (num1 * num2));
		System.out.println("Division: " + (num1 / num2));

	}

}
