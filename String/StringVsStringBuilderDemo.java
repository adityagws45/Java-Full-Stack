package com.string;

public class StringVsStringBuilderDemo {
	 public static void main(String[] args) {

	        // Using String (creates new objects)
	        String s = "Java";
	        s = s + " Programming";
	        System.out.println("String: " + s);

	        // Using StringBuilder (modifies same object)
	        StringBuilder sb = new StringBuilder("Java");
	        sb.append(" Programming");
	        System.out.println("StringBuilder: " + sb);

	        /*
	         OUTPUT:
	         String: Java Programming
	         StringBuilder: Java Programming
	        */
	    }
}
