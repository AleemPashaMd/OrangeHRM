package com.Inheritance;
public class Test2 extends Test1{
	public void subtraction()
	{
		System.out.println("*******Test2 Java Class*********");
		int var1=20;
		int var2=40;
		int var3;
		
		var3=var1-var2;
		System.out.println(" The subtraction of two numbers is :- "+var3);
		System.out.println();
	}
	
	private void multiplication()
	{
		System.out.println("*******Test2 Java Class*********");
		int var1=20;
		int var2=40;
		int var3;
		
		var3=var1*var2;
		System.out.println(" The multiplication of two numbers is :- "+var3);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Test2 t2 = new Test2(); // creating an object for the current class
		t2.subtraction(); // using the current class object calling the methods of current class
		
		/*
		Test1 t1 = new Test1();
		t1.addition();
		*/
		t2.addition(); // Without creating an object of another class and then calling the 
		               // the methods of that class - using inheritance(with extends keyword)-
		               // with the current class object created we can class the methods of the
		               // another class into current class 
		
		t2.multiplication(); 
	}
}
