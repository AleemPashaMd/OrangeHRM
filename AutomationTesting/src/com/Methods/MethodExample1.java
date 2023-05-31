package com.Methods;

public class MethodExample1
{
	public static void main(String[] args) {
		// 	Main method can only perform the Operation related to current java class
		
		// For the Current Java Class - creating an Object
		// The object(obj) - will be pointing to the current Java Class
			MethodExample1 obj = new MethodExample1();
		
		// Using the Object created - calling the User defined Method
		obj.userDefinedMethod();
			
		//MethodExample1 object = new MethodExample1();
		//object.test();
		
		obj.test();

	}	
	// User Defined Methods
	public void userDefinedMethod()
	{
		System.out.println(" This is my First Java Program ");
	}
	
	public void test()
	{
		System.out.println(" This is a test method ");
	}

	// A java class can have any number of User Defined Methods
	// A java class can have user Defined methods along with main method
// User defined Methods should be created either Above the main method of below the main method
	// User defined methods should never be created within the Main Method
	// User defined methods of the Java class will never get executed by themselves
	// To perform the Operations related to User defined methods - then we should create 
	//    an object for the current Java class in the main method
	// Using the Object created for the current class - we should then call the user defined
	//   methods
// To call multiple user defined methods - we need not create multiple Objects for the
 //   same class - instead using the class Object we can call any number of user defined methods 
	
}

