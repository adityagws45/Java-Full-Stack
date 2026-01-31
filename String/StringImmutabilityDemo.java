package com.string;

public class StringImmutabilityDemo {
	 public static void main(String[] args) {

	        String s1 = "Hello";
	        System.out.println("Before modification: " + s1);

	        s1 = s1 + " World";   // new object created
	        System.out.println("After modification: " + s1);

	        /*
	         OUTPUT:
	         Before modification: Hello
	         After modification: Hello World
	        */
	    }

}
