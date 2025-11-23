package com.kiranacademy;

public class NumberClassifier {
	

	void classifyNumber(int number) {
		if(number>0) {
			System.out.println("output should be positive");
		}else if(number<0) {
			System.out.println("output should be Negative");
		}else {
			System.out.println("output should be zero");
		}
	}
	
	public static void main(String args[]) {
		NumberClassifier  T = new NumberClassifier();
		T.classifyNumber(3);
	}
	
}
