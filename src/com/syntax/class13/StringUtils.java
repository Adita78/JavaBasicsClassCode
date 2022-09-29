package com.syntax.class13;

public class StringUtils {
	
	void printAllIndexes(String str, char charToSearch) {
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)==charToSearch) {
				System.out.println(i);
			}
		}
		
	}

}
