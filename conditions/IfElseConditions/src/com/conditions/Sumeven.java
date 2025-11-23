package com.conditions;

public class Sumeven {

	
	void accept (int a,int b) {
		
		if(a%2==0 && b%2 ==0) {
			int sum=a+b;
			System.out.println("num is even");
			System.out.println("sum="+ sum);
		}else {
			System.out.println("Both numbers are not even");
		}
	}
	
	public static void main(String args[]) {
		
		Sumeven s =  new Sumeven();
		s.accept(4, 60);
	}
}
