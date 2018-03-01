package drills;

import java.util.Scanner;

public class SalaryDecisions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int min, max, salary;

		System.out.println("Let's see if the salary you've been offered is acceptable.");
		System.out.print("Enter your minimum salary requirement: ");
		min = sc.nextInt();
		System.out.print("Enter the maximum you would ask for: ");
		max = sc.nextInt();
		System.out.print("Enter the salary offered: ");
		salary = sc.nextInt();

		boolean isAcceptableSal = false;
		// TODO: Change the code to print "The salary is acceptable." if isAcceptableSal
		// is true. Use a code block for the if statement.
		// Comment out the old System.out.println statement
		isAcceptableSal = salary >= min && salary <= max;
		// System.out.println("Is this salary acceptable? " + isAcceptableSal);
		if (isAcceptableSal) {
			System.out.println("The salary is acceptable.");

		}

		boolean isDreamy = salary > 10000 + max;
		boolean isLaughable = salary <= min - 5000;
		// TODO: Change the code to print "The salary is more than $10000 over max" if
		// the condition is true.
		// Do not use the condition "isDreamy == true". You can just use the variable
		// itself because it is a boolean.
		// Comment out the old System.out.println statement
		// System.out.println("Is the salary more than $10000 over your max? " +
		// isDreamy);
		if (isDreamy) {
			System.out.println("The salary is more than $10000 over max");

		} else {
			System.out.println("The salary is $5000 or more below min");

		}

		// TODO: Change the code to print "The salary is $5000 or more below min" if the
		// condition is true.
		// Comment out the old System.out.println statement and the isLaughable
		// variable.
		// System.out.println("Is the salary laughable? " + isLaughable);
		sc.close();
	}
}
