package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_AboutUs_Click {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
			
			System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
			driver= new ChromeDriver();
			
			driver.manage().window().maximize();
							
			driver.get(applicationUrlAddress);
		
// <a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
			
		By aboutUsLocator=By.linkText("About Us");
		WebElement aboutUs=driver.findElement(aboutUsLocator);
		String aboutUsText=aboutUs.getText();
		System.out.println(aboutUsText);
		
		aboutUs.click();
		
		String aboutUsWebPageTitle=driver.getTitle();
		System.out.println(" The title of the WebPage is :- "+ aboutUsWebPageTitle);
		
		driver.quit();
		
			
	}

}
