import java.util.Scanner;

public class HiLo {

	static String answer;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		play();
		input.close();
	}

	public static void play() {
		// Your program will use Math.random to generate a random number between 1 and
		// 20. (Do not show this number to the user.)
		int number;
		double computerNumber = 1 + (int) (Math.random() * 5);

		// The user is asked to choose a number between 1 and 20.
		do {
			System.out.println("Please choose a number between 1 and 20: ");
			number = input.nextInt();

			// The program will then compare their guess with the randomly-generated number.
			// If they are equal, notify the player they have won.
			// If their guess is not correct, notify the user whether this value is greater
			// than or less than the randomly selected number.
			// If the user guessed incorrectly they will be prompted to guess again.
			if (number == computerNumber) {
				System.out.println("You have won!!!");
			} else if (number < computerNumber) {
				System.out.println("Your guess is too low.");
			} else if (number > computerNumber) {
				System.out.println("Your guess is too high.");
			}
			// If they were correct they will be asked if they would like to play again. If
			// they choose yes, a new number will be randomly generated and the game will
			// begin again.
		} while (number != computerNumber);
		System.out.println("Would you like to play again? (y/n)");
		String answer = input.next();
		if (answer.equals("y")) {
			play();
		} else {
			System.out.println("Thank you for playing!");
		}

	}

}