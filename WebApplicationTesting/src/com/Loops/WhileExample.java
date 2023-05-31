package com.Loops;

public class WhileExample {

	public static void main(String[] args) {
		
		int var=2;
		while (var<=5)
		{
			System.out.println(var+ " testing ");
			var++;
		}
		System.out.println(" ###### ");
		//The Variable value of var after the above while loop execution is 6.
		while (var<=10)
		{
			System.out.println(var+ " Grid ");
			var++;
		}
		System.out.println(" @@@@@@ ");
		int a=-3;
		while (a<=3)		
		{
			System.out.println(a+ " LoadRunner ");
			a=a+3;
		}
		System.out.println(" $$$$$$ ");
		int j=7;
		while (j>=-5)
		{
			System.out.println(j+ " Selenium ");
			j=j-2;
		}
	}
}
