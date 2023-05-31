package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery_Frame_getText {
	
	WebDriver driver;
	String applicationUrlAddress="https://jqueryui.com/droppable/";
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationUrlAddress);
	}
	public void frameGetText()
	{
		By webPageFrameLocator=By.className("demo-frame");
		WebElement webPageFrame=driver.findElement(webPageFrameLocator);
		driver.switchTo().frame(webPageFrame);
		
		By dragMeToMyTargetLocator=By.id("draggable");
		WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetLocator);
		String dragMeToMyTargetText=dragMeToMyTarget.getText();
		System.out.println("The Text Of The Element DragMeToMyTarget is :-"+dragMeToMyTargetText);
	}
	public void applicationclose()
	{
		driver.close();
	}
	
	public static void main(String[] args) {
		
		JQuery_Frame_getText obj=new JQuery_Frame_getText();
		obj.applicationLaunch();
		obj.frameGetText();
		obj.applicationclose();
		
		
	}
	

}
