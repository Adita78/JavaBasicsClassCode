package com.syntax.class09;

public class AllElementsFromArry {

	public static void main(String[] args) {
		 
	String[] iceCream= {"vanilla", "chocolate", "pistashio", "kulfi"};	
		
		//System.out.println(iceCream[0]);
		//System.out.println(iceCream[1]);
		
		//how to get all the values?

		 for(int i=0; i<iceCream.length; i++) {
			 System.out.println(iceCream[i]);
		 }
		 
		 System.out.println("___________________________");
		 
		 char[] letters={'A','B','C','D','E','F'};
		 
		 for (int i=0; i<letters.length; i++) {
			 System.out.print(letters[i]+ " ");
		 }
	}

}
