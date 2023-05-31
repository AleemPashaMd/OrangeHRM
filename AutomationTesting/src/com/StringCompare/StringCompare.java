package com.StringCompare;

public class StringCompare {
	public static void main(String[] args) {
		String string1="Testing";
		//System.out.println(string1);
		
		// index starts from 0
		System.out.println(string1.charAt(2));
			
		char hello=string1.charAt(4);
		System.out.println(hello); // it gives the character 
		
		int  hi=string1.charAt(3);
		System.out.println(hi); // it gives ASCII value
		
		
		String string2="LiveTech";
		String string3="LiveTech";
		
if(string2.equals(string3)) // checks for the exact match case of each and every character
		{
			System.out.println(" Both String values string2 and string3 are Equal ");
		}
		else
		{
			System.out.println("Both String values string2 and string3 are NOT Equal ");
		}
		
		
	String string4="Testing Tools";
	String string5="Testing  Tools";

if(string4.equals(string5)) // checks for the exact match case of each and every character
		{
			System.out.println(" Both String values string4 and string5 are Equal ");
		}
		else
		{
			System.out.println("Both String values string4 and string5 are NOT Equal ");
		}
		
	String string6="LiveTech";
	String string6ToUpperCase=string6.toUpperCase();
System.out.println(" The value of the variable string6 after converting to UpperCase is:- "
																		+string6ToUpperCase);
	
	String string7="LiveTech";
	String string7ToLowerCase=string7.toLowerCase();
System.out.println(" The value of the variable string7 after converting to LowerCase is:- "
																		+string7ToLowerCase);
	String string8="Testing Tools";
	String string9="Testing tools";
	if(string8.equalsIgnoreCase(string9)) // checks for the exact matcher case of characters
		// but will ignore checking UpperCase and LowerCase letters of string characters			
	{
		System.out.println(" Both String values string8 and string9 are Equal ");
	}
		else
	{
		System.out.println("Both String values string8 and string9 are NOT Equal ");
	}
			System.out.println(" ***************************** ");
	
	int string9Length=string9.length();
System.out.println(" The number of characters in the varibale string9 are :- "+string9Length);
	
	String string10="LiveTech";
	String string11="Tech";
	if(string11.contains(string10))
	{
		System.out.println(" String Existing");
	}
	else
	{
		System.out.println(" String not Found / String Not Existing");
	}
		
	}
	
}
