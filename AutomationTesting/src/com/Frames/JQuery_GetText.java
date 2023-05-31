package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery_GetText {

	public WebDriver driver;
	String applicationUrlAddress="https://jqueryui.com/droppable/";
	
	public WebElement	dragMeToMyTargert;
	
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
	
	
	public void frame_dragMeToMyTargetText() 
	{
		// Identifying the frame of the WebPage
		
		// <iframe src="default.html" class="demo-frame"></iframe>
		By webPageFrameLocator=By.className("demo-frame");
		WebElement webPageFrame=driver.findElement(webPageFrameLocator);
		
		// getting into the frame of the WebPage
		driver.switchTo().frame(webPageFrame);
		
		// identifying the element property - which is inside frame(element under test)
		// id="draggable"
			By dragMeToMyTargertLocator=By.id("draggable");
			dragMeToMyTargert=driver.findElement(dragMeToMyTargertLocator);
		
		// getting the text of the Element
		String dragMeToMyTargert_Text=dragMeToMyTargert.getText();
System.out.println(" The text of the Element Drag Me To My Target is :- "
															+dragMeToMyTargert_Text);

		}
	
	public static void main(String[] args) throws InterruptedException {
		
		JQuery_GetText getText = new JQuery_GetText();
		getText.setUp();
		getText.frame_dragMeToMyTargetText();
		getText.tearDown();
	}
}
