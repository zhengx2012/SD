package drills;

import java.util.Scanner;

public class WhileLoopSteps {

	public static void main(String[] args) {
		// Write a `while` loop that will accept a number from the user, multiply it by
		// 2, and print the value to the screen. The program should accept data from the
		// user until the user enters zero.
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int num = sc.nextInt();

		// while loop to multiply and get more input...
		while (num != 0) {
			System.out.print(num * 2);
			System.out.println("Please enter a number: ");
			num = sc.nextInt();
		}
		System.out.println("Finished");
		sc.close();
	}
	

}
