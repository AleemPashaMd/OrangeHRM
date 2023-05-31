package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {
	public static void main(String[] args) {
		/*
		 int a;
		 a=10;
		*/ 
		WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
		driver= new ChromeDriver();
		
		// Maximizing the Browser
		driver.manage().window().maximize();
						
		driver.get(applicationUrlAddress);
		
		// UserName element properties
		// <input name="txtUsername" id="txtUsername" type="text">
		
		// id - locator ( an attribute )
		// selector - txtUsername (value)
		
		//driver.findElement(By.id("txtUsername")).sendKeys("srini");
		
		 //WebElement hello=driver.findElement(By.id("txtUsername"));
		 // hello.sendKeys("srini");
		
		String userNameTestData="srini";
		
		// identifying the Property of the Element under Test
		By userNameLocator=By.id("txtUsername"); // finding the property of an element
		// identifying the element on the current webPage
		WebElement userName=driver.findElement(userNameLocator);
		userName.sendKeys(userNameTestData);// Performing Operation on the element under test
		
		// <input name="txtPassword"  autocomplete="off" type="password">
		
		String passwordTestData="Q@Trainer7";
		By passwordLocator=By.name("txtPassword");
		WebElement password=driver.findElement(passwordLocator);
		password.sendKeys(passwordTestData);
		
		// <input type="submit"  class="button"  value="LOGIN">
		By logInPageLogInButton=By.className("button");
		WebElement logInPageButton=driver.findElement(logInPageLogInButton);
		logInPageButton.click();
		
		driver.quit();		
		
	}
}
