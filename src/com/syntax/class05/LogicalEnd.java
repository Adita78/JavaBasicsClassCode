package com.syntax.class05;

public class LogicalEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean understandJava=true;
		boolean enjoyJava=true;
		boolean practice=true;
		
	if(practice && understandJava && enjoyJava) {
			System.out.println("This is awesome");
		}
	
	System.out.println(" Another example");
	int n1=100;
	int n2=200;
	int n3=300;
	
	if (n1>n2&&n1>n3) {
		System.out.println(n1 +"n1 is the largest");
	}else if (n2>n3 && n2>n1) {
		System.out.println(n2+ "is the largest");
	}
	else if (n3>n1 && n3>2) {
		System.out.println(n3+" is the largest");
	}
	}
	
	
	}
	


