package com.kiranacademy;

public class TemperatureClassifier {

	
	void classifyTemperature (double temperature ) {
		
		if(temperature<0) {
			System.out.println("Classification is Freezing");
		}
		else if(temperature >=0 && temperature<=10) {
			System.out.println("Classfication is Cold");
		}else if(temperature >=11 && temperature<=20) {
			System.out.println("Classfication is Cool");
		}else if(temperature >=21 && temperature<=30) {
			System.out.println("Classification is Warm");
		}else {
			System.out.println("Classfication is Hot");
		}
	}
	
	public static void main(String args[]) {
		 TemperatureClassifier T = new  TemperatureClassifier ();
		 T.classifyTemperature(31);
	}
	
	
	
}
