package com.syntax.home.work;

import java.util.Scanner;

public class SalaryBonus {

	public static void main(String[] args) {
		/*Write a program to ask user to enter numbers of worked years and annual salary. If user 
		 * worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is 
		 * not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise
		 * bonus=3000.
		 */ 
Scanner scanner=new Scanner(System.in);
System.out.println("How many years did you work?");
int year=scanner.nextInt();

if (year>=5)
{
     
	System.out.println("What is your salary?");
	int salary=scanner.nextInt();
	if (salary>50000)
	{
	System.out.println("Your bonus is 5000");
	}
    else 
	{
		System.out.println("Your bonus is 3000");
	}

}
else 
		System.out.println("You are not eligible for a bonus");
	
}
}
