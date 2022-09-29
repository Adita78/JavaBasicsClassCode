package com.syntax.class12;

public class StringDemo06 {

	public static void main(String[] args) {
		 
		String str="I love java programming";
		
		System.out.println(str.charAt(0));
		
		for(int i=0; i<str.length(); i++) {
			// print only the character not spaces
			if (!(str.charAt(i)== ' ')) {
			
			System.out.print(str.charAt(i));
			
		}

	}

}
}