
public class VariablePrinting {

	public static void main(String[] args) {
		double battingAverage = .345;
		double thisYearBA = battingAverage;
		battingAverage = .362; //reassignment

		System.out.println("Batting Average " + battingAverage);
		System.out.println("This years batting average " + thisYearBA + " and renegotiating my contract beacuse I can hit.");

		// Add Strings to the System.out.println() statements to display which variable is being output

	}

}
