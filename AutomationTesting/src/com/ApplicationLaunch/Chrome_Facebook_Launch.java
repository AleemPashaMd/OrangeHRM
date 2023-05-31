package com.ApplicationLaunch;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chrome_Facebook_Launch {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
		ChromeDriver chromeBrowser = new ChromeDriver();
		
		// chromeBrowser - its an object which points towards the current Browser
		chromeBrowser.get("http://gmail.com"); // will get gmail application on the Browser
		
		// Navigating to Facebook application
		chromeBrowser.navigate().to("http://facebook.com");
		
		// Navigating to google application
		chromeBrowser.navigate().to("http://google.com");
		
	// All the above applications will be opened on the chrome Browser - one after another
		     // in the same tab - because the object always points to the current Browser
		
		// chromeBrowser.close(); // is used to close the Browser - when it has a single tab
		
		chromeBrowser.quit(); // is used to close the browser opened with multiple tab's
	}

}
