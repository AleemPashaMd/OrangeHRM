package com.getTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_GetTitle {

	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		String facebookHomePageTitle=driver.getTitle();
		System.out.println("The title of the facebook Home Page is:-"+ facebookHomePageTitle);
		driver.close();
		
		String expected_facebookHomePage="Facebook_log in or sign up";
		System.out.println("The expected Title of the facebook Home Page is:-" +expected_facebookHomePage);
		String actual_facebookHomePage=facebookHomePageTitle;
		System.out.println("The actual Title of the facebook Home Page is:-" +actual_facebookHomePage);
		
		
		if (actual_facebookHomePage.equals(expected_facebookHomePage))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
	
}
