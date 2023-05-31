package com.BrowsersAutomation;

//packages of selenium - related to classes
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowsersTesting {
	public static void main(String[] args) {
			// Automating FireFox Browser
													// path of the browser driver file
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\srinivas1\\Desktop\\April9amBatch\\WebApplicationTesting\\brwoserDriverFiles\\geckodriver.exe");
	//FirefoxDriver firefoxBrowser = new FirefoxDriver();
		
		// Automating MicroSoft Edge Browser
	//	System.setProperty("webdriver.edge.driver", "C:\\Users\\srinivas1\\Desktop\\April9amBatch\\WebApplicationTesting\\brwoserDriverFiles\\msedgedriver.exe");
	//	EdgeDriver edgeBrowser = new EdgeDriver();
		
		// Automating Opera Browser
	//	System.setProperty("webdriver.opera.driver", "./brwoserDriverFiles/operadriver.exe");
	//	OperaDriver operaBrowser = new OperaDriver();
		
	System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
	ChromeDriver chromeBrowser = new ChromeDriver();
		
	// Automating IE Browser - older version of IE Browser
	//	System.setProperty("webdriver.ie.driver", "./brwoserDriverFiles/IEDriverServer.exe");
	//	InternetExplorerDriver ieBrowser = new InternetExplorerDriver();
	}
}
