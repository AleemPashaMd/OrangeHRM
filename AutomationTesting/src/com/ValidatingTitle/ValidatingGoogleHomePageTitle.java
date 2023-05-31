package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingGoogleHomePageTitle {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		String expected_GoogleHomePageTitle="Google";
	System.out.println(" The Expected title of Google Home Page is :- "
													+expected_GoogleHomePageTitle);
		
		String actual_googleHomePageTitle=driver.getTitle();
	System.out.println(" The Title of Google Home Page is:- "+actual_googleHomePageTitle);
		
		
		if(actual_googleHomePageTitle.equals(expected_GoogleHomePageTitle))
		{
			System.out.println(" Google Home Page title Matched - PASS");
		}
		else
		{
			System.out.println("Google Home Page title NOT Matched - FAIL");
		}
			
		driver.close();
		
	}
}
