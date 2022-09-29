package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * type casting = converting one value from one data type to another data type.
	 * 	
	 */
		byte box1=127; // smallest box 8 bits
		short box2=3333; // double the size of box1 in terms of bits 16 bits
		int box3=45454545;//32 bits most commonly used
		long box4=454545454;
		float box5=454545454;
		double box6=454545454;
		
		int number=(int)15.2; //we can t store the decimal number in a box of type 
		
		System.out.println(number);
		
		byte smallerBox=(byte)box2;
		
		System.out.println(smallerBox);
		
		short biggerBox=box1;
		
		long box7=box1;//we can do this because box7 is larger then box1
		
		float box8=(float)box6;//as box6 is larger it is double we need type casting to assign the value
		
		char a=(char)67;
		System.out.println(a);
		
		int box9=(int)box4;
		System.out.println(box9);
	}

}
