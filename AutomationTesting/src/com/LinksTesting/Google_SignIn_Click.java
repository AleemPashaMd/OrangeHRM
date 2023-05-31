package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_Click {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
			
			System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
			driver= new ChromeDriver();
			
			// Maximizing the Browser
			driver.manage().window().maximize();
							
			driver.get(applicationUrlAddress);
			
			/*
 <a  href="https://accounts.google.com" target="_top">Sign in</span></a>

  a - anchor tag	
 href - attribute 

 Type of Element - link
 locater - linkText
 Selector - Sign in
	
	 */
		// identifying the property of an element
			// By signInLocator=By.linkText("Sign in");
			            // OR
			By signInLocator=By.partialLinkText("Sign");			
			
			// Identifying the element on the Webpage
			WebElement signIn=driver.findElement(signInLocator);
			signIn.click(); // Performing an operation on the WebPage
	}
}
