package com.ConditionalStatements;

public class IfElseIfExample {
	public static void main(String[] args) {			
		int var1=60;
		int var2=50;
		int var3=40;
if(var1>var2 && var1>var3) 
	// if the given condition is true only then it will go into the Block
				      // to perform the Operation
		{
			// True Block
System.out.println(" var1 variable value is greater than var2 and var3 variable values ");
			System.out.println(" This is liveTech ");
			
		}
		else // if the given condition is false then below block of Operations are executed
			if(var2>var3)
		{
			// true Block
	System.out.println(" var2 variable value is greater than var1 and var3 variable values");
		}
			else
			{
	System.out.println(" var3 variable value is greater than var1 and var2 variable values");
			}
	}
}
