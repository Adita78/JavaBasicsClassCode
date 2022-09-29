package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
	
		 //if statement is condition based so its executes block of code based on true or false
int day=10;
if(day==1) {
	System.out.println("Monday");
}else if (day==2) {
	System.out.println("Tuesday");
}else if (day==3) {
	System.out.println("Wednesday");
}else if (day==4) {
	System.out.println("Thursday");
}else if (day==5) {
	System.out.println("Wednesday");
}else if (day==6) {
	System.out.println("Saturday");
}else if (day==7) {
	System.out.println("Sunday");
		
	}
System.out.println("________________________________________________");
String name;
switch (day) {  // switch case is value based it knows the value and jump to the matching case
case 1:
    name = "Monday";
    break;
case 2:
    name = "Tuesday";
    break;
case 3:
    name = "Wednesday";
    break;
case 4:
    name = "Thursday";
    break;
case 5:
    name = "Friday";
    break;
case 6:
    name = "Saturday";
    break;
case 7:
    name = "Sunday";
    break;
default:
    name = "Invalid";
    break;
}

System.out.println(name);
	}

}
