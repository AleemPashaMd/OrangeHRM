package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTesting {
	
	public static void main(String[] args) {
		
		// Automating chrome browser                  // path of the chromedriverfile of the system
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		
		// Creating an object for the class
		// Classname object
		ChromeDriver driver=new ChromeDriver();
		// an object is a reference to the class / its a instance to the class
		
	}

}
