package com.skilldistillery.casting.labs;

import java.util.Scanner;

public class Ceiling {
	static Scanner kb;
	public static void main(String[] args) {
		kb = new Scanner(System.in);
		
		System.out.print("Please enter a floating point number: ");
		double userNum = kb.nextDouble();
		
		int wNum = (int) (userNum + 1);
		
		System.out.println(wNum);
		
	}

}
