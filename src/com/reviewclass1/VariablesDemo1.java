package com.reviewclass1;

public class VariablesDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hi Batch 14");
/*
 * if we want to store whole number we can use below data types numbers 
 * without decimal parts like 10,23,4000,1000000 etc but we can t use them
 * to store decimal like 12.3 1.5 100.4 etc
 * byte
 * short
 * int
 * long
 * 
 * although above four data types can be used to store whole numbers but we
 * will be using int most of the time as it can handle up to billions and does not
 * waste a lot of space from RAM (Memory where computer store the programs wich are
 * opened and running currently)
 */

int box1=12;

/*int = data type
 * box1 = variable name
 * = assignment operator and used to store data in variable
 * 12 its the data that we want to store in box1
 * ; language rule we need to end the line with the semicolons
 */

int box2; //creating a box but not storing data right away in the box
box2=20;

System.out.println(box1);
System.out.println(box2);

	}

}
