package com.syntax.class10;

public class TwoDArrayDemo1 {

	public static void main(String[] args) {

String [][] countries= {
		{"USA", "Canada"}, // 1 array with index 0
		{"Peru","Brasil","Colobia","Ecuador"},
		{"Ethiopia","Egypt","Kenya"},
		{"Germany","Turkiye","Moldova","Ucraine"},
		{"Kazakhstan","Afganistan","Korea"},
		
}; 
		System.out.println(countries.length);//5 - total num of arrays or rows
		
		int elOf1arr= countries[0].length;
		System.out.println("num of elements from 1 array= "+elOf1arr);
		
		int elOf2arr=countries[1].length;
		System.out.println("num of elements from 2 array= "+elOf2arr);
		
		System.out.println("-------getting all values from 2d array-------");
		
		
		
		for (int r=0; r<countries.length;r++) { // loops aver rows
			for (int c=0; c<countries[r].length;c++) {
				System.out.println(countries[r][c]);
			}
			
			
		}
		
	}

}
