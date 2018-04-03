package com.skilldistillery.datatypes.labs;

import java.util.Scanner;

public class BitPrinterDriver {
	static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		BitPrinter bp = new BitPrinter();

		while (true) {
			String input = getUserData();
			if ("QUITS".equals(input)) {
				break;
			}
			String bits = bp.getDataAsBits(input);
			System.out.println(input + " in bits is " + bits);

		}
		System.out.println("You have exited");
		scanner.close();

	}

	public static String getUserData() {
		System.out.print("Please enter an int, char, or double. \"QUIT\" to quit: ");
		String input = scanner.next();
		return input;

	}

}
