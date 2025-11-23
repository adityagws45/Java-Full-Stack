package com.conditions;

public class SumEvenOdd {

	
	void accept (int a,int b) {
		
		
			int sum=a+b;

			System.out.println("sum="+ sum);
			
			if(sum %2 ==0) {
				   System.out.println("sum is even ");
			}else {
				System.out.println("sum is odd");
			}
	}
		  
	public static void main(String args[]) {
		
		SumEvenOdd s =  new SumEvenOdd();
		s.accept(4, 61);
	}
}
