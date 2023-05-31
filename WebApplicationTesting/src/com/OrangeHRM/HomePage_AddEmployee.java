package com.OrangeHRM;

import java.io.FileInputStream;
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

public class HomePage_AddEmployee {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
		
		String OHRMHomePageTitle=driver.getTitle();

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
		By pimLocator=By.linkText("PIM");
		WebElement pim=driver.findElement(pimLocator);
		
		Actions pimAction=new Actions(driver);
		pimAction.moveToElement(pim).build().perform();
		//pim.click();
		
		By addEmployeeLocator=By.id("menu_pim_addEmployee");
		WebElement addEmployee=driver.findElement(addEmployeeLocator);
		
	    addEmployee.click();
		
		By fullNameLocator=By.className("hasTopFieldHelp");
		WebElement fullName=driver.findElement(fullNameLocator);
		
		String expected_FullNameTewxt="Full Name";
		System.out.println("The Expected Text Of The FullName is:- "+expected_FullNameTewxt);
		
		String actual_FullNameTewxt=fullName.getText();
		System.out.println("The Actual Text Of The FullName is:- "+actual_FullNameTewxt);
		
		if(actual_FullNameTewxt.equals(expected_FullNameTewxt))
		{
			System.out.println("The Text Of The FullName is Matched:- PASS");
		}
		else
		{
			System.out.println("The Text Of The FullName is Not Matched:- FAIL");
		}
		//By fieldsInLineLocator=By.className("fieldsInLine");
		//WebElement fieldsInLine=driver.findElement(fieldsInLineLocator);
		
		By firstNameLocator=By.id("firstName");
		WebElement firstName=driver.findElement(firstNameLocator);
		
		String expected_FirstName="Aleem";
		System.out.println("The Expected Text Of The FirstName is:- "+expected_FirstName);
		firstName.sendKeys(expected_FirstName);
		
		By middleNameLocator=By.id("middleName");
		WebElement middleName=driver.findElement(middleNameLocator);
		
		String expected_MiddleName="Pasha";
		System.out.println("The Expected Text Of The MiddleName is:- "+expected_MiddleName);
		middleName.sendKeys(expected_MiddleName);
		
		By lastNameLocator=By.id("lastName");
		WebElement lastName=driver.findElement(lastNameLocator);
		
		String expected_LastName="Mohammad";
		System.out.println("The Expected Text Of The LastName is:- "+expected_LastName);
		lastName.sendKeys(expected_LastName);
		
		By employeeIdLocator=By.id("employeeId");
		WebElement employeeId=driver.findElement(employeeIdLocator);
		String expected_EmpolyeeId=employeeId.getAttribute("value");
		System.out.println("The Expected Number of the EmployeeId is:-"+expected_EmpolyeeId);
		
		By saveLocator=By.id("btnSave");
		WebElement save=driver.findElement(saveLocator);
		
		
		
		save.click();
		
		By personalDetailsFirstNameLocator=By.id("personal_txtEmpFirstName");
		WebElement personalDetailsFirstName=driver.findElement(personalDetailsFirstNameLocator);
		String actual_FirstName=personalDetailsFirstName.getAttribute("value");
		System.out.println("The Actual Text Of The FirstName is:- "+actual_FirstName);
		
		By personalDetailsMiddleNameLocator=By.id("personal_txtEmpMiddleName");
		WebElement personalDetailsMiddleName=driver.findElement(personalDetailsMiddleNameLocator);
		String actual_MiddleName=personalDetailsMiddleName.getAttribute("value");
		System.out.println("The Actual Text Of The MiddleName is:-"+actual_MiddleName);
		
		By personalDetailsLastNameLocator=By.id("personal_txtEmpLastName");
		WebElement personalDetailsLastName=driver.findElement(personalDetailsLastNameLocator);
		String actual_LastName=personalDetailsLastName.getAttribute("value");
		System.out.println("The Actual Text Of The LastName is:-"+actual_LastName);
		
		By personalDetailsEmployeeIdLocator=By.id("personal_txtEmployeeId");
		WebElement personalDetailsEmployeeId=driver.findElement(personalDetailsEmployeeIdLocator);
		String actual_EmployeeId=personalDetailsEmployeeId.getAttribute("value");
		System.out.println("The Actual Number Of The EmployeeId is:-"+actual_EmployeeId);
		
		if(actual_FirstName.equals(expected_FirstName))
		{
			System.out.println("The Text Of The FirstName is Matched :- PASS");
		}
		else
		{
			System.out.println("The Text Of The FirstName is Not Matched :- FAIL");
		}
		
		if(actual_MiddleName.equals(expected_MiddleName))
		{
			System.out.println("The Text Of The MiddleName is Matched :- PASS");
		}
		else
		{
			System.out.println("The Text Of The MiddleName is Not Matched :- FAIL");
		}
		
		if(actual_LastName.equals(expected_LastName))
		{
			System.out.println("The Text Of The LastName is Matched :- PASS");
		}
		else
		{
			System.out.println("The Text Of The LastName is Not Matched :- FAIL");
		}
		
		if(actual_EmployeeId.equals(expected_EmpolyeeId))
		{
			System.out.println("The Number Of The EmployeeId is Matched - PASS");
		}
		else
		{
			System.out.println("The Number Of The EmployeeId is Not Matched - FAIL");
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
