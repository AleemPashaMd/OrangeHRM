package com.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_GetText {
	
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
			// identifying the property of sign IN element
			// By signInLocator=By.linkText("Sign in");
			            // OR
			By signInLocator=By.partialLinkText("Sign");			
			WebElement signIn=driver.findElement(signInLocator);
			String signInText=signIn.getText();
System.out.println(" The text of the Element SignIn on the Google HomePage is:- "+signInText);
			
	// Performing click operation on the same element signIn - we are not identifying
   //    the element properties for another time - instead we are interacting with the
  //   same element using the same variable(signIn) in which the identifying element is saved
			signIn.click();
		
	}

}
