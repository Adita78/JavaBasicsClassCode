package com.syntax.class11;

public class Phone {

String make;
String model;
String color;
int storage;
double size;
boolean cheap;


void call(){
	System.out.println("calling............");
}
	void takePicture() {
		System.out.println("taking pictures.....");
	}
	
	public static void main(String[] args) {
	//Name of class variable name=new Name of class();
		
		Phone iPhone=new Phone();
		iPhone.make="Apple";
		iPhone.model="Iphone14";
		iPhone.color="Black";
		iPhone.storage=128;
		iPhone.size=6.8;
		iPhone.cheap=false;
		
		System.out.println("Make " +iPhone.make+ " Model "+iPhone.model );
		iPhone.call();
		
		
		System.out.println("************************");
		
		
		Phone samsungPhone=new Phone();
		samsungPhone.make="Samsung";
		samsungPhone.model="S22 Ultra";
		samsungPhone.color="Grey";
		samsungPhone.storage=128;
		samsungPhone.size=12.5;
		samsungPhone.cheap=false;
		
		System.out.println(iPhone.make);
		System.out.println(samsungPhone.make);
		
		
	}
}
