package com.Array;

public class ObjectArray {
	
public static void main(String[] args) {
	
	//Object arrayName[]=new Object[size];
	Object array1[]=new Object[4];
	
	array1[0]=10;
	array1[1]="Aleem";
	array1[2]='a';
	array1[3]=1.234;
	
	for(Object index:array1)
	{
		System.out.println(index);
	}
	for(int index=0;index<=3;index++)
	{
		System.out.println(array1[index]);
	}
	for(int index=0;index<array1.length;index++)
	{
		System.out.println(array1[index]);
	}
}
}
