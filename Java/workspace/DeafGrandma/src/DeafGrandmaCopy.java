import java.util.Scanner;

public class DeafGrandmaCopy {
	static Scanner keyboard = new Scanner(System.in);
	static String response;

	public static void main(String[] args) {
		askBilly();
	}

	public static void askBilly() {
		System.out.println("HI THERE, BILLY");
		response = keyboard.nextLine();

		answer();

	}

	public static void answer() {
		do {
			if (response.equals(response.toUpperCase())) {
				System.out.println("NO, NOT SINCE THE WAR!");
			} else {
				System.out.println("HUH? SPEAK UP BILLY!");
			}

			response = keyboard.nextLine();

		} while (!response.equals("GOODBYE"));
		System.out.println("SMELL YA LATER!");

	}

}
