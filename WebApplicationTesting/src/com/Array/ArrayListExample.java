package com.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
	List<Object>array1=new ArrayList<>();
	
	array1.add(10);
	array1.add("aleem");
	array1.add('a');
	array1.add(1.43);
	array1.add(100);
	
	for(Object index:array1)
	{
		System.out.println(index);
	}
	for(int index=0; index<array1.size();index++)
	{
		System.out.println(array1.get(index));
	}
	for(int index=0;index<5;index++)
	{
		System.out.println(array1.get(index));
	}
	
	}

}
