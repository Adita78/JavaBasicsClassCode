package com.syntax.home.work;

import java.util.Scanner;

public class Repl76var2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		   String[] arr=new String[7];
		   System.out.println("Input Days of a week beginning with Sunday");

		   for(int i=0;i<7;i++){
		    arr[i]=input.nextLine();}
		   for(String day:arr){
		     System.out.println(day);
		   }
}
}
