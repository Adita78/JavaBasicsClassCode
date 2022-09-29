package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		 int time=10;
		 if (time<12) {
			 System.out.println("Good mornning inside if statement");
		 }
		 while (time<12) {
			 System.out.println("Good morning inside while loop"); //infinite loop
			 time++; //Loop stop
		 }
		
		
	}

}
