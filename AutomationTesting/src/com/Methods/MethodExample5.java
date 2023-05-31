package com.Methods;
public class MethodExample5 {
		// Global Variables / Instance Varaibles
	int var3;
	public void addition1()
	{
		System.out.println(" **** Addition1 Method ****");
		// Local Variables
		int var1=20;
		 var1=50;
		int var2=10;
		int var3;
		
		var3=var1+var2;
		System.out.println(" The addition1 of two numbers var1 and var2 is :- "+var3);
	}
	
	public void addition2()
	{
		System.out.println(" ****** Addition2 Method *******");
		String var1="Hello";
		String var2="30";
		String var3;
		
		var3=var1+var2;
		System.out.println(" The addition2 of two numbers var1 and var2 is :- "+var3);
		
	}

	public void addition3()
	{
		System.out.println(" ****** Addition3 Method *******");
		int var1=60;
		int var2=80;
		
		var3=var1+var2;
		System.out.println(" The addition3 of two numbers var1 and var2 is :- "+var3);
	}

	// Global Variables
	int var1=50;
	int var2=80;
	
	public void addition4() // Method without Parameters
	{
		System.out.println(" ****** Addition4 Method *******");
		
		var3=var1+var2;
		System.out.println(" The addition4 of two numbers var1 and var2 is :- "+var3);
	}
	
	public void doubleDataTypeAddition(double var1,double var2) // Method with Parameters
	{
	System.out.println("***Addition Method of double data Type Values with 2 Parameters****");
		double var3=var1+var2;
	System.out.println(" Addition method with Same Parameters - The value of var3 is:-"+var3);
	}
	
public void doubleDataTypeAddition(double var1,double var2,double var3)// Method with Parameters
	{
		// same Method names with different Method Signature
 //*These methods are called overloaded methods and this feature is called method overloading.
	System.out.println("*** Addition Method of double data Type Values with 3 Parameters****");
		double var4=var1+var2+var3;
System.out.println("Addition method with Same Multile Parameters-The value of var4 is:-"+var4);
	}
	
	public void additionOfDiffertDataType(int var1,double var2)
	{
	System.out.println("***Addition Method of Different data Type Values with 2 Parameters**");
		double var3=var1+var2;
	System.out.println("Addition method with Different dataType Parameters -"
														+ "The value of var3 is:-"+var3);
	}
		
	public static void main(String[] args) {
		
		MethodExample5 m5 = new MethodExample5();
	// When User defined methods are called - first the Methods related variable values are
	// considered - if no local variables declared then it take the Global declared variables  
		m5.addition1();
		m5.addition2();
		m5.addition3();
		m5.addition4();
		
		m5.doubleDataTypeAddition(20.123, 10.123);
		m5.doubleDataTypeAddition(50.123, 60.123);
		m5.doubleDataTypeAddition(10.123, 20.123, 30.123);
		
		m5.additionOfDiffertDataType(20, 30.123);
		m5.additionOfDiffertDataType(60, 80.123);
	}
}
