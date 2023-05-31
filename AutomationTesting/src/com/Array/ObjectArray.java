package com.Array;
public class ObjectArray {
	public static void main(String[] args) {
		// Object arrayName[] = new Object[size];
		
		Object array1[] = new Object[4];
		
		array1[0] = 10;
		array1[1] = "selenium";
		array1[2] = 10.123;
		array1[3] = 'A';
		
		/*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		*/
		
		for(int index=0;index<=3;index++)
		{
			System.out.println(array1[index]);
		}
		
	System.out.println(" ######## OR ########### ");
		
		for(int index=0;index<array1.length;index++)
		{
			System.out.println(array1[index]);
		}
	}
}
