package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMMethods {
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	
	@Given("^User should launch chrome Browser$")
	public void user_should_launch_chrome_Browser()
	{
       System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		
	   driver=new ChromeDriver();
		
	   System.out.println("****Chrome Browser Launched Successfully ****");
	    
	}

	@When("^User should enter valid OrangeHRM Application Url Address$")
	public void user_should_enter_valid_OrangeHRM_Application_Url_Address()
	{
       driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Then("^User should be navigated to OrangeHRM Application LogIn Page$")
	public void user_should_be_navigated_to_OrangeHRM_Application_LogIn_Page() 
	{
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
		
		
		
	}

	@Then("^User should be close the Browser along with the Application$")
	public void user_should_be_close_the_Browser_along_with_the_Application() 
	{
		 driver.close();
		 System.out.println("****Close The Browser along with Application Successfully****");
		
	}

}
