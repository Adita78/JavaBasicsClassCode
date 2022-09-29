package com.syntax.class02;

public class HomeWorkClass2 {

	public static void main(String[] args) {
		// Homework
		
		//Multiplication, Addition, Subtraction, Division.   
     	double num1=78.78;
		double num2=77.777;
		
		double sum=num1+num2;
		double difference=num1-num2;
		double multiplication=num1*num2;
		double division=num1/num2;
		double remainder=num1%num2;
		
		//Square of the number 3.9
		double a1 = 3.9;
		double a1square=a1*a1;
		
		//Area and Perimiter of a rectangle
		int w=5;
		int h=8;
		int perimiter=(w+h)*2;
		int area=w*h;
		
		
		
System.out.println("The Addition of 2 numbers "+num1+" and "+num2+" is equal to "+sum );
System.out.println("The Subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+difference);		
System.out.println("The Multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+multiplication);
System.out.println("The Division of 2 numbers "+num1+" and "+num2+" is equal to "+division);
System.out.println("The Remainder of 2 numbers "+num1+" and "+num2+"is equal to "+remainder );
System.out.println("The square of the "+a1+" is "+a1square);
System.out.println("The perimiter of a rectangle with width "+w+" and height "+h+"is equal to "+perimiter+" and the area is "+area);


		
	}

}
