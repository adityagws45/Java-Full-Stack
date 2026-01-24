package com.oop;

class Student2 {
	int id;
	String name;

	Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}
}

public class Program2_Constructor {
	public static void main(String[] args) {
		Student2 s = new Student2(101, "Mohan");
		s.display();
	}
}
