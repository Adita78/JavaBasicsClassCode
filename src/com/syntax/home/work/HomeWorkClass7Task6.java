package com.syntax.home.work;

import java.util.Scanner;

public class HomeWorkClass7Task6 {

	public static void main(String[] args) {
		/*Declare a variable to store a price for a 
		 * coffee. Ask the user to pay for a coffee.
		 * Keep asking to pay for coffee until the user 
		 * enters the EXACT amount . If the user 
		 * gives more than coffee price --> ask them
		 * to give less, if the user gives less money
		 * then ask to give more. Once user give
		 * EXACT amount print “Please enjoy your coffee 
		 */ 
		Scanner input=new Scanner(System.in);
		double price=2.25;
		double moneyGiven;
do {
	System.out.println("Please pay for your coffe");
	moneyGiven=input.nextDouble();
	if (moneyGiven<price) {
		System.out.println("You gave me less, can you give me the exact amount");
	} else if (moneyGiven>price) {
		System.out.println("You gave me more, can you give me the exact amount");
	}	
	}while (moneyGiven!=price);
	System.out.println("Please enjoy your coffee");
	
	/*If the amount entered (they called the variable user here)
	*does not equal =! keep asking for correct change
	*
   */
}
		
		
	}


