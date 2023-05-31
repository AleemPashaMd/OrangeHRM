package com.Array;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		
		//dataType arrayName[row][column]=new dataType[size][size];
		
		String array1[][]=new String[2][3];
		
		array1[0][0]="Aleem";
		array1[0][1]="Pasha";
		array1[0][2]="Mohammad";
		array1[1][0]="Manual";
		array1[1][1]="Automation";
		array1[1][2]="Test Engineer";
		//array1[2][0]="Ts";
		//array1[2][1]="Ap";
		//array1[2][2]="Srini";
		
		for(int row=0;row<=1;row++)
		{
			for(int column=0;column<=2;column++)
			{
				System.out.println(array1[row][column]);
			}
		}
		
	}
	
}
