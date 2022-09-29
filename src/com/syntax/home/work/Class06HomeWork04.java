package com.syntax.home.work;

import java.util.Scanner;

public class Class06HomeWork04 {

	public static void main(String[] args) {
		/*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on 
		 * operator provide the result to user.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */
Scanner input=new Scanner(System.in);
System.out.println("Please enter two numbers and operator");
System.out.println("Please enetr first number");
double num1=input.nextDouble();
System.out.println("Please enetr second number");
double num2=input.nextDouble();
System.out.println("Please enter operator");
char operator=input.next().charAt(0);

double result=0;

switch (operator) {
case '/':
	result=num1/num2;
	break;
case'*':
	result=num1*num2;
	break;
case'-':
	result=num1-num2;
	break;
case '+':
	result=num1+num2;
	break;
	default:
	System.out.println("Plese enter valid operator");
	break;
}
System.out.println(result);
	}

}
