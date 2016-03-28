package com.action.examples;

public class Reverse {

	public static void main(String[] args) {

		System.out.println(new Reverse().doReverse(5425));
	}

	public int doReverse(int number) {
		int reverseNumber = 0;
		int count = 0;
		while (number != 0) {
			int quocient = number / 10;
			int remainder = number % 10;
			number = quocient;
			reverseNumber =reverseNumber*10 + remainder;
		}

		return reverseNumber;
	}
}
