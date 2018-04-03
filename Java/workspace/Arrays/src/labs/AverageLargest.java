package labs;

import java.util.Scanner;

public class AverageLargest {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("How many scores?");
		int numScores = kb.nextInt();
		
		int scores[] = new int[numScores];

		for (int i = 0; i < scores.length; i++) {
			// prompt the user
			int count = i + 1;
			
			System.out.print("Score " + count + ": ");
			// store into the array
			scores[i] = kb.nextInt();

		}
		// call calculateAverage and pass the scores array
		calculateAverage(scores);
//		testCalculateAverage();

		kb.close();
	}

	public static double calculateAverage(int scores[]) {
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = sum / scores.length;
		System.out.println("The average is: " + avg);
		return avg;
	}
	
	public static void testCalculateAverage() {
		int evens[] = {4, 6, 8, 2};
		
		for(int i = 0; i < evens.length; i++) {
			if (evens[i] % 2 == 0) {
				System.out.println("Passed");
			} else {
				System.out.println("Failed");
			}
		}
		
	}
}
