package labs;

public class Car {
	// These are the Fields that define a Car instance.
	public String make;
	public String model;
	public String color;
	public int numberOfWheels;
	public double purchasePrice;
	
	public String getCarData() {
		String data = make + " " + model + " " + color + " " 
					+ numberOfWheels + " " + purchasePrice;
		return data;
	}
	public void displayCar() {
		System.out.println(getCarData());
	}
}

