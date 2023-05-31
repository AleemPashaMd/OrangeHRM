package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Frames.JQuery_GetText;

public class JQuery_DragAndDrop extends JQuery_GetText {

	public void dragAndDropTest()
	{
		// id="droppable" - drop here element property
		
		By dropHereLocator=By.id("droppable");
		WebElement dropHere=driver.findElement(dropHereLocator);
		
		Actions dragAndDropAction = new Actions(driver);
		dragAndDropAction.dragAndDrop(dragMeToMyTargert, dropHere).build().perform();
		
	}
	
	public static void main(String[] args) {
		
		JQuery_DragAndDrop dragAndDrop = new JQuery_DragAndDrop();
		dragAndDrop.setUp();
		dragAndDrop.frame_dragMeToMyTargetText();
		dragAndDrop.dragAndDropTest();
		// dragAndDrop.tearDown();
	}
}
