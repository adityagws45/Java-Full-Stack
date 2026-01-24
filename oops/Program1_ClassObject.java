package com.oop;

class Car {
	String name = "Swift";

	void start() {
		System.out.println(name + " is starting...");
	}
}

public class Program1_ClassObject {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
	}
}
