package com.syntax.class05;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/* Write a program for user to enter his/hers birth month. Based on the month define the 
		 * season.
		 * Example: if user is born in March, April, May → season =”Spring” 
		 * if user is born in June, July, August →
		 * season =”Summer”  etc …
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birth month 1-12");
        int month=scan.nextInt();
if (month==3 || month==4 || month==5) {
	System.out.println("Spring");
} else if (month==6 || month==7 || month==8) {
	System.out.println("Summer");
}
else if (month==9 || month==10 || month==11) {
	System.out.println("Fall");
} 
else if (month==12 || month==1 || month==2) {
	System.out.println("Winter");
}
else {
	System.out.println("Please enter valid month");
}
	}

}
