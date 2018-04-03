package com.skilldistillery.casting.labs;

import java.util.Scanner;

public class Floor {
	static Scanner kb;

	public static void main(String[] args) {
		userInput();

	}

	public static void userInput() {
		kb = new Scanner(System.in);

		System.out.print("Please enter a floating point number: ");
		double userNum = kb.nextDouble();

		int wNum = (int) userNum;

		System.out.println(wNum);
	}

}
