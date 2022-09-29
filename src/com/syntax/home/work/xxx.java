package com.syntax.home.work;

import java.util.Scanner;

public class xxx {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        {System.out.println("Please enter your gender: M or F");}
       String gen=scan.next();
      {System.out.println("Please enter your age");}
        int age=scan.nextInt();
        if (age>25){
        if (gen.equals("F")) {System.out.println("Woman");}
          else {System.out.println("Man");}}
else{
        if (gen.equals("F")) {System.out.println("Girl");}
  else {System.out.println("Boy");}
}
    }
}