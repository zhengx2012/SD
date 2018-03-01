package labs;

import java.util.Scanner;

public class RemoteControl {

	public static void main(String[] args) {
		pushButton();

	}

	// push button, BOOP! for numbers 0-9, TURN ON/OFF for buttons ON/OFF
	public static void pushButton() {
		Scanner input = new Scanner(System.in);

		System.out.println("Please push a button!");
		System.out.print("Press numbers 0-9, or ON/OFF: ");
		String buttonSelection = input.nextLine();

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
			System.out.println("BOOP!");
			break;

		case "ON":
		case "On":
		case "on":
			System.out.println("TURNING ON...");
			break;

		case "OFF":
		case "Off":
		case "off":
			System.out.println("TURNING OFF...");
			break;

		default:
			System.out.println("You pressed the wrong button!");
			break;
		}

		input.close();

	}

}
