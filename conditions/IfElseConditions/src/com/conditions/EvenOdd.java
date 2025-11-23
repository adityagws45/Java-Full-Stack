package com.conditions;

public class EvenOdd {

	
	void evenodd(int num) {
		if(num%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
	}
	
	public static void main(String args[]) {
		
		EvenNo  e = new EvenNo(); //object create 
		
		e.evenodd(3);//call method
	}
}
