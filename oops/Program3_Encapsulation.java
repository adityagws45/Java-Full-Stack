package com.oop;

class BankAccount {
	private double balance = 5000;

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
}

public class Program3_Encapsulation {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		System.out.println("Balance: " + b.getBalance());
		b.deposit(1000);
		System.out.println("After deposit: " + b.getBalance());
	}
}
