package com.syntax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {
		// 
int time=8;
String day="Monday";
//Outer if-condition
if(day.equals("Monday")) {
	// inner if-condition
	if (time>7) {
		System.out.println("Lets go to office");
	}
	if (time<6) {
		System.out.println("Lets sleep more");
	}
}
	
	}

}
