package com.GetTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePage_Title {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		String googleHomePageTitle=driver.getTitle();
		
		System.out.println(" The Title of Google Home Page is:- "+googleHomePageTitle);
		
		driver.close();
		
		
		
		
	}

}
