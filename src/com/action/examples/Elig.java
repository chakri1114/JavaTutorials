package com.action.examples;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Elig {
	int age;
	String name;

	public static void main(String[] args) {
		Elig e = new Elig();
		e.inputFromUser();
	}

	public void inputFromUser() {
		Scanner in = new Scanner(System.in);

		System.out.println("enter ur name:");
		name = in.nextLine();
		if (name != null) {
			System.out.println(name);
		}
		
		if(Pattern.matches("[aA zZ]",name)){
			System.out.println(name);
		}
		System.out.println("hello world");

		

	}
}
