package com.reviewclass2;

public class IfElseDemo {

	public static void main(String[] args) {
	
		String userName="Admin";
		String password="password123";
if(password.equals("password123")) // de studiat aici posibil cand folosim string
	
	/*
	 * When we have to check if a box contains a value or not
	 * we can us == or.equals()
	 * when the data type if primitive we use == like char int short etc
	 * when the datatypes are non-primitive like String we use .equals()
	 */
{
	System.out.println("Welcome " +userName);
}
else 
{
	System.out.println("Wrong password " +userName);
}

		
		
	}

}
