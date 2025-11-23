package com.kiranacademy;

public class TriangleType {

	
	void determineType(int a, int b, int c) {

        if(a == b && b == c) {
            System.out.println("Equilateral Triangle");
        }
        else if(a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }

    public static void main(String args[]) {

        TriangleType t = new TriangleType();  

        t.determineType(3, 3, 3);
	
	
    }
}
