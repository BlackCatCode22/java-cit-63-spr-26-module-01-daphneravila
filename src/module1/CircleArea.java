package module1;
import java.util.Scanner;
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the radius: ");
		double radius = scan.nextDouble();
		double area = Math.PI * radius * radius; 
		System.out.println("The area is: " + area);
	}

}
