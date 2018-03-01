package drills;

public class DoWhileLoop {

  public static void main(String[] args) {
    // Write a do-while loop to print the numbers 1 to 10 to the screen.
	  int  number = 0;
	  
	  do {
		  number ++;
		  System.out.println(number);
	  } while (number <10); 
	  

    // Use Math.random() to write a do-while loop that will execute as long as a
    // random number is less than 0.7. Print the number inside the loop.
    // Declare a variable outside the loop, and assign a new Math.random() value in
    // the loop body. Then print the number to the screen.
    // Example: double d = Math.random();
	  double digits;
	  
	  do {
		  digits = Math.random();
		  System.out.println(digits);
	  } while (digits < 0.7);
	  System.out.println("End at: " + digits);

  }

}
