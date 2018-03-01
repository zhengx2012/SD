package drills;

import java.util.Scanner;

public class UnreachableExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Enter a number: ");
			int num = input.nextInt();
			if (num % 2 != 0) {
				continue;
			}
			System.out.println("Thanks!");
			break;
		}
	}
}

