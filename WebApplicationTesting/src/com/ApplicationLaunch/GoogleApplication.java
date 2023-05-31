package com.ApplicationLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleApplication {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// driver object always point to current browser
		
	    driver.get("http://google.com"); // opens the google application on the browser
		driver.navigate().to("http://facebook.com");
		// facebook application will be opened on the same tab -because driver object is pointing to current browser
		// - it always point to the first TAB.
		
		 driver.close(); //close the browser
		//Both get navigate().to ()methods-opens/launches an application on the current browser     
		
		
		
		
		
	}
	
}
