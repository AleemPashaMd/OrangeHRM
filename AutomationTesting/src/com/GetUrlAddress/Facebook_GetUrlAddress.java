package com.GetUrlAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_GetUrlAddress {
	
	public static void main(String[] args) {
		
		String applicationUrlAddress="http://facebook.com";
									//https://www.facebook.com/

		
		System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		String actual_FacebookLogInPageTitle=driver.getTitle();
		System.out.println(" The actual title of Facebook Application LogIN Page is :-"+actual_FacebookLogInPageTitle);
		
		String actual_FacebookLogInPageUrlAddress=driver.getCurrentUrl();
		System.out.println(actual_FacebookLogInPageUrlAddress);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
