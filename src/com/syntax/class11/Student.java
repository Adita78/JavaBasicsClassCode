package com.syntax.class11;

public class Student {

String name;
String id;
int age;
double weight;
char gender;


void study(){
	System.out.println("Student is study........");
}

void deleteMesages() {
	System.out.println("Deleteng messages from Discord");
}
void eat() {
	System.out.println("Eating pizzaa");
}

public static void main(String[] args) {
	
	//new Student() -> Creates the object of Student class
	
	Student friadoonObject=new Student();
	friadoonObject.name="Friadoon" ;
	friadoonObject.id="123";
	friadoonObject.age=22;
	System.out.println(friadoonObject.name);
	System.out.println(friadoonObject.age);
	friadoonObject.deleteMesages();
	
	System.out.println("**********************");
	
	Student student2=new Student();
	student2.name="Asma";
	student2.age=16;
	student2.weight=30;
	student2.gender='F';
	
	System.out.println(student2.name);
	student2.eat();
	 
}

}
