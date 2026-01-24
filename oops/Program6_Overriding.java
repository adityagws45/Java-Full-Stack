package com.oop;

class Vehicle {
	void start() {
		System.out.println("Vehicle is starting");
	}
}

class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Bike starts with self-start");
	}
}

public class Program6_Overriding {
	public static void main(String[] args) {
		Vehicle v = new Bike(); // runtime polymorphism
		v.start();
	}
}
