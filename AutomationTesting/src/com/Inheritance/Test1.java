package com.Inheritance;
public class Test1 {
	public void addition()
	{
		System.out.println("*******Test1 Java Class*********");
		int var1=20;
		int var2=40;
		int var3;
		
		var3=var1+var2;
		System.out.println(" The addition of two numbers is :- "+var3);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.addition();
		
	}

}
