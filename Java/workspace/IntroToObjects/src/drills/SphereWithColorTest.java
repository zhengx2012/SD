package drills;

public class SphereWithColorTest {

	public static void main(String[] args) {
		// Create several SphereWithColor reference variables
		// and new objects.
		// Initialize each object's color and radius fields.
		SphereWithColor sphereWC = new SphereWithColor();
		sphereWC.radius = 7.7;
		sphereWC.color = "Green";
		
		SphereWithColor sphereWC1 = new SphereWithColor();
		sphereWC1.radius = 15.98;
		sphereWC1.color = "Blue";
		
		SphereWithColor sphereWC2 = new SphereWithColor();
		sphereWC2.radius = 4.3;
		sphereWC2.color = "Purple";

		// Call displaySphere for each object.

		sphereWC.displaySphere();
		sphereWC1.displaySphere();
		sphereWC2.displaySphere();

		// Create another SphereWithColor, but do not initialize its fields.
		// Call its displaySphere method. What values do you see?
		SphereWithColor sphereW3 = new SphereWithColor();
		sphereW3.displaySphere();
	}

}
