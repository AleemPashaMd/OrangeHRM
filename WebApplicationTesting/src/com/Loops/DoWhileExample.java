package com.Loops;

public class DoWhileExample {
	
	public static void main(String[] args) {
		
		int var=-3;
		do
		{
			System.out.println(var+ " Testing ");
			var++;
		}while(var>=-1);
		System.out.println(" The value of the variable is;"+var);
		System.out.println(" ##### ");
		do
		{
			System.out.println(var+ " Hello ");
			var--;
			System.out.println(" The value of the variable var is;"+var);
		} while (var>=5);
	}

}
