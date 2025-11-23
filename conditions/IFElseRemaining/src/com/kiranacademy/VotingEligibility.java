package com.kiranacademy;

public class VotingEligibility {

	
	
	void checkEligibility  (int age) {
	
	if(age>18) {
		System.out.println("person is eligible for vote");
	}else {
		System.out.println("Person is not eligible for vote");
	}
	}
	
	
	public static void main(String args[]) {
		
		VotingEligibility e = new VotingEligibility();
		e.checkEligibility(4);
		e.checkEligibility(19);
	}
}
