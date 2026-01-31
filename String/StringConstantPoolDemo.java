package com.string;

public class StringConstantPoolDemo {
	 public static void main(String[] args) {

	        String s1 = "Java";
	        String s2 = "Java";

	        System.out.println("s1 == s2 : " + (s1 == s2)); // true SCP

	        String s3 = new String("Java");
	        System.out.println("s1 == s3 : " + (s1 == s3)); // false heap

	        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true

	        /*
	         OUTPUT:
	         s1 == s2 : true
	         s1 == s3 : false
	         s1.equals(s3) : true
	        */
	    }
}
