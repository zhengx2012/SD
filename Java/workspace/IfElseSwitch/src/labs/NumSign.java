package labs;

import java.util.Scanner;

public class NumSign {

	public static void main(String[] args) {
		run();

	}

	public static void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a positive or negative intger: ");
		int number = input.nextInt();

		if (number >= 1) {
			System.out.println("Your number is positive.");

		} else {
			System.out.println("Your number is negative.");
		}

		input.close();
	}

}
