package com.JumpStatements;

public class ContinueKeyWord {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(" Selenium ");
			if(i==3)
			{
				System.out.println(i+ " WebDriver ");
		continue; // skips the current iteration and continues with rest of the iterations
			          // depending on the condition
			}
				System.out.println(i+" LiveTech ");
		}
	}

}
