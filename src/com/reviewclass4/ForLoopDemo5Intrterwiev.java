package com.reviewclass4;

import java.util.Scanner;

public class ForLoopDemo5Intrterwiev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("   *   ");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("*******");
		 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=scanner.nextInt();
		while (i!=10) {
			System.out.println(i);
			i=scanner.nextInt();
		}
		for (int k=0; i!=10; k++) {}
		System.out.println("i");
		i=scanner.nextInt();
	}

}
