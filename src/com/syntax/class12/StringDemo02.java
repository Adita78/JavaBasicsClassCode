package com.syntax.class12;

public class StringDemo02 {

	public static void main(String[] args) {
		
		String FirstName="Olena";
		String lastname="Dudka";
		
		System.out.println(FirstName+" "+lastname); // Mostly this is used
		
		System.out.println(FirstName.concat(lastname));

	String str="";
	
	/*
	 * idEmpty() returns if a String is empty this method will return false if you have
	 * a space in a String variable however the isBlank method does not count the spaces
	 */
	System.out.println(str.isEmpty());
	//System.out.println(str.isBlank()); its not working on java 8 
	}

}
