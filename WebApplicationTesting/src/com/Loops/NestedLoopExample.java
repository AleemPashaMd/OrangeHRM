package com.Loops;

public class NestedLoopExample {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.println(i+j+ " Aleem ");
			}
		}
		System.out.println(" ~~~~~~ ");
		for (int a=1; a<=3; a++)
		{
			for (int b=1; b<=a; b++)
			{
				System.out.println(a);
			}
		}
	}
}
