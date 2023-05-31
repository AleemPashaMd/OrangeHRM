package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserAutomation {
	
	public static void main(String[] args) {
		
		// Automating chrome browser
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		ChromeDriver chromedriver=new ChromeDriver();
		
		// Automating msedge browser
				System.setProperty("webdriver.edge.driver","./browserDriverFiles/msedgedriver.exe");
				EdgeDriver edgedriver=new EdgeDriver();
				
		// Automating opera browser
		System.setProperty("webdriver.opera.driver","./browserDriverFiles/operadriver.exe");
		OperaDriver operadriver=new OperaDriver();
		
		
	}

}
