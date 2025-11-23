//static task 1   
//Problem Statement: 
//Create a Java program that simulates a stock price tracker using a static variable to keep track 
//of the total number of stocks being tracked. 
//Requirements: 
//1. Create a Class: 
//o Name the class Stock. 
//2. Define the following attributes and methods inside the Stock class: 
//o A static variable named totalStocks to track the total number of stocks being 
//tracked. 
//o An instance variable tickerSymbol to store the stock's ticker symbol. 
//o An instance variable currentPrice to store the stock's current price. 
//o A constructor to initialize the stock's ticker symbol and price when a stock is 
//created. The totalStocks variable should increment each time a stock is created. 
//o A static method getTotalStocks that returns the total number of stocks being 
//tracked. 
//o A method updatePrice to update the current price of the stock. 
//o A method displayStockInfo to print the stock's details (tickerSymbol and 
//currentPrice). 
//3. In the Main Class: 
//o Create multiple instances of the Stock class representing different stocks. 
//o Update stock prices using the updatePrice method. 
//o Display details of all the stocks using the displayStockInfo method. 
//o Display the total number of stocks being tracked using the getTotalStocks 
//method. 
//Acceptance Criteria: 
//• The static variable totalStocks should accurately reflect the total number of stocks 
//created. 
//• Stock prices should be updated and displayed correctly. 
//• The Main class should demonstrate the functionality clearly. 









package com.downstock;

public class Stock {

	static int totalStocks;
	
	String tickerSymbol;//global=instance variable
	
	double currentPrice;//price is always double
   
	static int totalUnitOfStock; //why static 
	
	public Stock(String tickerSymbol, double currentPrice,  int totalUnitOfStock) {
		
		this.tickerSymbol = tickerSymbol;
		this.currentPrice = currentPrice;
		Stock.totalUnitOfStock = totalUnitOfStock;
//		this.totalStocks++;
		Stock.totalStocks++;
		//stock create hona means object banna
		//yello line means static so use static
	}
	
	
	static  int  getTotalStocks() {
		return totalStocks;
	}
	
	
	void updatePrice(double price) {
		System.out.println("**********************");
		System.out.println("Price get updated by" + price+ " "+ this.tickerSymbol);
		this.currentPrice = this.currentPrice + price;
		System.out.println("**********************");
		
	}
	
	
	void tradeUnit(String companyName , int numberOfUnit) {
		System.out.println("*************************");
		System.out.println("***************Trade unit of stcok=" + numberOfUnit);
		Stock.totalUnitOfStock = Stock.totalUnitOfStock + numberOfUnit;
		System.out.println("Price Need to pay"+ this.currentPrice * numberOfUnit);
		System.out.println("*******************");
		
		
	}
	void displayStockInfo() {
//		System.out.println(this.tickerSymbol + " " + this.currentPrice + " " +Stock.totalUnitOfStock);
	System.out.println("********Stock Info***********");
	System.out.println("Company Name =" + this.tickerSymbol);
	System.out.println("Current price = " + this.currentPrice);
	System.out.println("Total unit =" + Stock.totalUnitOfStock);
	System.out.println("*****************************");
		
		
	}
	
	public static void main(String[] args) {
		Stock s = new Stock("Infy", 567,5000);

		s.displayStockInfo();
		s.tradeUnit("Infy", 3000);
		s.displayStockInfo();
	}
	
	
	
}
