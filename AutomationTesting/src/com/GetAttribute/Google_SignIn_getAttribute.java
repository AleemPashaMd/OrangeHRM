package com.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_getAttribute {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
			
			System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
			driver= new ChromeDriver();
			
			// Maximizing the Browser
			driver.manage().window().maximize();
							
			driver.get(applicationUrlAddress);
		
		
		/*
		 <a class="gb_ma gb_Wd gb_Qd gb_id" href="https://accounts.google.com/ServiceLogin?hl=
	en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ" target="_top">
	<span class="gb_Sd">Sign in</span></a>

	  class - attribute
	  gb_ma gb_Wd gb_Qd gb_id - value
	  gb_ma gb_Wd gb_Qd gb_id 

	 href - attribute
	 https://accounts.google.com/ServiceLogin?hl=
	en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ  - Value

https://accounts.google.com/ServiceLogin?hl
=en&passive=true&continue=https://www.google.com/%3Fgws_rd%3Dssl&ec=GAZAmgQ
		 */
		// identifying the property of sign IN element
			// By signInLocator=By.linkText("Sign in");
			            // OR
			By signInLocator=By.partialLinkText("Sign");			
			WebElement signIn=driver.findElement(signInLocator);
			String signInText=signIn.getText(); // getting text of "Sign In" Element
System.out.println(" The text of the Element SignIn on the Google HomePage is:- "+signInText);
		
		// get the attribute value of class 
		String signInAttributeValueOfClass=signIn.getAttribute("class");
	System.out.println(" The attribute value of SignIn Element related to class is:- "
															+signInAttributeValueOfClass);
		
	String signInAttributeValueOfHref=signIn.getAttribute("href");
	System.out.println(" The attribute value of SignIn Element related to href is:- "
													+signInAttributeValueOfHref);
		
		signIn.click();
		driver.quit();
	}

}
