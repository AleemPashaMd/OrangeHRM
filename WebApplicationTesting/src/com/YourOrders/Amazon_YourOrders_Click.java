package com.YourOrders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_YourOrders_Click {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="http://amazon.in";
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.get(applicationUrlAddress);
		
		By helloSigninLocator=By.id("nav-link-accountList-nav-line-1");
		WebElement helloSignin=driver.findElement(helloSigninLocator);
		
		Actions helloSigninAction=new Actions(driver);
		helloSigninAction.moveToElement(helloSignin).build().perform();
		
		By yourordesLocator=By.linkText("Your Orders");
		WebElement yourorder=driver.findElement(yourordesLocator);
		
		yourorder.click();
		driver.close();
	}

}
