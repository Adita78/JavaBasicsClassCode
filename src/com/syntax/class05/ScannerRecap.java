package com.syntax.class05;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		int i = 10;
		String str = "Hello";

		Scanner input = new Scanner(System.in);// windows: CTRL+SHIFT+O; mac: CMD+SHIFT+O
		System.out.println("Please enter your name");
		
		String name=input.next();
		System.out.println(name);
		System.out.println("End");
// to capture different value we need different values
		int age=input.nextInt(); //capturing int
		System.out.println(name+" is "+age);
		
		System.out.println("How much money you have "+name);
		double money=input.nextDouble();
	}

}
