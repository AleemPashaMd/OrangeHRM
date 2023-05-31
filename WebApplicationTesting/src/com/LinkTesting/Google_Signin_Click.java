package com.LinkTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Signin_Click {
	
public static void main(String[] args) {
	
	WebDriver driver;
	String applicationUrlAddress="http://google.com";
	
	System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get(applicationUrlAddress);
	 By SignInLocator=By.linkText("Sign in");
	 WebElement SignIn=driver.findElement(SignInLocator);
	 SignIn.click();
	 driver.quit();
	 
	
	
}	
	
	

}
