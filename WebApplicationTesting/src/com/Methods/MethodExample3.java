package com.Methods;

public class MethodExample3 {
	
	public void addition()
	{
		int var1=10;
		int var2=20;
		int var3=30;
		int var4=var1+var2+var3;
		System.out.println(" The addition of three numbers var1, var2 and var3 is:- "+var4);
	}
	public static void main(String[] args) {
		MethodExample3 object=new MethodExample3();
		object.addition();
		object.addition();
		
		MethodExample2 obj=new MethodExample2();
		obj.additon();
		obj.multiplication();
		obj.division();
		
		object.division();
	}
	private void division()
	{
		int var1=20;
		int var2=0;
		int var3;
		var3=var1/var2;
		System.out.println(" The division of two numbers var1 and var2 is:- "+var3);
	}

}
