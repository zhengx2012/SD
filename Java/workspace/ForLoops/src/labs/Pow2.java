package labs;

public class Pow2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 32; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);

		}
		for (int i = 1; i <= 16; i++) {

			System.out.println(i + ": " + (int) Math.pow(2, i));
		}
	}
}
