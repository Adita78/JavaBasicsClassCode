package com.syntax.home.work;

import java.util.Scanner;

public class HomeWorkClass7Task5 {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon +name...

		Scanner xxx=new Scanner(System.in);
		String name=null;
		 
		for (int i=1; i<=3; i++ ) {
			System.out.println("Please enter your name");
			name=xxx.nextLine();
		}
		System.out.println("Good afternoon " +name);
	}

}
