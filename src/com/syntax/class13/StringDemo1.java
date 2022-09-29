package com.syntax.class13;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		String str="Today is Sunday";
String day=str.substring(1,3); //+1 not 1-2 but 1-3
System.out.println(day);


char c=str.charAt(4); //calling the method charAt an str object
System.out.println(str.charAt(4));

char[] charArr=str.toCharArray();
System.out.println(Arrays.toString(charArr));
//System.out.println( charArr); //converting to a string

int index=str.indexOf("a",6); // 6 is the starting point
System.out.println(index);

	}

}
