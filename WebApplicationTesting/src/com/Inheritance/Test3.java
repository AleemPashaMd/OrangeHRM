package com.Inheritance;

public class Test3 extends Test2{
   
	public void division()
	{
		System.out.println("*****Test3 Java Class*****");
		int var1=80;
		int var2=40;
		int var3;
		var3=var1/var2;
		System.out.println("The Division Of Two Numbers Var1 and Var2 is:-("+var3+")");
	}
	public static void main(String[] args) {
		Test3 t3=new Test3();
		t3.division();
		t3.subtraction();
		t3.addition();
	}
}
