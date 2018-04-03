import java.util.Scanner;

public class RunAdder {
	public static void main(String[] args) {
		
		double total = 0.0;
		
		System.out.print("How manys segments did you run? ");
		
		Scanner kb = new Scanner(System.in);
		
		
		int segments = kb.nextInt();
		
		for (int i = 0 ; i < segments ; i++) {
			System.out.print("Enter a segment value: ");
			double value = kb.nextDouble();
			total = total + value;
		}
		
		System.out.println("Are you a skunk? ('yes/no')");
		String answer = kb.next();
		
		if(answer.equals("Yes") || (answer.equals("yes") || (answer.equals("y")))) {
			System.out.println("You ran " + total + " skunks.");
			double miles = skunkToMiles(total);
			System.out.println(miles + " miles.");
			double km = skunkToKm(total);
			System.out.println(km + " km.");
			
		}
		else {
		System.out.println("You ran " + total + " miles.");
		double km = convertToKm(total); 
		System.out.println(km + " kimometers.");
		double skunks = convertToSk(total);
		System.out.println(skunks + " skunks.");
		}
		
		kb.close();
		
	} 
	
	public static double convertToKm(double miles) {
		double km = miles * 1.61;
		return km;
	}
	
	public static double convertToSk( double miles) {
		double sk = miles * 422;
		return sk;
	}
	
	public static double skunkToMiles(double skunks) {
		double miles = skunks /422;
		return miles;
		
	}
	
	public static double skunkToKm(double skunks) {
		double km = skunks /(422 * 1.61);
		return km;
		
	}

}
