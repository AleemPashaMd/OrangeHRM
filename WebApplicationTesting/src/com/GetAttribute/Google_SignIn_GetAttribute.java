package com.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_GetAttribute {

	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		By SignInLocator=By.linkText("Sign in");
		WebElement SignIn=driver.findElement(SignInLocator);
		String attributevalueofclass=SignIn.getAttribute("class");
		System.out.println("The attribute value of SignIn element class is:-"+ attributevalueofclass);
		String attributevalueofHref=SignIn.getAttribute("href");
		System.out.println("The attribute value of SignIn element href is:-"+attributevalueofHref);
		
		SignIn.click();
		driver.quit();
	  /*  By searchLocator=By.id("APjFqb");
		WebElement search=driver.findElement(searchLocator);
		
		search.sendKeys("facebook.com");
		By googlesearchLocator=By.className("gNO89b");
		WebElement googlesearch=driver.findElement(googlesearchLocator);
		googlesearch.click();*/
		
		
	}
	
	
	
}
