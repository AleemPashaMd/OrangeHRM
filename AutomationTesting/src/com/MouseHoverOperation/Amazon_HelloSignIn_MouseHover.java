package com.MouseHoverOperation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="http://amazon.in";
			
			System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
			driver= new ChromeDriver();
			
			// Maximizing the Browser
			driver.manage().window().maximize();
							
			driver.get(applicationUrlAddress);
			
			// Property of Hello SignIn Element
			// id="nav-link-accountList"
		
			By helloSignInLocator=By.id("nav-link-accountList");
			WebElement helloSignIn=driver.findElement(helloSignInLocator);
			
	// Actions class is used to perform both Mouse and KeyBoard related Key Operations
			
			Actions helloSignInAction = new Actions(driver);
			helloSignInAction.moveToElement(helloSignIn).build().perform();
			
			// build().perform() - will perform the operation on to the element
		
	}

}
