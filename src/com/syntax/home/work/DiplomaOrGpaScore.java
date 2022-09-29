package com.syntax.home.work;

import java.util.Scanner;

public class DiplomaOrGpaScore {

	public static void main(String[] args) {
		 
Scanner xxx = new Scanner(System.in);
	System.out.println("Do you have a diploma? True or False?"); 
	
boolean haveDiploma=xxx.nextBoolean();
if (haveDiploma){
	System.out.println("Congratulation!");
	System.out.println("What is your GPA score?");
	
	double gpaScore=xxx.nextDouble();

	if (gpaScore>=3.5) {
	System.out.println("You are eligible for scholarship");
}
	 else {
	System.out.println("You should have studied harder");
}}
	 else  {
		System.out.println("Get a Dwgree");
	}
}
	
}