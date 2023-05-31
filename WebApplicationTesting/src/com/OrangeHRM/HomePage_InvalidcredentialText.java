package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage_InvalidcredentialText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("aleem");
		
		driver.findElement(By.name("txtPassword")).sendKeys("Aleem@60");
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(5000);
        
        String expected_OrangeHRMHomePageinvalidcredentialText="invalid credential";
        System.out.println("The expected Text of the OrangeHRMHomePageinvalidcredential is:-"+expected_OrangeHRMHomePageinvalidcredentialText);
        
        By invalidcredentialLocator=By.id("spanMessage");
        WebElement invalidcredential=driver.findElement(invalidcredentialLocator);
        String actual_OrangeHRMHomePageinvalidcredentialText=invalidcredential.getText();
        System.out.println("The actual Text of the OrangeHRMHomePageinvalidcredential is:-"+actual_OrangeHRMHomePageinvalidcredentialText);
        
        if(actual_OrangeHRMHomePageinvalidcredentialText.equals(expected_OrangeHRMHomePageinvalidcredentialText))
        {
        	System.out.println("The text of the OrangeHRMHomePageinvalidcredential is matched:-PASS");
        }
        else
        {
        	System.out.println("The text of the OrangeHRMHomePageinvalidcredential is Not matched:-FAIL");
        }
        
        
		driver.close();
		
		
		
	}
}
