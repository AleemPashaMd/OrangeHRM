package com.Array;
public class SingleDimensionalArray {
	
	public static void main(String[] args) {
		// dataType arrayName[] = new dataType[size];
		int array1[] = new int[4];
		
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		array1[3]=50;
		
		/*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		*/
		
		for(int index=0;index<=3;index++)
		{
			System.out.println(array1[index]);
		}
		
		// Array is capable of saving multiple values
		// Array size is fixed
		// Array index starts with 0
				
		// Array once created with a size mentioned - it wont allow to save even an extra
		// value more than the size declared
				
		// An array index once assigned with a value - we can overwrite with the value
		// of the same index of an array
				
		// Array once declared with a dataType - it accepts only similar dataType values
				
		// If an Array index is created and the value is not assigned into it - will be 
			// occupied with 0 (default value) - wastage of memory
		// we can also update the value of an index of an array
	}
}
