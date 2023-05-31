package com.getTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_GetTitle {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		String googleHomePageTitle=driver.getTitle();
		
		System.out.println("The Title of the google Home Page is:-" +googleHomePageTitle);
		driver.quit();
		
	}
	

}
