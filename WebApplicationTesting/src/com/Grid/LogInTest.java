package com.Grid;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInTest {
	
	@Parameters("Browser")
	
	@Test
	public void logInTest(String browserName) throws IOException
	{
		System.out.println(browserName);
		
		
		DesiredCapabilities cap=null;
		
		if(browserName.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(browserName.equals("edge"))
			{
				cap=DesiredCapabilities.edge();
				cap.setBrowserName("edge");
				cap.setPlatform(Platform.WINDOWS);
			}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.108:4444/wd/hub"), cap);
	
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		driver.get(applicationUrlAddress);
		
        driver.manage().window().maximize();
        
        driver.findElement(By.id("txtUsername")).sendKeys("aleem");
		driver.findElement(By.name("txtPassword")).sendKeys("Aleem@69");
		
		driver.findElement(By.className("button")).click();
		
	}

}
