package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// matching cases must of same data types as a variable
		//no duplicate cases in switch

		char choice='Y';
		String answer;
		switch (choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
		break;
		default:
			answer="Unknown";
			break;
		
		}
		System.out.println(answer);
		
		//Limitation of the switch case:
		//switch case can not use logical operators
		//switch case can not use relational operators
		
		/*
		 * cannot work with boolean values
		 * cannot work with float/double and long
		 */
	}

}
