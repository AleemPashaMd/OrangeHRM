package com.OrangeHRMApplicationWebPagesTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationWebPages.OrangeHRMLogInPage;
import com.Utility.Log;

public class OrangeHRMLogInPageTest extends BaseTest {
	
	public OrangeHRMLogInPage logInPage;
	
	FileInputStream testDataFile;
	XSSFWorkbook workBook;
	XSSFSheet testDataSheet;
	Row testDataRow;

	@Test(priority=0,description="Validating LogIn page LogInPanel Text")
	public void validatingLogInPageTextTest()
	{
		 logInPage=new OrangeHRMLogInPage();
		 logInPage.validatingLogInPageText();
		 
		 Log.info(" Validating LogIn Page LogInPanel Text Successfull - Naviagated to LogIN Page");
		
	}
	
	@Test(priority=1,description="Validating LogIn Functionality")
	public void validatingLogInTest() throws IOException
	{
		testDataFile=new FileInputStream("./src/main/java/com/ApplicationTestResultFiles/OrangeHRMApplication_TestDataFile.xlsx");
		workBook=new XSSFWorkbook(testDataFile);
		testDataSheet=workBook.getSheet("Sheet1");
		
		for(int rowIndex=1;rowIndex<=5;rowIndex++)
		{
		testDataRow=testDataSheet.getRow(rowIndex);
		
		Cell rowOfCell9=testDataRow.getCell(9);
		Cell rowOfCell10=testDataRow.getCell(10);
		
		
		logInPage=new OrangeHRMLogInPage();
		logInPage.validatingLogIn(rowOfCell9.getStringCellValue(),rowOfCell10.getStringCellValue() );
		
		Log.info("Validation of LogIn functionality Successfull");
		}
	}
	
	@Test(priority=2,description="Validating LogIn Page Logo")
	public void validatingLogInPageLogoTest()
	{
		logInPage=new OrangeHRMLogInPage();
		logInPage.validatingLogInPageLogo();
		
		Log.info(" OrangeHRM Application LogIn Page Logo existing");
	}
	
}
