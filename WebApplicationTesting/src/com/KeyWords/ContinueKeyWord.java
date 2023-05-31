package com.KeyWords;

public class ContinueKeyWord {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
	System.out.println(i+" #### ");
	if(i==2) 
	{
		System.out.println(i+" @@@@ ");
		continue;
		// will skip the current iteration and continues with the rest of the iterations
		// depending on the given condition
	}
	System.out.println(i+" &&&& ");
		}
	}
}
