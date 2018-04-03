package com.skilldistillery.datatypes.labs;

public class Overflow {

	public static void main(String[] args) {
		int big = 2_147_483_647;
		int bigger = big + 1; //makes the value a negative
		
		System.out.println(big);
		System.out.println(bigger);

	}

}
