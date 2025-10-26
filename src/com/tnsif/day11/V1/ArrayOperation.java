package com.tnsif.day11.V1;

public class ArrayOperation {
int intArray[] ;
	
	public void ArrayOperations() {
		super();
		
	}

	public void ArrayOperations(int[] intArray) {
		super();
		this.intArray = intArray;
		
	}
	
	public void displayArray() {
		for(int no:intArray) {
			System.out.println("The array elements are: "+no);
		}
	}
	
	public int getElement(int position) {
		return intArray[position];
	}
	
}
