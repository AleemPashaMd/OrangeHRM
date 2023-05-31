package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LogInTest {
	
	public static void main(String[] args) {
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		// Validating login Functionality
		// <input name="txtUsername" id="txtUsername" type="text">
		
		// attribute - id(locator of selenium webdriver)  
		//  value - txtUsername(selector) 
		
		// attribute - name  
		//  value - txtUsername
		
		driver.findElement(By.id("txtUsername")).sendKeys("srini");
		
		// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">/
		
		// id - locator
		// selector -txtPassword
		
		driver.findElement(By.id("txtPassword")).sendKeys("Q@Trainer7");
		
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
