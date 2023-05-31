package com.Methods;

public class MethodExample2 {
	
  public void additon()
  {
	  int var1=10;
	  int var2=20; 
	  int var3;
	  var3=var1+var2;
	  System.out.println(" The addition of two numbers var1 and var2 is:- "+var3);
  }
  private void substraction()
  {
	  int var1=20;
	  int var2=10;
	  int var3;
	  var3=var1-var2;
	  System.out.println(" The substraction of two numbers var1 and var2 is:- "+var3);
  }
  public static void main(String[] args) {
	  MethodExample2 object=new MethodExample2();
	  
	  object.additon();
	  object.substraction();
	  object.multiplication();
	  object.division();
	 
}
  protected void multiplication()
  {
	  int var1=30;
	  int var2=30;
	  int var3;
	  var3=var1*var2;
	  System.out.println(" THe multiplication of two numbers var1 and var2 is:- "+var3);
  }
  void division()
  {
	  int var1=60;
	  int var2=10;
	  int var3;
	  var3=var1/var2;
	  System.out.println(" The division of two numbers var1 and var2 is:- "+var3);
  }
  
}
