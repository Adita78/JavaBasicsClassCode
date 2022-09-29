package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		 
		for (int i=1; i<4; i++) {
			for (int j=0; j<=0; j++) {
				System.out.println("hello");
				break;
			}
			System.out.println("bye");
		}
		
		boolean day=true;
		for (int i=1; i<=3; i++) {       // infinite condition
			while (day) {                // while day is true
				System.out.println("Good day");    // infinite output
			}
		}
		
		
	}	
}