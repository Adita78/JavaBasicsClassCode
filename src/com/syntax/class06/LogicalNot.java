package com.syntax.class06;

public class LogicalNot {

	public static void main(String[] args) {
		//  
boolean boo=!true;
System.out.println(boo); 

    boolean boo1=!false; // false
	System.out.println(boo1); // true
	
	boolean rain=false;
	if (!rain) {
		System.out.println("I will go for a walk");
	}
	
	String day="Monday";
	if (!day.equals("Sunday")) {
		System.out.println("Today is not Sunday");
	}
	
	System.out.println("________________________________");
	
	boolean checkboxSelected=true;
	if(!checkboxSelected) {
		System.out.println("I will click and select it");
	}
	
	System.out.println("End of the program");
	}

}
