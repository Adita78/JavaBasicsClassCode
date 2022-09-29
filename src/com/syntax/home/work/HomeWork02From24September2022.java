package com.syntax.home.work;

import java.util.Scanner;

public class HomeWork02From24September2022 {

	public static void main(String[] args) {
		
		
/*Write a program that reads two people's first
*names and if they expecting boy or girl? 
*Based on the input suggests a name for a baby:
*Example Output:
*Mom’s first name? Mary
*Dad’s first name? Daniel
*Boy or Girl? boy
*Suggested baby name: DANRY
**/

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the Mom name");
		String momName=input.nextLine();
		System.out.println("Please enetr the Dad name");
		String dadName=input.nextLine();
		System.out.println("Please enter the gender of the baby");
		String babyGender=input.nextLine();
		
		if (babyGender.equals("boy")) {
		System.out.println(dadName.substring(0,(dadName.length()/2))+momName.substring(momName.length()/2));	
		
		} else if (babyGender.equals("girl")) {
			System.out.println(momName.substring(0,(momName.length()/2))+dadName.substring(dadName.length()/2));
		}
		
	}

}
