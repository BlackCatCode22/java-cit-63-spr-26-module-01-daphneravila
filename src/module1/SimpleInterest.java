package module1;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principal amount:");
		double principal = scan.nextDouble();
		System.out.println("Enter the Rate (example: 0.05 for 5%):");
		double rate = scan.nextDouble();
		System.out.println("Enter the Time (in years):");
		double time = scan.nextDouble();
		double interest = principal * rate * time;
		System.out.println("The simple interest is: " + interest);
		
	}

}
