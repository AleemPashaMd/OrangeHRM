package com.Inheritance;

public class Test2 extends Test1 {

	public void subtraction()
	{
		System.out.println("*****Test2 Java Class*****");
		int var1=20;
		int var2=30;
		int var3;
		var3=var1-var2;
		System.out.println("The Subtraction Of Two Numbers Var1 and Var2 is:-("+var3+")");
	}
	private void multiplication()
	{
		System.out.println("*****Test2 Java Class*****");
		int var1=20;
		int var2=30;
		int var3;
		var3=var1*var2;
		System.out.println("The Multiplication Of Two Numbers Var1 and Var2 is:-("+var3+")");
		
	}
	public static void main(String[] args) {
		Test2 t2=new Test2();
		t2.subtraction();
		t2.multiplication();
		t2.addition();
		
		
	}
	
}
