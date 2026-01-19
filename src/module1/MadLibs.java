package module1;
import java.util.Scanner;
public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a noun (person; place; or thing); ");
		String noun = scan.nextLine();
		System.out.println("Enter an adjective (describing word): ");
		String adjective = scan.nextLine();
		System.out.println("Enter a verb ending in -ing (action): ");
		String verb = scan.nextLine();
		System.out.println("--- YOUR STORY ---");
		System.out.println("The " + adjective + " " + noun + " was " + verb + " all day long.");
	}

}
