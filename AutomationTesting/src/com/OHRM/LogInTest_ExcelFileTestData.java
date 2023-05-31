package com.OHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest_ExcelFileTestData {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
			
			System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
			driver= new ChromeDriver();
			
			// Maximizing the Browser
			driver.manage().window().maximize();
							
			driver.get(applicationUrlAddress);
			
			FileInputStream excelTestDataFile = new FileInputStream("./src/com/ApplicationTestDataFiles/OrangeHRMApplicationTestDataFile.xlsx");
			XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
			XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
			
			Row testDataRow=testDataSheet.getRow(1);
			Cell userNametestDataRowOfCell=testDataRow.getCell(0);
			String userNameTestData=userNametestDataRowOfCell.getStringCellValue();
				
			System.out.println(" The UserName is :- "+userNameTestData);
			// String userNameTestData="srini";
			
			By userNameLocator=By.id("txtUsername"); // finding the property of an element
			WebElement userName=driver.findElement(userNameLocator);
			userName.sendKeys(userNameTestData);// Performing Operation on the element under test
			
			// String passwordTestData="Q@Trainer7";
			Cell passwordTestDataRowOfCell=testDataRow.getCell(1);
			String passwordTestData=passwordTestDataRowOfCell.getStringCellValue();
			
			System.out.println(" The Password is :- "+passwordTestData);
			
			By passwordLocator=By.name("txtPassword");
			WebElement password=driver.findElement(passwordLocator);
			password.sendKeys(passwordTestData);
			
			// <input type="submit"  class="button"  value="LOGIN">
			By logInPageLogInButton=By.className("button");
			WebElement logInPageButton=driver.findElement(logInPageLogInButton);
			logInPageButton.click();
			
			String expected_HomePageText="Admin";
			System.out.println(" The expected text of orangeHRM Application Home Page is :- "+expected_HomePageText);
			
			By welComeAdminLocator=By.id("welcome");
			WebElement welComeAdmin=driver.findElement(welComeAdminLocator);
			
			String actual_HomePageText=welComeAdmin.getText();
			System.out.println(" The actual text of orangeHRM Application HomePage is:- "+actual_HomePageText);
			
			if(actual_HomePageText.contains(expected_HomePageText))
			{
				System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS");
				
				Cell testResultCell=testDataRow.createCell(2);
				testResultCell.setCellValue("Successfully Navigated to OrangeHRM Application HomePage - PASS");
			}
			else
			{
				System.out.println(" Failed to navigate to OrangeHRM Application HomePage - FAIL");
				
				Cell testResultCell=testDataRow.createCell(2);
				testResultCell.setCellValue("Failed to navigate to OrangeHRM Application HomePage - FAIL");
				
			}
			
			FileOutputStream fileOutPut = new FileOutputStream("./src/com/ApplicationTestResultFiles/ApplicationTestResultFile.xlsx");
			workBook.write(fileOutPut);
			
			welComeAdmin.click();
			
			Thread.sleep(5000);
			
			By logOutLocator=By.linkText("Logout");
			WebElement logOut=driver.findElement(logOutLocator);
			logOut.click();
			
			driver.quit();		

		
	}

}
