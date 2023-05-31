package com.DataTypes;

public class DataTypesExample {

	public static void main(String []args)
	{
		
		System.out.println(" ********** Variables & DataType Example **************");
		
		// variable is a Memory - but its a Temp Memory
		// variable should be assigned with a value
		// variable should be declared with a DataType
		// variable can store/save only one value at a time
		// variable once declared with a dataType - need not be declared again with the dataType-can
		//    be assigned with different values 
		// variable once declared with a dataType - it accepts similar dataType value if the same
		//     variable is used again in the program
		// variable always hold the latest value assigned to it
		// variableName once declared with a dataType - same variableName cannot be used to declare
		//       with another dataType - VariableNames should be Unique
		
		
		// Syntax:
		// dataType variable=value;
		
		byte byteVariable=10;
			byteVariable=20;
		
		System.out.println(" The value of the variable byteVariable is :- "+byteVariable);
		
		short shotVaibale=30;
		System.out.println(" The value of the variable shotVaibale is :- "+shotVaibale);
		
		long longVariable=40;
		System.out.println(" The value of the variable longVaibale is :- "+longVariable);
		
		int intVariable=50;
		System.out.println(" The value of the variable intVariable is :- "+intVariable);
		
		double doubleVariable=60.123456789123456789;
		System.out.println(" The value of the variable doubleVariable is :- "+doubleVariable);
		
		float floatVariable=60.123451234f;
		System.out.println(" The value of the variable floatVariable is :- "+floatVariable);
		
		char charVariable='a';
		System.out.println(" The value of the variable charVariable is :- "+charVariable);
		
		String stringVariable="abc";
		System.out.println(" The value of the variable stringVariable is :- "+stringVariable);
		
	    boolean booleanVariable=true;
	    booleanVariable =false;
	    System.out.println(" The value of the variable booleanVariable is :- "+booleanVariable);
	}
}
