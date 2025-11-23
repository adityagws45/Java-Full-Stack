package com.conditions;

public class OddNo {

	
	void odd(int num) {
		if(num%2 !=0) {
			System.out.println("number is odd");
		}else {
			System.out.println("number is even");
		}
	}
	
	public static void main(String args[]) {
		
		OddNo e = new OddNo(); //object create
		
		e.odd(6);//call method
	}
}
