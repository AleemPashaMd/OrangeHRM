package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_DragAndDrop {

	WebDriver driver;
	String applicationUrlAddress="https://jqueryui.com/droppable/";
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationUrlAddress);
	}
	
	public void dragAndDropTest()
	{
		By webPageFrameLocator=By.className("demo-frame");
		WebElement webPageFrame=driver.findElement(webPageFrameLocator);
		driver.switchTo().frame(webPageFrame);
		
		By dragMeToMyTargetLocator=By.id("draggable");
		WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetLocator);
		
		By dropHereLocator=By.id("droppable");
		WebElement dropHere=driver.findElement(dropHereLocator);
		
		Actions dragAction=new Actions(driver);
		dragAction.dragAndDrop(dragMeToMyTarget, dropHere).build().perform();
		
		driver.switchTo().defaultContent();
		
	}
	public void resizable()
	{
		By resizableLocator=By.linkText("Resizable");
		WebElement resizable=driver.findElement(resizableLocator);
		resizable.click();
		
		String webPageTitle=driver.getTitle();
		System.out.println("The Title Of The Resizable WebPage is:-"+webPageTitle);
		
	}
	public void applicationclose()
	{
		driver.close();
	}
	
	public static void main(String[] args) {
		
		JQuery_DragAndDrop dragAndDrop=new JQuery_DragAndDrop();
		dragAndDrop.applicationLaunch();
		dragAndDrop.dragAndDropTest();
		dragAndDrop.resizable();
        dragAndDrop.applicationclose();
	}
}
