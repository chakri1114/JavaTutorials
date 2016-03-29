package com.action.examples;

public class TestExample {

	public static void main(String[] args) {
		TestExample t = new TestExample();
		t.printNumbers();

	}

	public void printNumbers() {
		for (int i = 1; i <= 20; i++) {
			if (isOdd(i)) {
				System.out.println(i+ " this is odd number");
			} else {
				System.out.println(i);
			}

		}
	}

	private boolean isOdd(int i) {
		if (i % 2 != 0) {
			return true;
		}
		return false;
	}

}
