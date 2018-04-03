package com.skilldistillery.numeralsystems.labs;

public class PrintNumbers3 {

	public static void main(String[] args) {
		int k = 60000;
		printNumbers(k);

	}

	private static void printNumbers(int k) {
		for( int i = 0; i <= k; i++) {
			System.out.printf("%d in hexadecimal is %x%n", i, i);
			System.out.printf("%d in decimal is %d%n", i, i);
			System.out.printf("%d in octal is %o%n", i, i);
			System.out.println( i + " in binary is: " + Integer.toBinaryString(i));
			System.out.println("");
			
		} 
		
	}

}
