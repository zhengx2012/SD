package labs;

public class RandomString {

	public static void main(String[] args) {
		int if_ = 0xCAFE_BABE;
		System.out.println(if_);

		String animals[] = { "giraffe", "cat", "dog", "fish", "goat" };

		for (int i = 0; i < 10; i++) {
			int result = (int) (Math.random() * animals.length);
			System.out.println(animals[result]);
		}

	}

}