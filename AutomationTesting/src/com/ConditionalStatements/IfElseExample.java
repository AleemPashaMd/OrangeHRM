package com.ConditionalStatements;
public class IfElseExample {
	public static void main(String[] args) {
		
		int var1=20;
		int var2=30;
		
		if(var1>var2) // if the given condition is true only then it will go into the Block
				      // to perform the Operation
		{
			// True Block
			System.out.println(" var1 variable value is greater than var2 variable value ");
			System.out.println(" This is liveTech ");
			
		}
		else // if the given condition is false then below block of Operations are executed
		{
			// False Block
			System.out.println(" var1 variable value is less than var2 variable value");
		}
	}
}
