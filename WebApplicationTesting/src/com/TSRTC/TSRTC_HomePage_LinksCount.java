package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_LinksCount {
	
	public static void main(String[] args) {
	
		WebDriver driver;
		String applicationUrlAdress="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAdress);
		
		By LinksLocator=By.tagName("a");
		List<WebElement> tsrtcHomePagelinks=driver.findElements(LinksLocator);
		int tsrtcHomePagelinksCount=tsrtcHomePagelinks.size();
		System.out.println(tsrtcHomePagelinksCount);
		
	for(int tsrtcHomePagelinksIndex=0;tsrtcHomePagelinksIndex<tsrtcHomePagelinksCount;tsrtcHomePagelinksIndex++)	
	{
		String tsrtcHomePagelinksName=tsrtcHomePagelinks.get(tsrtcHomePagelinksIndex).getText();
		System.out.println(tsrtcHomePagelinksIndex+" - "+tsrtcHomePagelinksName);
	}
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
			
			String tsrtcHomePageheaderBlockLinksTitle=driver.getTitle();
			System.out.println(tsrtcHomePageheaderBlockLinksTitle);
			
			String tsrtcHomePageheaderBlockLinksCurrentUrlAddress=driver.getCurrentUrl();
			System.out.println(tsrtcHomePageheaderBlockLinksCurrentUrlAddress);
		
		    driver.navigate().back();
			
		    tsrtcHomePageheaderBlock=driver.findElement(tsrtcHomePageheaderBlockLocator);
		    headerBlockLinks=tsrtcHomePageheaderBlock.findElements(headerBlockLinksLocator);
		    
			}driver.close();
		}

}
