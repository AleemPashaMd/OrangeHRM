package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utility.Log;

public class BaseTest {

	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/browserDriverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		Log.info("****Chrome Browser Launched SuccessFully ****");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		Log.info("**** Chrome Browser Closed Successfully ****");
	}
	
}
