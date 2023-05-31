package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_LinksCount {
		public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
			
		System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.manage().window().maximize();
							
			driver.get(applicationUrlAddress);
			
// <a href="/oprs-web/gu>Home</a>		
// <a href="/oprs-web/guest">Cancel Tickets</a>		
// <input type="text" "off">

// <a href="#" ">Hyderabad - Bangalore</a>			

	// in the above inspected multiple element properties - only anchor tag is common - by
			// which elements of type links can be found
			By linksLocator=By.tagName("a");
		List<WebElement>tsrtcHomePageLinks=driver.findElements(linksLocator);
			
		int tsrtcHomePageLinksCount=tsrtcHomePageLinks.size();
			
System.out.println(" The number of links on the TSRTC Applicaiton HomePage are :- "
																+tsrtcHomePageLinksCount);
		
	for(int index=0;index<tsrtcHomePageLinks.size();index++)
	{
		String tsrtcHomePageLinkName=tsrtcHomePageLinks.get(index).getText();
		System.out.println(index+" - "+tsrtcHomePageLinkName);
	}
	
	System.out.println(" ********* for each loop *********** ");


	for(WebElement homepagelinks:tsrtcHomePageLinks)
	{
		String tsrtcHomePagelinkName=homepagelinks.getText();
		System.out.println(tsrtcHomePagelinkName);
	}
	
driver.quit();			
		}
}
