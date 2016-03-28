package com.action.examples;

public class Sub_Class extends Super_Class {
	Sub_Class(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	int a = 30;
	static String name;
	//Sub_Class(){
		
	//}
	//Sub_Class(String name){
		//this.name = name;
	//}
	public void display(){
		System.out.println("I am from sub_class");
	}
	public void Test(){
		Sub_Class s1 = new Sub_Class(name);
		s1.display();
		super.display();
		System.out.println("Rajini"+s1.a);
		System.out.println("Gajini"+ super.a);
	}
public static void main(String[] args) {
	Sub_Class s2 = new Sub_Class(name);
	s2.Test();
}
}
