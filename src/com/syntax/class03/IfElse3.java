package com.syntax.class03;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//example 1
		boolean isHungry=true;
		if(isHungry) {
			System.out.println("Lets eat something yammy");
		}else {
			System.out.println("Lets watch and do some coding on Youtube");
		}		
		
		//example 2
		if(3>2)
			System.out.println("There is a true statement inside parathesis");
		
		double myBankBalance=2000;
		double theAmountThatIwantToTransfer=250;
		
		if(myBankBalance>theAmountThatIwantToTransfer)
			System.out.println("Founds transfered succesfuly");
		else
			System.out.println("Please try again not enough balance");
	}

}
