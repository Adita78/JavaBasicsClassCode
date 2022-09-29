package com.syntax.home.work;

import java.util.Scanner;

public class DmvRepresentative {

	public static void main(String[] args) {
		
	Scanner dmv = new Scanner(System.in);	
  System.out.println("PLease enter your age");
  int ageHowMany=dmv.nextInt();
  if (ageHowMany>18) {
	  System.out.println("You can apply for Driver Licence");
  }
  else {
	  System.out.println("You can apply for Learning Permit");
  }
	}

}
