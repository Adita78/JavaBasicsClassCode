package com.syntax.home.work;

public class HomeWorkClass7Task4 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		
		for (int i=20; i>=2; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println("_____________________"); 
		
		for(int i=20; i>=1; i--) {
			if(i%2==0) {
				System.out.println(i+ " ");
			}
		}
	}

}
