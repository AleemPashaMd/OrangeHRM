package com.OrangeHRM;

import java.io.FileInputStream;
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
import org.openqa.selenium.interactions.Actions;

public class OHRM_TestWithExcelFile {
	
	Row testDataRow;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
		
		FileInputStream testDataFile=new FileInputStream("./src/com/ExelFiles/MultipleTestDataOHRM.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
		Row testDataRow=testDataSheet.getRow(1);
		
		Cell rowOfCell0=testDataRow.getCell(0);
		String expected_OHRMHomePageLoginPanelText=rowOfCell0.getStringCellValue();
		System.out.println("The Expected Text Of The OHRMHomePage LoginPanel is:-"+expected_OHRMHomePageLoginPanelText);
		
		By LoginPanelLocator=By.id("logInPanelHeading");
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
		Cell userNameTestDataRowOfCell=testDataRow.getCell(9);
		String userNameTestData=userNameTestDataRowOfCell.getStringCellValue();
		System.out.println("The UserName is:-"+userNameTestData);
		driver.findElement(By.id("txtUsername")).sendKeys(userNameTestData);
		
		Cell passwordTestDataRowOfCell1=testDataRow.getCell(10);
		String passwordTestData=passwordTestDataRowOfCell1.getStringCellValue();
		System.out.println("The Password is:-"+passwordTestData);
		driver.findElement(By.name("txtPassword")).sendKeys(passwordTestData);
		
		driver.findElement(By.className("button")).click();
		
		Cell rowOfCell11=testDataRow.getCell(11);
		String expected_OrangeHRMHomePageAdminText=rowOfCell11.getStringCellValue();
		System.out.println("The Expected Text Of The Admin Of OHRMHomePage is:- "+expected_OrangeHRMHomePageAdminText);
		
		By AdminLocator=By.linkText("Admin");
		WebElement Admin=driver.findElement(AdminLocator);
		
		String actual_OrangeHRMHomePageAdminTex=Admin.getText();
		Cell testDataOHRMHomePageAdminText=testDataRow.createCell(12);
		System.out.println("The Expected Text Of The Admin Of OHRMHomePage is:- "+actual_OrangeHRMHomePageAdminTex);
		testDataOHRMHomePageAdminText.setCellValue(actual_OrangeHRMHomePageAdminTex);
		
		if(actual_OrangeHRMHomePageAdminTex.equals(expected_OrangeHRMHomePageAdminText))
		{
			System.out.println("The Text Of The OHRMHomePage Admin is Matched - PASS ");
			Cell resultTestDataAdminText=testDataRow.createCell(13);
			resultTestDataAdminText.setCellValue("The Text Of The OHRMHomePage Admin is Matched - PASS");
		}
		else
		{
			System.out.println("The Text Of The OHRMHomePage Admin is Not Matched - FAIL ");
			Cell resultTestDataAdminText=testDataRow.createCell(13);
			resultTestDataAdminText.setCellValue("The Text Of The OHRMHomePage Admin is Not Matched - FAIL");
		}
		By pimLocator=By.linkText("PIM");
		WebElement pim=driver.findElement(pimLocator);
		
		Actions pimAction=new Actions(driver);
		pimAction.moveToElement(pim).build().perform();
		
		By addEmployeeLocator=By.id("menu_pim_addEmployee");
		WebElement addEmployee=driver.findElement(addEmployeeLocator);
		
	    addEmployee.click();
	    
	    Cell rowOfCell14=testDataRow.getCell(14);
	    String expected_FullNameText=rowOfCell14.getStringCellValue();
	    System.out.println("The Expected Text Of The FullName is :-"+expected_FullNameText);
	    
	    By fullNameLocator=By.className("hasTopFieldHelp");
		WebElement fullName=driver.findElement(fullNameLocator);
	    
	    Cell testDataOfFullNameText=testDataRow.createCell(15);
	    String actual_FullNameText=fullName.getText();
	    System.out.println("The Actual Text Of The FullName is:- "+actual_FullNameText);
	    testDataOfFullNameText.setCellValue(actual_FullNameText);
	    
	    if(actual_FullNameText.equals(expected_FullNameText))
	    {
	    	System.out.println("The Text Of The FullName is Matched - PASS");
	    	Cell testResultOfFullNameText=testDataRow.createCell(16);
	    	testResultOfFullNameText.setCellValue("The Text Of The FullName is Matched - PASS");
	    }
	    else
	    {
	    	System.out.println("The Text Of The FullName is Not Matched - FAIL");
	    	Cell testResultOfFullNameText=testDataRow.createCell(16);
	    	testResultOfFullNameText.setCellValue("The Text Of The FullName is Not Matched - FAIL");
	    }
	   
		//String expected_FirstName;
		//String expected_MiddleName;
		//String expected_LastName;
		//String expected_EmpolyeeId;
		
		for(int rowIndex=1;rowIndex<=10;rowIndex++)
		{
			 testDataRow=testDataSheet.getRow(rowIndex);
		
		
		//for(int rowOfCellIndex=17;rowOfCellIndex<=10;rowOfCellIndex++)
		//{
	    By firstNameLocator=By.id("firstName");
		WebElement firstName=driver.findElement(firstNameLocator);
			
			 
			
		Cell testDataOfFirstName=testDataRow.getCell(17);
		String expected_FirstName=testDataOfFirstName.getStringCellValue();
		System.out.println("The Expected Text Of The FirstName is:- "+expected_FirstName);
		firstName.sendKeys(expected_FirstName);
		
		
		By middleNameLocator=By.id("middleName");
		WebElement middleName=driver.findElement(middleNameLocator);
		
		Cell testDataOfMiddleName=testDataRow.getCell(20);
		String expected_MiddleName=testDataOfMiddleName.getStringCellValue();
		System.out.println("The Expected Text Of The MiddleName is:- "+expected_MiddleName);
		middleName.sendKeys(expected_MiddleName);
		
		By lastNameLocator=By.id("lastName");
		WebElement lastName=driver.findElement(lastNameLocator);
		
		Cell testDataOfLastName=testDataRow.getCell(23);
		String expected_LastName=testDataOfLastName.getStringCellValue();
		System.out.println("The Expected Text Of The LastName is:- "+expected_LastName);
		lastName.sendKeys(expected_LastName);
		
		By employeeIdLocator=By.id("employeeId");
		WebElement employeeId=driver.findElement(employeeIdLocator);
		String expected_EmpolyeeId=employeeId.getAttribute("value");
		System.out.println("The Expected Number of the EmployeeId is:-"+expected_EmpolyeeId);
		Cell testDataOfEmployeeId=testDataRow.createCell(26);
		testDataOfEmployeeId.setCellValue(expected_EmpolyeeId);
		
		By saveLocator=By.id("btnSave");
		WebElement save=driver.findElement(saveLocator);
		
		save.click();
		
		//Thread.sleep(5000);
		
		//pim=driver.findElement(pimLocator);
		//addEmployee=driver.findElement(addEmployeeLocator);
		//Thread.sleep(5000);
	
		
		By personalDetailsFirstNameLocator=By.id("personal_txtEmpFirstName");
		WebElement personalDetailsFirstName=driver.findElement(personalDetailsFirstNameLocator);
		
		Cell rowOfCell18=testDataRow.createCell(18);
		String actual_FirstName=personalDetailsFirstName.getAttribute("value");
		System.out.println("The Actual Text Of The FirstName is:- "+actual_FirstName);
		rowOfCell18.setCellValue(actual_FirstName);
		
		By personalDetailsMiddleNameLocator=By.id("personal_txtEmpMiddleName");
		WebElement personalDetailsMiddleName=driver.findElement(personalDetailsMiddleNameLocator);
		
		Cell rowOfCell21=testDataRow.createCell(21);
		String actual_MiddleName=personalDetailsMiddleName.getAttribute("value");
		System.out.println("The Actual Text Of The MiddleName is:-"+actual_MiddleName);
		rowOfCell21.setCellValue(actual_MiddleName);
		
		By personalDetailsLastNameLocator=By.id("personal_txtEmpLastName");
		WebElement personalDetailsLastName=driver.findElement(personalDetailsLastNameLocator);
		
		Cell rowOfCell24=testDataRow.createCell(24);
		String actual_LastName=personalDetailsLastName.getAttribute("value");
		System.out.println("The Actual Text Of The LastName is:-"+actual_LastName);
		rowOfCell24.setCellValue(actual_LastName);
		
		By personalDetailsEmployeeIdLocator=By.id("personal_txtEmployeeId");
		WebElement personalDetailsEmployeeId=driver.findElement(personalDetailsEmployeeIdLocator);
		String actual_EmployeeId=personalDetailsEmployeeId.getAttribute("value");
		System.out.println("The Actual Number Of The EmployeeId is:-"+actual_EmployeeId);
		Cell rowOfCell27=testDataRow.createCell(27);
		rowOfCell27.setCellValue(actual_EmployeeId);
		
		
		
		if(actual_FirstName.equals(expected_FirstName))
		{
			System.out.println("The Text Of The FirstName is Matched :- PASS");
			Cell testResultOfFirstName=testDataRow.createCell(19);
			testResultOfFirstName.setCellValue("The Text Of The FirstName is Matched :- PASS");
		}
		else
		{
			System.out.println("The Text Of The FirstName is Not Matched :- FAIL");
			Cell testResultOfFirstName=testDataRow.createCell(19);
			testResultOfFirstName.setCellValue("The Text Of The FirstName is Not Matched :- FAIL");
		}
		
		if(actual_MiddleName.equals(expected_MiddleName))
		{
			System.out.println("The Text Of The MiddleName is Matched :- PASS");
			Cell testResultOfMiddleName=testDataRow.createCell(22);
			testResultOfMiddleName.setCellValue("The Text Of The MiddleName is Matched :- PASS");
		}
		else
		{
			System.out.println("The Text Of The MiddleName is Not Matched :- FAIL");
			Cell testResultOfMiddleName=testDataRow.createCell(22);
			testResultOfMiddleName.setCellValue("The Text Of The MiddleName is Not Matched :- FAIL");
		}
		
		if(actual_LastName.equals(expected_LastName))
		{
			System.out.println("The Text Of The LastName is Matched :- PASS");
			Cell testResultOfLastName=testDataRow.createCell(25);
			testResultOfLastName.setCellValue("The Text Of The LastName is Matched :- PASS");
		}
		else
		{
			System.out.println("The Text Of The LastName is Not Matched :- FAIL");
			Cell testResultOfLastName=testDataRow.createCell(25);
			testResultOfLastName.setCellValue("The Text Of The LastName is Not Matched :- FAIL");
		}
		
		if(actual_EmployeeId.equals(expected_EmpolyeeId))
		{
			System.out.println("The Number Of The EmployeeId is Matched :- PASS");
			Cell testResultOfEmployeeId=testDataRow.createCell(28);
			testResultOfEmployeeId.setCellValue("The Number Of The EmployeeId is Matched :- PASS");
		}
		else
		{
			System.out.println("The Number Of The EmployeeId is Not Matched :- FAIL");
			Cell testResultOfEmployeeId=testDataRow.createCell(28);
			testResultOfEmployeeId.setCellValue("The Number Of The EmployeeId is Not Matched :- FAIL");
		}
		
	
		
		FileOutputStream fileOutPut=new FileOutputStream("./src/com/ExelFiles/MultipleTestDataOHRM.xlsx");
		workBook.write(fileOutPut);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(5000);
		}
		
		By WelcomeAdminLocator=By.id("welcome");
		WebElement WelcomeAdmin=driver.findElement(WelcomeAdminLocator);
		
        WelcomeAdmin.click();
		
		Thread.sleep(1000);
		
	    By LogoutLocator=By.linkText("Logout");
	    WebElement Logout=driver.findElement(LogoutLocator);
	  
	    Logout.click();
	    driver.quit();
		
	}

}
