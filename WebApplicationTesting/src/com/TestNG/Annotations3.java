package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {

	@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println("(*Successfully Navigated to Gmail Log in Page*)");
	}
	@Test(priority=2,description="Gmail Inbox Test")
	public void gmailInboxTest()
	{
		System.out.println("[*Inbox Functionality Test Successfull*]");
	}
	@Test(priority=3,description="Gmail ComposeMail Test")
	public void gmailComposeMailTest()
	{
		System.out.println("(*ComposeMail Functionality Test Successfull*)");
	}
	@AfterTest
	public void gmailApplicationClose()
	{
		System.out.println("(###Gmail Application Close Test Successfull###)");
	}
	@Test(enabled=false,description="Gmail Draft Test")
	public void gmailDraftTest()
	{
		System.out.println("{***Draft Functionality Test Successfull***}");
	}
	@Test(priority=5,description="Gmail SentMail Test")
	public void GmailSentMailTest()
	{
		System.out.println("{**Sent Mail Functionality Test Successfull**}");
	}
}
