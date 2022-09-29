package com.syntax.home.work;

import java.util.Scanner;

public class MortgageRateAndMorgagePrice {

	public static void main(String[] args) {
		
		Scanner xxx=new Scanner (System.in);
System.out.println("Enter your mortgage rate");
double mortgageRate=xxx.nextDouble();
if (mortgageRate>4.5) {
System.out.println("Rate is too high it s not a right time to buy a house");	
}
else
{System.out.println("Rate is Ok you may buy a house");
System.out.println("Please enter price of the house");
double housePrice=xxx.nextDouble();
if (housePrice>200000) {
	System.out.println("Let s take a loan");
}
else {
	System.out.println("Let s pay cash");
}
}


}
}