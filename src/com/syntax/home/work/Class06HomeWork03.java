package com.syntax.home.work;

import java.util.Scanner;

public class Class06HomeWork03 {

	public static void main(String[] args) {
		/*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on
		 * operator provide the result to user.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */
Scanner input=new Scanner(System.in);
System.out.println("Please enter two numbers and operator: / or * or - or +");
System.out.println("Enter your first number");
double num1=input.nextDouble(); 
System.out.println("Enter your second number");
double num2=input.nextDouble();
System.out.println("Enter your operator");
char operator=input.next().charAt(0);

if (operator=='/') {
	System.out.println(num1/num2);
}
else if (operator=='*') {
	System.out.println(num1*num2);
} else if (operator=='-') {
	System.out.println(num1-num2);
} else if (operator=='+') {
	System.out.println(num1+num2);
}else {
	System.out.println("Plese enter valid operator");
}
	
	}

}
