package drills;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		doDivision();

		// doModulus();
	}

	static void doDivision() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Refresher:\n\tDivision:\tquotient = dividend / divisor");
		System.out.print("Enter the dividend: ");
		int dividend = sc.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = sc.nextInt();
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("quotient = " + quotient);
		System.out.println("\tRemainder: " + remainder);

		sc.close();
	}

	static void doModulus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Refresher:\n\tDivision:\tquotient = dividend / divisor");
		System.out.print("Enter the dividend: ");
		int dividend = sc.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = sc.nextInt();
		int remainder = dividend % divisor;
		System.out.println("\tRemainder: " + remainder);
		// Complete the method and use the modulus operator to find the remainder.
		sc.close();
	}

}
