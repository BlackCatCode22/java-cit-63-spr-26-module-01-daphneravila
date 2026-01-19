package module1;
import java.util.Scanner;
public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit: ");
		double fahrenheit = scan.nextDouble();
		double celsius = (fahrenheit - 32) * (5.0 / 9.0);
		System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
		

	}

}
