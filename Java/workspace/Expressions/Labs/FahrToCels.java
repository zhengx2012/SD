import java.util.Scanner;

public class FahrToCels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome! I will help you calculate the temperature to Celsius.");

		System.out.println("Please enter the temperature in Farhenheit: ");
		double fahren = input.nextDouble();

		double cels = fahren - 32;

		System.out.println("The degree in Celsius is:" + cels);

		input.close();
	}

}
