package labs;

import java.util.Scanner;

public class RemoteControlLoop {

	public static void main(String[] args) {
		pushButton();

	}

	// push button, BOOP! for numbers 0-9, TURN ON/OFF for buttons ON/OFF
	public static void pushButton() {
		Scanner input = new Scanner(System.in);

		System.out.println("Please turn on the remote to begin: ");
		// System.out.print("Press numbers 0-9, or ON/OFF: ");
		String buttonSelection = input.nextLine();
		do {
			System.out.println(buttonSelection);

			switch (buttonSelection) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				numSelection();
				break;

			case "ON":
				turnOn();
				break;

			case "OFF":
				turnOff();
				break;

			default:
				errorButton();
				break;
			}

			input.close();

		} while (!buttonSelection.equals("OFF"));

	}

	public static void numSelection() {
		System.out.println("BOOP!");

	}

	public static void turnOn() {
		System.out.println("TURNING ON...");

	}

	public static void turnOff() {
		System.out.println("TURNING OFF...");

	}
	public static void errorButton() {
		System.out.println("You pressed the wrong button!");
	}
}
