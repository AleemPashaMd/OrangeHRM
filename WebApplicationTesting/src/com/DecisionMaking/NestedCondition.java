package com.DecisionMaking;

public class NestedCondition {

	public static void main(String[] args) {
		
		int var1=20;
		int var2=10;
		int var3=20;
		
		if(var1>var2) //(var1<var2) (var2<=var2) (var1==var2) blank
		{
			System.out.println( var1);
			
			if (var1==var3)//(var1<var3) (var1>var3) not executable (blank)
			// if (var2==var3)
			{
				System.out.println(" Java ");
			}
		}
		
		System.out.println(" LiveTech ");
	}
	
}
