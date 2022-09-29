package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name = "Adrian";
		String LastName = "Captari";
		char grade = 'A';
		String City = "Staten Island";
		String State = "NY";
		String PhoneNumber = "315 450 9445";
		
	System.out.println("My name is " + Name + LastName);
	System.out.println("I am a "+ grade +" student");
	System.out.println("I live in " + City + State);
	System.out.println("And my phone number is " + PhoneNumber);
	
	//reassigning
	
	grade = 'B';
	City = "Chisinau";
	PhoneNumber = "315 000 00000";
	
	
	System.out.println("My name is " + Name + " and my last name is " +LastName);
	System.out.println("I am a "+ grade +" student");
	System.out.println("I live in " + City + State);
	System.out.println("And my phone number is " + PhoneNumber);
	
	
		
	}

}
