package com.TestNG;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayListExample {
	@Test(priority=1)
	public void arrayList1()
	{
		int array1[]=new int[2];
		array1[0]=1;
		array1[1]=10;
		for(int index=0;index<2;index++)
		{
		System.out.println(array1[index]);
		}
	}
	@Test(priority=2)
	public void arrayList2()
	{
		String array2[][]=new String[2][2];
		
		array2[0][0]="abcd";
		array2[0][1]="efg";
		array2[1][0]="hijk";
		array2[1][1]="lmnop";
		for(int row=0;row<2;row++)
		{
			for(int cell=0;cell<2;cell++)
			{
				System.out.println(array2[row][cell]);
			}
		}
		
		
		
	}
    
	@Test(priority=3)
	public void arrayList3()
	{
		Object array3[]=new Object[3];
		
		array3[0]=11;
		array3[1]="qrst";
		array3[2]='a';
		for(int index=0;index<3;index++)
		{
			System.out.println(array3[index]);
		}
		
	}
	@Test(priority=4)
	public void arrayList4()
	{
		List<Object> array4=new ArrayList<>();
		array4.add(10);
		array4.add("abcd");
		array4.add('v');
		array4.add(1.24);
		
		for(Object index:array4)
		{
			System.out.println(index);
		}
		
		for(int index=0;index<=3;index++)
		{
			System.out.println(array4.get(index));
		}
		for(int index=0;index<array4.size();index++)
		{
			System.out.println(array4.get(index));
		}
		
	}
	
}
