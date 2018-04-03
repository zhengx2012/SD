package labs;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "Silver";
		c1.purchasePrice = 45000.00;
		c1.make = "Lexus";
		c1.model = "NX";
		c1.numberOfWheels = 4;
		
		Car c2 = new Car();
		c2.color ="Blue";
		c2.make = "Hyundai";
		c2.model = "Elantra";
		c2.numberOfWheels = 4;
		c2.purchasePrice = 22000.00;
		
		c1.displayCar();
		c2.displayCar();
		
	}

}
