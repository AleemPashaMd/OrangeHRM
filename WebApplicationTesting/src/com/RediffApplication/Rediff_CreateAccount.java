package com.RediffApplication;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_CreateAccount {

	
	WebDriver driver;
	String applicationUrlAddress="https://www.rediff.com/";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationUrlAddress);
	}
	
	/*@AfterTest
	public void tearDown()
	{
		driver.close();
	}*/
	
	@Test
	public void createAccount() throws InterruptedException
	{
	 By createAccountLocator=By.linkText("Create Account");
	 WebElement createAccount=driver.findElement(createAccountLocator);
	 createAccount.click();
	 
	 By fullNameLocator=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input");
	 WebElement fullName=driver.findElement(fullNameLocator);
	 fullName.sendKeys("AleemPasha Mohammad");
	 
	By newPasswordLocator=By.id("newpasswd");
	 WebElement newPassword=driver.findElement(newPasswordLocator);
	 newPassword.sendKeys("Saleem123");
	 
	 By showNewPasswordLocator=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[9]/td[3]/em");
	 WebElement showNewPassword=driver.findElement(showNewPasswordLocator);
	 showNewPassword.click();
	 Thread.sleep(10000);
	 showNewPassword.click();
	 
	}
	
}
