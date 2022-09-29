package com.syntax.home.work;

import java.util.Scanner;

public class ReplEx22 {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);		
System.out.println("Enter your name");
String name=scanner.nextLine(); 
System.out.println("Enter your mobile number");
String phoneNumber=scanner.nextLine(); 
System.out.println("Enter your age"); 
int age=scanner.nextInt();
    System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+phoneNumber);
	}

}
