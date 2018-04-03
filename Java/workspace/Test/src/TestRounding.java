
public class TestRounding {
	public static void main(String[] args) {
		
	double decimal = .599999;
	decimal = Math.round(decimal*1000) / 100;
	System.out.println(decimal);
	}

}
