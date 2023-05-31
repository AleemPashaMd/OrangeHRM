package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Frames.JQuery_GetText;

public class Test extends JQuery_GetText{
	
	
	public void dd()
	{
		
	// id="droppable" - drop here element property
	
	By dropHereLocator=By.id("droppable");
	WebElement dropHere=driver.findElement(dropHereLocator);
	
	Actions dragAndDropAction = new Actions(driver);
	dragAndDropAction.dragAndDrop(dragMeToMyTargert, dropHere).build().perform();
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.setUp();
		t.frame_dragMeToMyTargetText();
		t.dd();
		
	}

}
