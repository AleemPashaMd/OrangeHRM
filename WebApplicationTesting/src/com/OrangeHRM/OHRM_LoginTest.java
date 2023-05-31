package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LoginTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("aleem");
		driver.findElement(By.name("txtPassword")).sendKeys("Aleem@69");
		
		driver.findElement(By.className("button")).click();
		
	}

}
