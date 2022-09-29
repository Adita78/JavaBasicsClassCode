package com.syntax.class09;

public class ArrayFixesSize {

	public static void main(String[] args) {
		 
		int[]nums=new int[3];
		nums[1]=12;
		nums[2]=13;
	    System.out.println(nums[1]);
		
		
	    
	    String[] colors=new String[0];
		
		colors[0]="White";
		colors[1]="Pink";
		colors[2]="Black";
		//colors[0]="Yellow"; //error ArrayIndexOutofBoundsException: 3
		System.out.println(colors[3]);
		
		
	}

}
