public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("fizzbuzz");
				continue;
			}

			if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			}

			else {
				System.out.println(i);

			}
		}

	}

}