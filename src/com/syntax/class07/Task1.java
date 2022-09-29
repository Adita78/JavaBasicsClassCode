package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		
		// print numbers from 50 to 20
		int num=50;
		 while (num>=20) {
			 System.out.print(num +" ");
			 num--;
		 }
		 
		 // print all even numbers from 1 to 20
		int c=2;
		while (c<=20) {
			System.out.print(c+ " ");
			c+=2;
		}
		 System.out.println("Anather way");
		 
		 int i=1;
		 while (i<=20) {
			 if (i%2==0) {
				 System.out.print(i +" ");
				  } i++;
		 }
	}

}
