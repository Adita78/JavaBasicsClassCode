package com.syntax.home.work;

import java.util.Scanner;

public class Class06HomeWork02 {

	public static void main(String[] args) {
		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-
		 * Average, D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade
		 * was entered by a user with explanation.
		 */ 
Scanner input=new Scanner(System.in); 
System.out.println("Please enter your grade");
char grade=input.next().charAt(0);  
String result; 
switch (grade) {
case 'A':
	result="Excelent";
	break;
case 'B':
	result="Good";
	break;
case 'C':
	result="Average";
	break;
case 'D':
	result="Bad";
	break;
	default:
		result="Not Acceptable";
}
System.out.println(result);
	}

}
