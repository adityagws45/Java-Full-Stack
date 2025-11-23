package com.conditions;

public class largestNo {

	
	void accept(int a ,int b) {
		if(a<b) {
			System.out.println(" b is largest ");
		}else {
			System.out.println(" a is largest");
		}
	}
	
	
	public static void main(String args[]) {
		largestNo s= new largestNo();
		s.accept(3,4);
	}
}
