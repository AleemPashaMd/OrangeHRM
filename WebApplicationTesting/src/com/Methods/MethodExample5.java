package com.Methods;

public class MethodExample5 {
	
   int var3;
	
	public void addition1()
	{
		int var1=30;
		int var2=50;
		int var3;
		var3=var1+var2;
		System.out.println("The Addition Of Two Numbers Var1 and Var2 is:-("+var3+")");
	}
	public void addition2(int var1,int var2)
	{
		var3=var1+var2;
		System.out.println("The Result Of Addition2 Method is:-("+var3+")");
	}
	public void addition2(int var1,int var2,int var3)
	{
		int var4=var1+var2+var3;
		System.out.println("The Result Of Addition2 Method with 3 Parameters is:-("+var4+")");
	}
	public void addition2(double var1,float var2)
	{
		double var3;
		var3=var1+var2;
		System.out.println("Addition2 Method With Different Type Of Parameters is :-("+var3+")");
	}
	int var1=44;
	int var2=22;
	public void subtraction()
	{
		var3=var1-var2;
		System.out.println("The Value Of Var3 After Subtraction is :-("+var3+")");
	}
	
	public static void main(String[] args) {
		
		MethodExample5 m5=new MethodExample5();
		m5.addition1();
		m5.addition2(20, 40);
		m5.addition2(15, 19, 26);
		m5.addition2(32.787, 47.213f);
		m5.subtraction();
		
	}
	
}
