import java.util.Scanner;

public class DeafGrandma {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		hello();
		String response = keyboard.nextLine();

		do {
			if (response.equals(response.toUpperCase())) {
				canHear(response);
			} else {
				cantHear(response);
			}

			response = keyboard.nextLine();

		} while (!response.equals("GOODBYE"));
		goodbye(response);
	}

	public static void hello() {
		System.out.print("HELLO THERE, BILLY! ");
	}

	public static void cantHear(String response) {
		String answer = "HUH? SPEAK UP BILLY! ";
		System.out.print(answer);
	}

	public static void canHear(String response) {
		String answer = "NO, NOT SINCE THE WAR. ";
		System.out.print(answer);
	}

	public static void goodbye(String response) {
		String answer = "SMELL YA LATER!";
		System.out.print(answer);
	}

}
