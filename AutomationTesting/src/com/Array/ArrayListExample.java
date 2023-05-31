package com.Array;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
	public static void main(String[] args) {
		
		// List<dataType>arrayListName = new ArrayList<>();
		
		List<Object>arrayList1 = new ArrayList<>();
		
		// arrayList1[0] = 10;
		
		arrayList1.add(10);
		arrayList1.add("Selenium");
		arrayList1.add('A');
		arrayList1.add(10.123);
		/*
		System.out.println(arrayList1.get(0));
		System.out.println(arrayList1.get(1));
		System.out.println(arrayList1.get(2));
		*/
				
		for(int index=0;index<arrayList1.size();index++)
		{
			System.out.println(arrayList1.get(index));
		}
		
		System.out.println(" @@@@@@@@@ for Each Loop @@@@@@@@ ");
		
		for(Object index: arrayList1)
		{
			System.out.println(index);
		}
			
	}
}
