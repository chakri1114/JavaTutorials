package com.action.examples;

public class PyramidTest {

	public static void main(String[] args) {
		PyramidTest t = new PyramidTest();
		t.numberTest();

	}

	public void numberTest(){
		int count = 0; 
		for (int j =1;j<=6;j++){
			
			for(int i=1;i<=j;i++)
			{
			System.out.print(++count+" ");
			}
			System.out.println("");
		}
	}

}
