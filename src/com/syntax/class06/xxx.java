package com.syntax.class06;

import java.util.Scanner;

public class xxx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		  int num1= scan .nextInt();
		  int num2=scan.nextInt();
		  int num3=scan.nextInt();

		  if(num1>=num2)
		  {
		   if(num1>=num3)
		   {

		      System.out.println("The largest number is " + num1);
		    }
		  }
		  else if(num2>=num1 )
		  {
		    if(num2>=num3)
		    {

		       System.out.println("The largest number is " + num2);
		    }
		   else{
		      System.out.println("The largest number is " + num3);
		    }
		  }

	}

}
