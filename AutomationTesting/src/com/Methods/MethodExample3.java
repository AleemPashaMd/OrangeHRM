package com.Methods;

public class MethodExample3 {
	public void addition()
	{
		System.out.println(" **** Addition Method of MethodExample3 Java Class ****");
		int var1=20;
		int var2=10;
		int var3=30;
		
		int var4=var1+var2+var3;
		System.out.println(" The addition of Three numbers var1, var2  and var3 is :- "+var4);
	}
	
	public static void main(String[] args) {
			
		MethodExample3 m3 = new MethodExample3();
		m3.addition();
// Private methods cannot be accessed in another different class - even if they belong to same
//   Package 
// Private methods are restricted to the same class in which they are created - can also be
		// called for many time within the same class
		MethodExample2 obj = new MethodExample2();
		obj.addition();
		
		obj.multiplication();
		obj.division();
}

}
