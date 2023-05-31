package com.Methods;

public class MethodExample2 {
	private void subtraction()
	{	
		int var1=20;
		int var2=10;
		int var3;
		
		var3=var1-var2;
		System.out.println(" The subtraction of two numbers var1 and var2 is :- "+var3);
	}
	
	protected void multiplication()
	{	
		int var1=20;
		int var2=10;
		int var3;
		
		var3=var1*var2;
		System.out.println(" The multiplication of two numbers var1 and var2 is :- "+var3);

		
	}
	
	 void division() // default
	{	
		int var1=20;
		int var2=10;
		int var3;
		
		var3=var1/var2;
		System.out.println(" The division of two numbers var1 and var2 is :- "+var3);
	}
	public static void main(String[] args) {
		MethodExample2 m2 = new MethodExample2();
		// User defined Methods are created for Re-Usability purpose
		m2.addition();
		m2.addition(); // calling the same user defined method again
		m2.subtraction();
		m2.division();		
		m2.multiplication();
	}
	public void addition()
	{
		System.out.println(" **** Addition Method of MethodExample2 Java Class ****");
		int var1=20;
		int var2=10;
		int var3;
		
		var3=var1+var2;
		System.out.println(" The addition of two numbers var1 and var2 is :- "+var3);
	}
}
