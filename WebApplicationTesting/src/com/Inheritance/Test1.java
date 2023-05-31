package com.Inheritance;

public class Test1 {
	
	public void addition()
	{
		System.out.println("*****Test1 Java Class*****");
		
		int var1=20;
		int var2=30;
		int var3;
		var3=var1+var2;
		System.out.println("The Addition Of Two Numbers Var1 and Var2 is:-("+var3+")");
				
	}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.addition();
		
	}

}
