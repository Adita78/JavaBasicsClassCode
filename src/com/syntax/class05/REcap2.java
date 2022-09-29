package com.syntax.class05;

public class REcap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean allergy = true;
		String allergyType = "Peanut";
		if (allergy) {
			System.out.println("lets check what allergy you have");
			if (allergyType.equals("pollen")) {
				System.out.println("Try to stay indoor when tree are blooming");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("stay away from peanut");
			}
		} else {
			System.out.println("You are lucky");
		}
	}

}
