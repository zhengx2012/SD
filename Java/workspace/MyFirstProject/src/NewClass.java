import java.util.Scanner;

public class NewClass {
	public static void main(String[] args) {
		// TODO create scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Type Something: ");
		String s = input.nextLine();
		if (s.length() > 0) {
		System.out.println("You said, \"" + s + "\"");
		} 
		
		else {
			System.out.println("Whatever.");
		}
		input.close();
	}
}
