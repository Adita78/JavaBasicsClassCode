package com.syntax.home.work;

import java.util.Scanner;

public class ConvertFarenheitIntoCelsius {

	public static void main(String[] args) {
		 Scanner convert=new Scanner(System.in);
System.out.println("What is you City");
String city=convert.nextLine();

System.out.println("What temperature in Farenheit you have now?");
double tempF=convert.nextDouble();
double tempC=(tempF-32)/1.8;
System.out.println("The temperature in the "+city+" is " +tempC);

	}

}
