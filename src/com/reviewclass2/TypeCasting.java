package com.reviewclass2;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
short largerBox=129; //as we can t fit 129 in byte we will wrong results
byte smallerBox=(byte)largerBox;
System.out.println(smallerBox);


int largerBox1=129;  //as we can fit 129 in short we will get proper results
short smallerBox2=(short)largerBox1;
System.out.println(smallerBox2);


//Implicit/widening/Automatic
short smallerbox3=45;
long largerBox3=smallerbox3;
System.out.println(largerBox3);
	}

}
