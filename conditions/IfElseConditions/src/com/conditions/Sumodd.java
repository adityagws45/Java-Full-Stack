package com.conditions;

public class Sumodd {
	
	void accept (int a,int b) {
		
		if(a%2!=0 && b%2 !=0) {
			int sum=a+b;
			System.out.println("num is odd");
			System.out.println("sum="+ sum);
		}else {
			System.out.println("Both numbers are even");
		}
	}
	
	public static void main(String args[]) {
		
		Sumodd s =  new Sumodd();
		s.accept(3, 5);
	}
}

