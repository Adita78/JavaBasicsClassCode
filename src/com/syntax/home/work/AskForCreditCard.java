package com.syntax.home.work;

import java.util.Scanner;

public class AskForCreditCard {
/*Create a Java program that will ask if user has a credit card or 
 * not. If you user does not have a credit card then offer them. “? If 
 * balance of the card is larger than 1000, tell them to pay off 
 * immediately, otherwise you can tell them that they can spend 
 * more.
 */
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 
System.out.println("Do you have a credit card? PLease answer true or false");
boolean creditCard=scanner.nextBoolean();
if (creditCard){
{
	System.out.println("What is your balance?");
}
    double balance = scanner.nextDouble();
   
    if (balance>1000) {
	System.out.println("Pay it immediatly");
}
	else {
		System.out.println("You can spend more");	
	}	}
	
else {
System.out.println("Do you waant to apply for a credit card?");
}
}

	

 
}
	

