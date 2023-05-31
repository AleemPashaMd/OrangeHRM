package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_ScreenShot {
	
	WebDriver driver;
	String applicationUrlAddress="http://bing.com";
		public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
		driver= new ChromeDriver();
			
	driver.manage().window().maximize();
	driver.get(applicationUrlAddress);
	}

	public void applicationClose()
	{
		driver.quit();
	}

	public void bingScreenShotTest() throws IOException
	{
		// Binding an Object with an Interface is called as TypeCasting
		// TakesScreenshot - is an interface in WebDriver
		// OutputType - is an interface in WebDriver
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("./applicationScreenShots/bing.png"));
	}
	
	
	public static void main(String[] args) throws IOException {
		
		Bing_ScreenShot sceenShot = new Bing_ScreenShot();
		sceenShot.applicationLaunch();
		sceenShot.bingScreenShotTest();
		sceenShot.applicationClose();
		
	}
		
}
