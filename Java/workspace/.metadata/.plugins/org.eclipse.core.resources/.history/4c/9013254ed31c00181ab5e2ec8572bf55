package drills;

public class CalculateTemp {

	public static void main(String[] args) {
		double temp = calculateTemp(0, 'C');
		System.out.println(temp);
	}

	public static double calculateTemp(double temp, char value) {
		double newTemp = 0;

		if (value == 'F') {
			newTemp = (temp - 32) / 1.8;
		} else if (value == 'C') {
			newTemp = (temp * 1.8) + 32;
		} else {
			System.out.println("Please enter correct characters.");
		}
		return newTemp;
	}

}
