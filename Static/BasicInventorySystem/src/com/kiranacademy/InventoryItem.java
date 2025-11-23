//static task 2 inventory

//Problem Statement: 
//Create a Java program that simulates a basic inventory system for a store using a `static` variable to 
//keep track of the total number of items in stock. 
//Requirements: 
//1. Create a class named "InventoryItem." 
//2. Inside the "InventoryItem" class, define the following attributes and methods: - A `static` variable named "totalItems" to keep track of the total number of items in stock. - An instance variable named "itemName" to store the name of the item. - An instance variable named "quantity" to store the quantity of the item in stock. - A constructor that initializes the item's name and quantity when an object is created. - A `static` method named "getTotalItems" that returns the total number of items in stock. - A method named "addToInventory" that takes an integer as a parameter and adds it to the item's 
//quantity while also incrementing the "totalItems" variable. - A method named "removeFromInventory" that takes an integer as a parameter and subtracts it 
//from the item's quantity while also decrementing the "totalItems" variable. 
//3. In the "Main" class, create instances of the "InventoryItem" class and perform the following 
//operations: - Create multiple inventory items. - Add items to the inventory and update the total items in stock. - Remove items from the inventory and update the total items in stock. - Display the total number of items in stock using the `getTotalItems` method. 
//Ensure that your Java program effectively demonstrates the use of the `static` variable to keep track 
//of the total number of items in stock and allows for adding and removing items from the 
//inventory.ults. 


package com.kiranacademy;

public class InventoryItem {
	
	
   static int totalitems;
   
   String itemName;
   
   int  quanity;

public InventoryItem(String itemName, int quanity) {
	super();
	this.itemName = itemName;
	this.quanity = quanity;
	//updating total items
	InventoryItem.totalitems =InventoryItem.totalitems+ quanity;
	
	
}
   
   //static method to get total items;
static  int getTotalItems() {
	return totalitems;
}
   
   //add items
void addToInventory(int qty ) {
	this.quanity = this.quanity + qty;
	InventoryItem.totalitems=InventoryItem.totalitems+qty;
}
	

void removeFromInventory(int qty) {
	this.quanity = this.quanity - qty;
	InventoryItem.totalitems=InventoryItem.totalitems-qty;
}



void displayInventoryItemInfo() {
	
	System.out.println("item name=" + this.itemName);
	System.out.println("quanity=" + this.quanity);
	System.out.println("total items=" + InventoryItem.totalitems);
	System.out.println("*************************");
}

public static void main(String args[]) {
	 InventoryItem t1 = new InventoryItem("mobile", 100);
	 InventoryItem t2 = new InventoryItem("ipad", 300);
	 

		t1.displayInventoryItemInfo();
		t1.addToInventory(5);

		t1.displayInventoryItemInfo();
		t2.removeFromInventory(8);
		t2.displayInventoryItemInfo();
}
	

}
