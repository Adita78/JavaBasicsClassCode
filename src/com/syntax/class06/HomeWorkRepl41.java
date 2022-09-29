package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkRepl41 {

	 public static void main(String[] args) {

		   Scanner input=new Scanner (System.in);
		   System.out.println("Enter the age of the Child");
		   int age=input.nextInt();
		   String answer;
		  
		   switch (age) {
		        case 1:
		         answer="Crawl";
		         break;
		       case 2:
		         answer="Talk";
		         break;
		       case 3:
		         answer="Dance";
		         break;
		       case 4:
		         answer="get Trouble";
		         break;
		     default:
		   answer="I don't know how old you are";

		    
		   }
		   System.out.println("You can "+answer);
		   
		 }
		}