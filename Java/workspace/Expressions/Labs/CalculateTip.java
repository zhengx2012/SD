import java.util.Scanner;

public class CalculateTip {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Here to help you calculate a tip! Please enter your check amount: $");
		double checkTotal = input.nextDouble();

		double tip1 = checkTotal * .10;
		double tip2 = checkTotal * .15;
		double tip3 = checkTotal * .20;

		System.out.println("The tip for 10% of your check is: $" + tip1);
		System.out.println("The tip for 15% of your check is: $" + tip2);
		System.out.println("The tip for 20% of your check is: $" + tip3);

		input.close();

	}
}
