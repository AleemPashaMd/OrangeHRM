package com.StringCompare;

public class StringCompareExample {

	public static void main(String[] args) {
		String string1="Live Tech";
		System.out.println("The value of the string1 is;" +string1);
		String string2="Live tech";
		System.out.println("The value of the string2 is;" +string2);
		if (string1.equals(string2))
			//equal method will check for the exact match case of each any every single char values
		{
			System.out.println("Both the string values string1 and string2 are equal");
		}
		else
		{
			System.out.println("Both the string values string1 and string2 are Not equal");
		}
		System.out.println(" _______________ ");
		String string3="Testing Tools ";
		String string4="Testing Tools";
		if(string3.equals(string4))
			//even the space is considered during comparison
		{
			System.out.println("Both the string values string3 and string4 are equal");
		}
		else
		{
			System.out.println("Both the string values string3 and string4 are Not equal");
		}
		System.out.println("----------------");
		String string5="Testing Tools";
		String string6="Testing tools";
		//comparing string values-both of them should be equal but should ignore the upper case and
		// the lower case letter of the string
		if(string5.equalsIgnoreCase(string6))
		{
			System.out.println("Both the string values string5 and string6 are equal");
		}
		else
		{
			System.out.println("Both the string values string5 and string6 are Not equal");
		}
		System.out.println("^^^^^^^^^^^^^^");
		//converting the values to upper case letters 
		String string7="Aleem";
		String string7Uppercasevalue=string7.toUpperCase();
		System.out.println("The value of the variable after converting to uppercase letter is;"+ string7Uppercasevalue);
		//converting the values to lower case letters
		String string8="ALEEM";
		String string8Lowercasevalue=string8.toLowerCase();
		System.out.println("The value of the variable after converting to lowerletter is;"+string8Lowercasevalue);
		
		String string9="Mohammad aleem ";
		int string9length=string9.length();
		System.out.println(string9length);
		System.out.println("****Finding the character at an index of the string value****");
		System.out.println(string9.charAt(5));
		
		int string9Asciivalue=string9.charAt(9);
		System.out.println(string9Asciivalue);
		
		String string10="Live Tech";
		String string11="Tech";
		String string12="Live tech";
		// checking for an existence of a string value
		
		if(string10.contains(string12))
		{
			System.out.println("string existing");
		}
		else
		{
			System.out.println("string not found");
		}
	}
	
}
