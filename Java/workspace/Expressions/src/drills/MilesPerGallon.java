package drills;

public class MilesPerGallon {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		double milesTraveled = 0.0;
		double gallonsUsed = 0.0;
		double milesPerGallon = 0.0;
		
		System.out.print("Please enter the number of miles" + " traveled: ");
		//TODO: get the miles traveled
		
		System.out.print("Please enter the number of gallons" + " used: ");
		//TODO: get the gallons used
		
		//TODO: calculate miles per gallon
		
		System.out.print("You traveled " + milesPerGallon);
		System.out.println(" miles for every gallon of fuel" + " used.");
		scanner.close();
	}
}
