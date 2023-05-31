package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_Selection {

	WebDriver driver;
	String applicationUrlAddress="https://my.monsterindia.com/sponsered_popup.html";
		public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
		driver= new ChromeDriver();
			
	driver.manage().window().maximize();
	driver.get(applicationUrlAddress);
	}
	
	public void currentLocationTest()
	{
		// Identifying the Current Location DropDown Block
					// class="border_grey1" - property of Current Location DropDown
		By currentLocationDropDownLocator=By.className("border_grey1");
		WebElement currentLocationDropDown=driver.findElement(currentLocationDropDownLocator);
					
					/*
					 <option value="1">Ahmedabad</option>
					<option value="2">Bengaluru / Bangalore</option>
					<option value="3">Chennai</option>
					 */
				/*	
					
				By currentLocatoionDropDownOptionalValuesLocator=By.tagName("option");
	List<WebElement>currentLocatoionDropDownOptionalValues=
		currentLocationDropDown.findElements(currentLocatoionDropDownOptionalValuesLocator);
				
					// finding the size of the arrayList
				int currentLactionCitiesCount=currentLocatoionDropDownOptionalValues.size();
	System.out.println(" The Number of Cities in the Current Location Drop Down are :- "
																+currentLactionCitiesCount);
				
				// Getting all the names of the DropDown
				for(int index=0;index<currentLactionCitiesCount;index++)
				{
				String cityName=currentLocatoionDropDownOptionalValues.get(index).getText();
					System.out.println(index+" - "+cityName);
				}
			*/	
				// Selecting an Optional value from the dropDown	
		Select currentLocationSelection = new Select(currentLocationDropDown);
		currentLocationSelection.selectByIndex(3);//index starts with 0
		currentLocationSelection.selectByValue("491"); //value getting it from the property
currentLocationSelection.selectByVisibleText("Hyderabad / Secunderabad");//text of Optional value
		
	}
	
	public void industryDropDownTest()
	{

		// Automating Industry Element - dropDown
		// id="id_industry" - property of Indusrty DropDown
		
		By industryDropDownLocator=By.id("id_industry");
		WebElement industryDropDown=driver.findElement(industryDropDownLocator);
		
		Select industryDropDownSelection = new Select(industryDropDown);
		industryDropDownSelection.selectByIndex(1);
		industryDropDownSelection.selectByValue("4");
		industryDropDownSelection.selectByVisibleText("Banking/Accounting/Financial Services");
		
		//industryDropDownSelection.deselectAll();
		industryDropDownSelection.deselectByValue("5");
		industryDropDownSelection.deselectByIndex(2);
		industryDropDownSelection.deselectByVisibleText("Other");
	}
	public void applicationClose()
	{
		driver.quit();
	}
	
	public static void main(String[] args) {
		
		Monster_Selection obj = new Monster_Selection();
		obj.applicationLaunch();
		obj.currentLocationTest();
		obj.industryDropDownTest();
		obj.applicationClose();
		
	}

}
