package com.getCurrentUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAddress {
	
	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		
		String FacebookHomePageUrlAddress=driver.getCurrentUrl();
		System.out.println("The Url Address of facebook Home Page is :-"+ FacebookHomePageUrlAddress);
		
		driver.close();
		
		String expected_FacebookHomePageUrlAddress="facebook.com";
		System.out.println("The expected Title of the Facebook Home Page Url Address is:-" +expected_FacebookHomePageUrlAddress);
		String actual_FacebookHomePageUrlAddress=FacebookHomePageUrlAddress;
		System.out.println("The actual Title of the Facebook Home Page Url Address is:-" +actual_FacebookHomePageUrlAddress);
		
		if (actual_FacebookHomePageUrlAddress.contains(expected_FacebookHomePageUrlAddress))
		{
			System.out.println("The actual result matches the expected result Pass");
		}
		else
		{
			System.out.println("The actual result Not matches the expected result Fail");
		}
		
		
	}

}
