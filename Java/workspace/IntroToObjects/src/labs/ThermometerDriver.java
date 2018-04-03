package labs;

import java.util.Scanner;

public class ThermometerDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a temperature: ");
		double temp = input.nextDouble();
		
		System.out.print("Enter a scale: ");
		String scale = input.next();
		
		char scaleChar = scale.charAt(0);
		
		Thermometer therm = new Thermometer();
		therm.currentTemp = temp;
		therm.scale = scaleChar;
		
		double fahr = therm.getTempAsFahrenheit();
		double cels = therm.getTempAsCelsius();
		
		System.out.println(temp + " in Fahrenheit: " + fahr);
		System.out.println(temp + " in Celsius: " + cels);
		
		input.close();

	}

}
