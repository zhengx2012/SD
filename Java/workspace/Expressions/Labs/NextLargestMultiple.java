import java.util.Scanner;

public class NextLargestMultiple {
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);

		System.out.println("Please enter two integers and I will give you the next largest even multiple.");
		System.out.println("Integer one: ");
		int i = keys.nextInt();

		System.out.println("Integer two: ");
		int j = keys.nextInt();

		double nextMultiple = i + j - i % j;

		System.out.println("The next largest even multiple is: " + nextMultiple);

		keys.close();
	}

}
