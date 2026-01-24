package com.oop;

// Abstraction
abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
}

// Interface
interface Payment {
	void pay();
}

class UPI implements Payment {
	@Override
	public void pay() {
		System.out.println("Payment done using UPI");
	}
}

public class Program7_AbstractionInterface {
	public static void main(String[] args) {

		Shape s = new Circle();
		s.draw();

		Payment p = new UPI();
		p.pay();
	}
}
