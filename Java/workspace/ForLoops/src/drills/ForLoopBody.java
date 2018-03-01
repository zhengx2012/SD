package drills;

public class ForLoopBody {

	public static void main(String[] args) {
		//Write a for loop to print the numbers 10 to 1 to the screen.
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
			
		}
		
		int sum = 0;
		//Write a for loop to find the sum of the values 1 to 10. Print the sum to the screen.
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//Write a for loop to print the values 1 to 5. Output should be comma-separated: 1, 2, 3, 4, 5.
		//Hint: the loop will need to check which iteration it is on to prevent a comma showing after 5.
		for(int i = 1; i <= 5; i++) {
			if (i < 5) {
				System.out.print(i + ", ");
			}
			else {
				System.out.print(i +".");
			}
		}
			
	}

}
