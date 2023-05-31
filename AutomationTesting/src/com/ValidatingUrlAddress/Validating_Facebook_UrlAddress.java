package com.ValidatingUrlAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_Facebook_UrlAddress {
	
	public static void main(String[] args) {
		
		//Facebook – log in or sign up
		
		String applicationUrlAddress="http://facebook.com";
		//https://www.facebook.com/


System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get(applicationUrlAddress);

// validating title of facebook LogIn Page
	String expected_FacebookLogInPageTitle="Facebook – log in or sign up";
	System.out.println(" The Expected title of Facebook Application LogIN Page is :-"+expected_FacebookLogInPageTitle);

String actual_FacebookLogInPageTitle=driver.getTitle();
System.out.println(" The actual title of Facebook Application LogIN Page is :-"+actual_FacebookLogInPageTitle);

if(actual_FacebookLogInPageTitle.equals(expected_FacebookLogInPageTitle))
{
	System.out.println(" Facebook LogIn Page Title Matched - PASS");
}
else
{
	System.out.println(" Facebook LogIN Page title not matched - FAIL ");
}

 String expected_FacebookLogInPageUrlAddress="facebook.com";
 System.out.println(" The expected Facebook LogIN Page Url Address is :- "
		 											+expected_FacebookLogInPageUrlAddress);

String actual_FacebookLogInPageUrlAddress=driver.getCurrentUrl();
System.out.println(" The actual Facebook LogIn Page Url Address is:- "
														+actual_FacebookLogInPageUrlAddress);

	if(actual_FacebookLogInPageUrlAddress.contains(expected_FacebookLogInPageUrlAddress))
	{
		System.out.println(" Facebook Application Url Address matched - PASS");
	}
	else
	{
		System.out.println(" Facebook Application Url Address Not matched - FAIL");
	}


driver.quit();

		
	}

}
