package com.TestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

public class LogInTest  extends BaseTest{
	
	FileInputStream testDataFile;
	FileOutputStream fileOutPut;
	XSSFWorkbook workBook;
	XSSFSheet testDatasheet;
	Row testDataRow;
	
	FileInputStream propertiesFile;
	Properties propertiesFilesProperty;
	
	@Test(priority=0,description="LogIn Page Validation Test")
	public void oHRMApplicationLogInPageValidationTest() throws IOException
	{
		testDataFile=new FileInputStream("./src/com/ApplicationTestDataFiles/OrangeHRMApplication_TestDataFile.xlsx");
		workBook=new XSSFWorkbook(testDataFile);
		testDatasheet=workBook.getSheet("Sheet1");
		testDataRow=testDatasheet.getRow(1);
		
	    propertiesFile=new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");
		propertiesFilesProperty=new Properties();
		propertiesFilesProperty.load(propertiesFile);
	    
		Cell rowOfCell0=testDataRow.getCell(0);
		String expected_OHRMHomePageLoginPanelText=rowOfCell0.getStringCellValue();
		System.out.println("The Expected Text Of The OHRMHomePage LoginPanel is:-"+expected_OHRMHomePageLoginPanelText);
		
		By LoginPanelLocator=By.id(propertiesFilesProperty.getProperty("orangeHRMApplicationLoginPageLogInPanelProperty"));
		WebElement LoginPanel=driver.findElement(LoginPanelLocator);
		String actual_OHRMHomePageLoginPanelText=LoginPanel.getText();
		System.out.println("The ACtual Text Of The OHRMHomePage LoginPanel is:-"+actual_OHRMHomePageLoginPanelText);
		
		Cell testDataOHRMHomePageLoginPanelText=testDataRow.createCell(1);
		testDataOHRMHomePageLoginPanelText.setCellValue(actual_OHRMHomePageLoginPanelText);
		if(actual_OHRMHomePageLoginPanelText.equals(expected_OHRMHomePageLoginPanelText))
		{
			System.out.println("The Text of The OHRMHomePage LOgIn Panel is Matched - PASS");
			Cell resultTestDataLoginPanelText=testDataRow.createCell(2);
			resultTestDataLoginPanelText.setCellValue("The Text of The OHRMHomePage LOgIn Panel is Matched - PASS");
		}
		else
		{
			System.out.println("The Text of The OHRMHomePage LOgIn Panel is Not Matched - FAIL");
			Cell resultTestDataLoginPanelText=testDataRow.createCell(2);
			resultTestDataLoginPanelText.setCellValue("The Text of The OHRMHomePage LOgIn Panel is Not Matched - FAIL");
		}
		
		Cell rowOfCell3=testDataRow.getCell(3);
		String expected_OHRMHomePageTitle=rowOfCell3.getStringCellValue();
		System.out.println("The Expected Title Of The OHRMHomePage Text is:-"+expected_OHRMHomePageTitle);
		
		String actual_OHRMHomePageTitle=driver.getTitle();
		System.out.println("The Actual Title Of The OHRMHomePage Text is:-"+actual_OHRMHomePageTitle);
		
		Cell testDataOhrmHomePageTitle=testDataRow.createCell(4);
		testDataOhrmHomePageTitle.setCellValue(actual_OHRMHomePageTitle);
		
		if(actual_OHRMHomePageTitle.equals(expected_OHRMHomePageTitle))
		{
			System.out.println("The Title of the OrangeHRMHomePage is matched:-PASS");
			Cell resultTestDataTitle=testDataRow.createCell(5);
			resultTestDataTitle.setCellValue("The Title of the OrangeHRMHomePage is matched:-PASS");
		}
		else
		{
			System.out.println("The Title of the OrangeHRMHomePage is Not matched:-FAIL");
			Cell resultTestDataTitle=testDataRow.createCell(5);
			resultTestDataTitle.setCellValue("The Title of the OrangeHRMHomePage is matched:-FAIL");
		}
		
		Cell rowOfCell6=testDataRow.getCell(6);
		String expected_OHRMHomePageUrl=rowOfCell6.getStringCellValue();
		System.out.println("The Expected Url Of The OHRMHomePage is:-"+expected_OHRMHomePageUrl);
		
		String actual_OHRMHomePageUrl=driver.getCurrentUrl();
		Cell testDataOhrmHomePageUrl=testDataRow.createCell(7);
		System.out.println("The Actual Url Of The OHRMHomePage is:-"+actual_OHRMHomePageUrl);
		testDataOhrmHomePageUrl.setCellValue(actual_OHRMHomePageUrl);
		
		if(actual_OHRMHomePageUrl.contains(expected_OHRMHomePageUrl))
		{
			System.out.println("The Url of The OHRMHomePage is Matched - PASS");
			Cell resultTestDataUrl=testDataRow.createCell(8);
			resultTestDataUrl.setCellValue("The Url of The OHRMHomePage is Matched - PASS");
		}
		else
		{
			System.out.println("The Url of The OHRMHomePage is Not Matched - FAIL");
			Cell resultTestDataUrl=testDataRow.createCell(8);
			resultTestDataUrl.setCellValue("The Url of The OHRMHomePage is Not Matched - FAIL");
		}
	}
		
		@Test(priority=1,description="LogIn Test")
		public void oHRMApplicationLogInPageLogInTest() throws IOException, InterruptedException
		{
		
			for(int rowIndex=1;rowIndex<=5;rowIndex++)
			{
				
			testDataRow=testDatasheet.getRow(rowIndex);
				
		Cell userNameTestDataRowOfCell=testDataRow.getCell(9);
		String userNameTestData=userNameTestDataRowOfCell.getStringCellValue();
		System.out.println("The UserName is:-"+userNameTestData);
		driver.findElement(By.id(propertiesFilesProperty.getProperty("userNameElementProperty"))).sendKeys(userNameTestData);
		
		Cell passwordTestDataRowOfCell1=testDataRow.getCell(10);
		String passwordTestData=passwordTestDataRowOfCell1.getStringCellValue();
		System.out.println("The Password is:-"+passwordTestData);
		driver.findElement(By.id(propertiesFilesProperty.getProperty("passwordElementProperty"))).sendKeys(passwordTestData);
		
		driver.findElement(By.className(propertiesFilesProperty.getProperty("logInElementProperty"))).click();
	
	fileOutPut=new FileOutputStream("./src/com/ApplicationTestResultFiles/LogInPageResults.xlsx");
	workBook.write(fileOutPut);
	
			}
		}
		
		
		
	@Test(priority=8,description="LogOut Test")
	private void oHRMApplicationHomePagelogOutTest() throws InterruptedException
	{
		By WelcomeAdminLocator=By.id(propertiesFilesProperty.getProperty("welcomeAdminElementProperty"));
		WebElement WelcomeAdmin=driver.findElement(WelcomeAdminLocator);
		
        WelcomeAdmin.click();
		
		Thread.sleep(1000);
		
	    By LogoutLocator=By.linkText(propertiesFilesProperty.getProperty("logoutElementProperty"));
	    WebElement Logout=driver.findElement(LogoutLocator);
	  
	    Logout.click();
	   // Thread.sleep(5000);
			
	}
}
