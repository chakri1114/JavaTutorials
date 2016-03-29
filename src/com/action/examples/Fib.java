package com.action.examples;

public class Fib {

	public static void main(String[] args) {
		fibnocciSeries(-3);

	}

	private static void fibnocciSeries(int value) {
		int x = 0;
		int y = 1;
		if (value < 0)
			return;
		if (value == 0) {
			System.out.println(0);
			return;
		}
		for (int i = 1; i <= value; i++) {
			if(i==1)
				System.out.println(x+"\n"+y);
			
			else{
				int z = x+y;
				x = y;
				y=z;
				System.out.println(z);
			}
			
			

		}
	}

}
