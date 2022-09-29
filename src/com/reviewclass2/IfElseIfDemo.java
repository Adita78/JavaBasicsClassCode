package com.reviewclass2;

public class IfElseIfDemo {

	public static void main(String[] args) {
		 
		/* if we need one outcome based on if condition we use
		 * if the outcomes are two we use if else if outcomes are more than
		 * that we can use if else if
		 * whenever you have to check more then two conditions always use if else conditions
		 */
		
		int number = 0;

        if (number > 0) {
            System.out.println("number is positive");
        }
        if (number < 0) {
            System.out.println("number is negative");

        }
        if (number == 0) {
            System.out.println("number is 0");

        }
//***************************************Second Program*******************************

        if (number > 0) 
        {
            System.out.println("number is positive");
        } 
        else if (number < 0) 
        {
            System.out.println("number is negative");

        }
        else  {
            System.out.println("number is 0");
        }
	}}