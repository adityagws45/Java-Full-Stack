package com.kiranacademy;

public class GradeCalculator {

	void calculateGrade(int score) {
		
		if(score>=90) {
			System.out.println("grade is A");
		}else if (score >=80 && score <=89) {
			System.out.println("grade is B");
		}else if(score >=70 && score <=79) {
			System.out.println("grade is C");
		}else if(score >=60 && score <=69) {
			System.out.println("grade is D");
		}
		else  {
		System.out.println("grade is F");
		}
	}
	
	public static void main(String args[]) {
		GradeCalculator G = new GradeCalculator();
			G.calculateGrade(78);
		
		
	}
	
}
