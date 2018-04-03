package com.skilldistillery.datatypes.drills;

public class FloatValues {

  public static void main(String[] args) {
	  float f1 = 0.0f;
	  float sciF = 3e10F; // This works.
	  // f after an int literal
	  float f2 = 1f;
	  // no F, but it works
	  float f3 = 1;
	  float f4 = 0b10101;  // binary number - an int
//	  float f5 = 0b10101f; // NO, don't use F with binary numbers
	  float f6 = 0xF16F;   // F doesn't do anything here, it is a hex digit
	  float f7 = 0761;     // octal number
	  float f8 = 0761F;    // octal number with F

  }

}
