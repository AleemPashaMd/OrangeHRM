package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations4 {

	@BeforeMethod
	public void gmailApplicationLaunch()
	{
		System.out.println(" *** Gmail Application Launch Successfull **** ");
	}
	

	@AfterMethod
	public void gmailApplicationClose()
	{
		System.out.println(" ***** Gmail Application Close Successfull *****");
	}
	
	@Test(priority=1,description=" Testing Inbox functionality of Gmail Application ")
	public void gmailApplicationInBoxTest()
	{
		System.out.println(" *** InBox Functionality Test Successfull **** ");
	}
	
	@Test(priority=4,description=" Testing Sent mail functionality ")
	public void gmailApplicationSentMailTest()
	{
		System.out.println(" *** SentMail Functionality Test Successfull ****");
	}
	
	@Test(priority=2,description=" Testing Compse mail functionality ")
	public void gmailApplicationComposeMailTest()
	{
		System.out.println(" *** ComposeMail Functionality Test Successfull ****");
	}

	@Test(enabled=false,description=" Testing Draft functionality ")
	
	public void gmailApplicationDraftsTest()
	{
		System.out.println(" **** Draft Functioanlity Test Successfull ***");
	}
	
}
