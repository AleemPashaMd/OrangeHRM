package com.ScreenShot;

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

public class TSRTC_HeaderBlock_TestingLinks_CapturingSceenShots {
	
	WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(applicationUrlAddress);
		
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	public void headerBlockLinksTest() throws IOException
	{
		
		// Identifying the Header Block first
		// class="menu-wrap" - Header Block Property
	
	By tsrtcHeaderBlockLocator=By.className("menu-wrap");
	WebElement tsrtcHeaderBlock=driver.findElement(tsrtcHeaderBlockLocator);
	
	// identify the properties of elements of Header Block

	// Identify the common property of the elements of the header Block
	By tsrtcHeaderBockLocator=By.tagName("a"); // anchor tag is common property
List<WebElement>tsrtcHeaderBlockLinks=tsrtcHeaderBlock.findElements(tsrtcHeaderBockLocator);
	
int tsrtcHeaderBlockLinksCount=tsrtcHeaderBlockLinks.size();
System.out.println("The number of links in the Header Block of TSRTC Application HomePage"
											+ " are :-  "+tsrtcHeaderBlockLinksCount);

//testing the links of the header Block
for(int index=0;index<tsrtcHeaderBlockLinksCount;index++) // getting all the links names
{
	String tsrtcHeaderBlockLinkName=tsrtcHeaderBlockLinks.get(index).getText();
	System.out.println(index+" - "+tsrtcHeaderBlockLinkName);
	
	tsrtcHeaderBlockLinks.get(index).click(); // performing click operation on link 
	
	String webPageTitle=driver.getTitle(); // getting the title of the navigated webpage
	System.out.println(webPageTitle);
	
	// getting the currentUrl Address of the navigated WebPage
	String webPageCurrentUrlAddress=driver.getCurrentUrl();
	System.out.println(webPageCurrentUrlAddress);
	
	System.out.println();
	
	File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenShot, new File("./applicationScreenShots/"+tsrtcHeaderBlockLinkName+".png"));
		
	driver.navigate().back(); // navigating back to the previous webpage
			
	// Re-creating the arrayList again because when the driver focus is shifted to the
	// to the next webPage - the saved information of the driver of the arrayList of
	// the webPage will be cleared off - so once navigated back ... we are find the 
	// header block again and identifying all the elements of the header block
	// and saving back to arrayList
	tsrtcHeaderBlock=driver.findElement(tsrtcHeaderBlockLocator);
	tsrtcHeaderBlockLinks=tsrtcHeaderBlock.findElements(tsrtcHeaderBockLocator);
}

	}
	
	public static void main(String[] args) throws IOException {
		
		TSRTC_HeaderBlock_TestingLinks_CapturingSceenShots webPageScreenShot = new TSRTC_HeaderBlock_TestingLinks_CapturingSceenShots();
		webPageScreenShot.setUp();
		webPageScreenShot.headerBlockLinksTest();
		webPageScreenShot.tearDown();
		
	}
	

}
