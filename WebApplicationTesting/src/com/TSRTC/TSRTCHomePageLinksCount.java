package com.TSRTC;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TSRTCHomePageLinksCount {


	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		String applicationUrlAdress="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAdress);
		
		 By tsrtcHomePageheaderBlockLocator=By.className("menu-wrap");
		WebElement tsrtcHomePageheaderBlock=driver.findElement(tsrtcHomePageheaderBlockLocator);
			
		 By headerBlockLinksLocator=By.tagName("a");
		List<WebElement> headerBlockLinks=tsrtcHomePageheaderBlock.findElements(headerBlockLinksLocator);
		int tsrtcHomepageheaderBlockCount=headerBlockLinks.size();
	    System.out.println(tsrtcHomepageheaderBlockCount);
			
		for(int headerBlockLinksIndex=0;headerBlockLinksIndex<tsrtcHomepageheaderBlockCount;headerBlockLinksIndex++)
		{
		String tsrtcHomePageheaderBlockLinksName=headerBlockLinks.get(headerBlockLinksIndex).getText();
		System.out.println(headerBlockLinksIndex+" - "+tsrtcHomePageheaderBlockLinksName);
		
		headerBlockLinks.get(headerBlockLinksIndex).click();
		//tsrtcHomePageheaderBlock.click();
		String tsrtcHomePageheaderBlockLinksTitle=driver.getTitle();
		System.out.println(tsrtcHomePageheaderBlockLinksTitle);
		
		String tsrtcHomePageheaderBlockLinksCurrentUrlAddress=driver.getCurrentUrl();
		System.out.println(tsrtcHomePageheaderBlockLinksCurrentUrlAddress);
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File("./TSRTC_HeaderBlockScreenShots/"+tsrtcHomePageheaderBlockLinksName+".Png"));
		
		driver.navigate().back();
	    tsrtcHomePageheaderBlock=driver.findElement(tsrtcHomePageheaderBlockLocator);
		headerBlockLinks=tsrtcHomePageheaderBlock.findElements(headerBlockLinksLocator);
				
		}driver.close();
		
		
		
	

	}

}
