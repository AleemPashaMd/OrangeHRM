package com.Inheritance;
public class Test3 extends Test2 {
	public void division()
	{
		System.out.println("*******Test3 Java Class*********");
		int var1=20;
		int var2=40;
		int var3;
		
		var3=var1/var2;
		System.out.println(" The division of two numbers is :- "+var3);
		System.out.println();
	}
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		t3.division(); // calling the method of the current class
		t3.subtraction(); // calling the method of the the extended class
		t3.addition(); // even the method of Test1 java class is accessed without extending
		               // the Test1 class , it is possible because the current extended class
		               //   (Test2) internally is extended with Test1 java class -automatically
					//   we are able to access the Methods of that Class	
		}
}
