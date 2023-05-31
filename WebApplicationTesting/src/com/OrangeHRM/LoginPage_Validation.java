package com.OrangeHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage_Validation {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		String OHRMHomePageTitle=driver.getTitle();
		System.out.println("The title of the OHRMHomePage is:-"+OHRMHomePageTitle);

		String expected_OHRMHomePage="OrangeHRM";
		System.out.println("The expected title of the ORHMHomePage is:-"+expected_OHRMHomePage);
		String actual_ORHMHomePage=OHRMHomePageTitle;
		System.out.println("The expected title of the ORHMHomePage is:-"+actual_ORHMHomePage);
		
		
		
		if(actual_ORHMHomePage.equals(expected_OHRMHomePage))
		{
			System.out.println("The title of the OHRMHomePage is matched:-Pass");
		}
		else
		{
			System.out.println("The title of the OHRMHomePage is Not matched:-Fail");
		}
		
		String OHRMHomePageUrlAddress=driver.getCurrentUrl();
		System.out.println("The Url of the OHRMHomePage is:-"+OHRMHomePageUrlAddress);
		
		String expected_ORHMHomePageUrlAddress="orangehrm-4.2.0.1";
		System.out.println("The expected Url of the OHRMHomePage is:-"+expected_ORHMHomePageUrlAddress);
		String actual_ORHMHomePageUrlAddress=OHRMHomePageUrlAddress;
		System.out.println("The actual Url of the OHRMHomePage is:-"+OHRMHomePageUrlAddress);
		
		if(actual_ORHMHomePageUrlAddress.contains(expected_ORHMHomePageUrlAddress))
		{
			System.out.println("The Url of the OHRMHomePage is matched:-Pass");
		}
		else
		{
			System.out.println("The Url of the OHRMHomePage is Not matched:-Fail");
		}
		
		By LoginPanelLocator=By.id("logInPanelHeading");
		WebElement LoginPanel=driver.findElement(LoginPanelLocator);
		//String LoginPanelText=LoginPanel.getText();
		//System.out.println("The text of the WebElement Login on OHRMHomePage is:-"+LoginPanelText);
		
		
		String expected_OHRMHomePageLogInPanelText="LOGIN Panel";
		System.out.println("The expected Text of the OHRMHomePageLogInPanel is:-"+expected_OHRMHomePageLogInPanelText);
		String actual_OHRMHomePageLogInPanelText=LoginPanel.getText();
		System.out.println("The actual Text of the OHRMHomePageLogInPanel is:-"+actual_OHRMHomePageLogInPanelText);

        if(actual_OHRMHomePageLogInPanelText.equals(expected_OHRMHomePageLogInPanelText))
        {
        	System.out.println("The Text of the OHRMHomePageLogInPanel is matched :-Pass");
        }
        else
        {
        	System.out.println("The Text of the OHRMHomePageLogInPanel is Not matched :-Fail");
        }
		
        
        
		driver.close();
		
		
	}

}
