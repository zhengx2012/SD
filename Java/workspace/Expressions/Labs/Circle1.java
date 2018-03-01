import java.util.Scanner;

public class Circle1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a radius: ");
		double radius = input.nextDouble();

		double circumference = 2 * 3.141592653589793 * radius;
		System.out.println("The radius of your circle is: " + radius + " and the cirumference is: " + circumference);

		input.close();

	}

}
