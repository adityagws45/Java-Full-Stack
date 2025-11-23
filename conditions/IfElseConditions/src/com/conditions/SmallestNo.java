package com.conditions;

public class SmallestNo {

	
	void accept(int a ,int b) {
		if(a<b) {
			System.out.println("a is smallest ");
		}else {
			System.out.println("b is smallest");
		}
	}
	
	
	public static void main(String args[]) {
		SmallestNo s = new SmallestNo();
		s.accept(3,4);
	}
}
