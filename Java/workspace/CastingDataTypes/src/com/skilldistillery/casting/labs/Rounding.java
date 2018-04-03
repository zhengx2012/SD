package com.skilldistillery.casting.labs;

import java.util.Scanner;

public class Rounding {
	static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);

		System.out.print("Please enter a floating point number: ");
		double userNum = kb.nextDouble();
		double holder = 0;
		holder = userNum;
		int wholeNum = (int) userNum;

		if (wholeNum > (holder + 0.5)) {
			System.out.println(wholeNum);
		} else {
			System.out.println(wholeNum + 1);
		}
	}

}
