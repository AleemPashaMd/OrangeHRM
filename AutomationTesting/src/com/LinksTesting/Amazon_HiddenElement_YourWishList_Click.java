package com.LinksTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HiddenElement_YourWishList_Click {
	
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
		
			// Your Wish List - is a hidden/invisible Element
			// selenium webdriver cannot automate "Your Wish List" element directly - because
			//  this element is hidden under "Hello Sign In" element
			//Mouse hover Operation first done on "Hello Sign In" element and made it visible
			//     to Selenium WebDriver
			
			// Your Wish List element under Test 
			// The type of element is link
			
			// locator - linkText / PartialLinkText
			// selector - Your Wish List
		
		By yourWishListLocator=By.linkText("Your Wish List");
		WebElement yourWishList=driver.findElement(yourWishListLocator);
		yourWishList.click();
				
	}

}
