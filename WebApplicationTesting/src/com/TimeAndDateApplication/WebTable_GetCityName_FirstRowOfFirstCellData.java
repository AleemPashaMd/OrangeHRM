package com.TimeAndDateApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_GetCityName_FirstRowOfFirstCellData {
	
	
	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	
    public void setUp()
    {
    	System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationUrlAddress);
    }
    public void tearDown()
    {
    	driver.close();
    }
    public void getCityNameText()
    {
    	By cityNameLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
    	WebElement cityName=driver.findElement(cityNameLocator);
    	
    	String cityNameText=cityName.getText();
    	System.out.println("The Text Of The CityName is:-"+cityNameText);
    }
    
    
    
    public static void main(String[] args) {
		
    	WebTable_GetCityName_FirstRowOfFirstCellData cityName=new WebTable_GetCityName_FirstRowOfFirstCellData();
    	cityName.setUp();
    	cityName.getCityNameText();
    	cityName.tearDown();
	}
    
}
