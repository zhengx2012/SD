package drills;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int min, max, salary;

		System.out.println("Let's see if the salary you've been offered is what you expected.");
		System.out.print("Enter your minimum salary requirement: ");
		min = sc.nextInt();
		System.out.print("Enter the maximum you would ask for: ");
		max = sc.nextInt();
		System.out.print("Enter the salary offered: ");
		salary = sc.nextInt();

		boolean isExpectedSalary = false;
		// Add code to check if the salary is in the range of min and max and assign
		// that
		// value to isExpectedSalary

		isExpectedSalary = salary >= min && salary <= max;
		System.out.println("This salary is in the range of your min and max. " + isExpectedSalary);

		System.out.println("Is this salary what you expected for the position? " + isExpectedSalary);

		// Add code to check and output whether the salary is "dreamy," where dreamy
		// means it is
		// more than $10,000 greater than your max.

		if (salary >= max) {
			System.out.println("Your expected salary is dreamy.");

		} else if (salary <= min) {
			System.out.println("Your expected salary is laughable.");
		}
		// Add code to check and output whether the salary is "laughable," where
		// laughable means it is
		// at least $5,000 less than your minimum salary requirement.

		sc.close();
	}
}
