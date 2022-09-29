package com.reviewclass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);	
	System.out.println("Please enter the numbers of dresses you want to buy");
	int noOfDresses=scanner.nextInt();
	
	double[] prices=new double[noOfDresses];
	
	for(int i=0; i<noOfDresses;i++) {
		System.out.println("Please enter the price of dress no "+1);
		prices[i]=scanner.nextDouble();
	}
		
		System.out.println(Arrays.toString(prices));
		// Limitation of enhanced for loop we can only go in one direction
		//we can t skip the elements
		//we can t use enhanced for loop to update the elements in an array
		//we can only use it to access the elements
		double sum=0;
		for(double price:prices) {
			sum+=price; //sum=sum+price
		}
		System.out.println("Total for all the dresses = "+sum);
	}

}
