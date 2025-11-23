package com.conditions;

public class EvenNo {

	
	void evenodd(int num) {
		if(num%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
	}
	
	public static void main(String args[]) {
		
		EvenNo  e = new EvenNo(); //object create 
		
		e.evenodd(2);//call method
	}
}
