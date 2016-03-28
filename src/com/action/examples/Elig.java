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

		// System.out.println("entered name" + " " + name);
		/*
		 * System.out.println("enter your age:"); age = in.nextInt();
		 * System.out.println("entered age" + " " + age); if (age < 0) {
		 * System.out.println("enter valid age"); age = in.nextInt();
		 * //ageVerify(); return; } else if (age > 0) { System.out.println(
		 * "Age verified"); System.out.println("eligibilities below:");
		 * //ageVerify(); } else if(age == 0){ System.out.println("newly born");
		 * //ageVerify(); }
		 * 
		 * }
		 * 
		 * public void ageVerify() {
		 * 
		 * if (age <= 16 || age < 18) { System.out.println(
		 * "You are not eligible"); System.out.println(
		 * "you are not eligible to vote"); System.out.println(
		 * "you are not eligible for rent a car"); } else if (age < 18) {
		 * System.out.println("you are eligible to vote"); } else if (age < 25)
		 * { System.out.println("you are not eligible for rent a car"); }
		 */

	}
}
