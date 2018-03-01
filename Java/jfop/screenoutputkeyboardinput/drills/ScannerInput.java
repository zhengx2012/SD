
public class ScannerInput {

	public static void main(String[] args) {
		// Add a prompt to the code so that the user knows to enter data. Output the data.
		int yearBorn;
		boolean forward;

		java.util.Scanner keyboard = new java.util.Scanner(System.in);

		// add a prompt...
		System.out.println("Please enter your birth year: ");
		yearBorn = keyboard.nextInt();

		System.out.println("Would you like to continue? (true/false)");
		forward = keyboard.nextBoolean();

		// output the data...
		System.out.println("You were born in " + yearBorn + ", but you look great!" );
		// Run the program.

		keyboard.close();
	}

}
