package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
	 
		Scanner scanner=new Scanner(System.in);
		
        System.out.println("Please Enter your name");
        //takes a String type input from the keyboard and store in name variables
		String name=scanner.nextLine();
		System.out.println("Please Enter you age");
		//takes a int type input from the keyboard and store in name variables
		int age=scanner.nextInt();
		System.out.println("Hi "+name+" you are "+age+" years old"); 
	}

}
