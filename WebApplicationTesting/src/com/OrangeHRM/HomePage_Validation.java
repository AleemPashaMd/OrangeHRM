package com.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverAction;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage_Validation {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
		
		FileInputStream testDataFile=new FileInputStream("./src/com/ExelFiles/WriteOperation.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDatasheet=workBook.getSheet("Sheet1");
		Row testDataRow=testDatasheet.getRow(1);
		
		Cell userNameTestDataRowOfCell=testDataRow.getCell(0);
		String userNameTestData=userNameTestDataRowOfCell.getStringCellValue();
		System.out.println("The UserName is:-"+userNameTestData);
		driver.findElement(By.id("txtUsername")).sendKeys(userNameTestData);
		
		Cell passwordTestDataRowOfCell1=testDataRow.getCell(1);
		String passwordTestData=passwordTestDataRowOfCell1.getStringCellValue();
		System.out.println("The Password is:-"+passwordTestData);
		driver.findElement(By.name("txtPassword")).sendKeys(passwordTestData);
		
		 
		
		driver.findElement(By.className("button")).click();
		
		
		
		String expected_OrangeHRMHomePageTitle="OrangeHRM";
		System.out.println("The expected Title of the OrangeHRMHomePage is:-"+expected_OrangeHRMHomePageTitle);
		String actual_OrangeHRMHomePageTitle=driver.getTitle();
		System.out.println("The actual Title of the OrangeHRMHomePage is:-"+actual_OrangeHRMHomePageTitle);
		
		if(actual_OrangeHRMHomePageTitle.equals(expected_OrangeHRMHomePageTitle))
		{
			System.out.println("The Title of the OrangeHRMHomePage is matched:-Pass");
		}
		else
		{
			System.out.println("The Title of the OrangeHRMHomePage is Not matched:-Fail");
		}
		By AdminLocator=By.linkText("Admin");
		WebElement Admin=driver.findElement(AdminLocator);
		
		String expected_OrangeHRMHomePageText="Admin";
		System.out.println("The expected Title of the OrangeHRMHomePage is:-"+expected_OrangeHRMHomePageText);
		String actual_OrangeHRMHomePageText=Admin.getText();
		System.out.println("The actual Title of the OrangeHRMHomePage is:-"+actual_OrangeHRMHomePageText);
		
		if(actual_OrangeHRMHomePageText.equals(expected_OrangeHRMHomePageText))
		{
			System.out.println("The Text of the OrangeHRMHomePage is  matched:-Pass");
		}
		else
		{
			System.out.println("The Text of the OrangeHRMHomePage is Not matched:-Fail");
		}
		
		By WelcomeAdminLocator=By.id("welcome");
		WebElement WelcomeAdmin=driver.findElement(WelcomeAdminLocator);
		
		String expected_OrangeHRMHomePagewelcomeText="Admin";
		System.out.println("The text of the OrangeHRMHomePagewelcomeText is:-"+expected_OrangeHRMHomePagewelcomeText);
		String actual_OrangeHRMHomePagewelcomeText=WelcomeAdmin.getText();
		System.out.println("The text of the OrangeHRMHomePagewelcomeText is:-"+actual_OrangeHRMHomePagewelcomeText);
		
		if(actual_OrangeHRMHomePagewelcomeText.contains(expected_OrangeHRMHomePagewelcomeText))
		{
			System.out.println("The expected of the OrangeHRMHomePagewelcomeText is matched:-PASS");
			Cell resultTestDataRowOfCell=testDataRow.createCell(2);
			resultTestDataRowOfCell.setCellValue("The expected of the OrangeHRMHomePagewelcomeText is matched:-PASS");
			
		}
		else
		{
			System.out.println("The expected of the OrangeHRMHomePagewelcomeText is Not matched:-FAIL");
			Cell resultTestDataRowOfCell=testDataRow.createCell(2);
			resultTestDataRowOfCell.setCellValue("The expected of the OrangeHRMHomePagewelcomeText is matched:-FAIL");	
		}
		FileOutputStream fileOutPut=new FileOutputStream("./src/com/ExelFiles/WriteOperation.xlsx");
		workBook.write(fileOutPut);
		
		WelcomeAdmin.click();
		
		Thread.sleep(1000);
		
	    By LogoutLocator=By.linkText("Logout");
	    WebElement Logout=driver.findElement(LogoutLocator);
	  
	    Logout.click();
	    Thread.sleep(1000);
	    driver.quit();
		
	}
	

}
