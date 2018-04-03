package labs;

public class Thermometer {
	public char scale;
	public double currentTemp;

	public double getTempAsCelsius() {
		double temp;
		if (scale == 'C') {
			temp = currentTemp;
		} 
		else {
			temp = (currentTemp * 1.8) + 32;
		}
		
		return temp;
	}

	public double getTempAsFahrenheit() {
		double temp;
		if (scale == 'F') {
			temp = currentTemp;	
		}
		else {
			temp = (currentTemp - 32) / 1.8;
		}
		return temp;
	}
}
