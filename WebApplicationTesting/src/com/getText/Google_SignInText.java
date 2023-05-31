package com.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignInText {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		By signInLocator=By.linkText("Sign in");
		WebElement SignIn=driver.findElement(signInLocator);
		String SignInText=SignIn.getText();
		System.out.println("The text of the webElement SignIn on google Home Page is:-"+SignInText);
		SignIn.click();
		
		
		
		
	}

}
