package com.Methods;

public class MethodExample4 {

	public void addition()
	{
		int var1=20;
		int var2=40;
		int var3=60;
		int var4=var1+var2+var3;
		System.out.println("The Addition Of Three Variables Var1,Var2 and Var3 is :-("+var4+")");
	}
	public static void main(String[] args) {
		
		MethodExample4 m4=new MethodExample4();
		m4.addition();
		MethodExample3 m3=new MethodExample3();
		m3.addition();
		
		MethodExample2 m2= new MethodExample2();
		m2.additon();
		m2.multiplication();
		m2.division();
		
	}
	
}
