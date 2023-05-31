package com.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_EmployeeListintoExcelFile  {
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
	}
	
	
	@Test(priority=1)
	public void ohrmLogIn() throws IOException
	{
		FileInputStream testDataFile=new FileInputStream("./src/com/ExelFiles/MultipleTestDataOHRM.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDatasheet=workBook.getSheet("Sheet2");
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
	}
	
	
	@Test(priority=2)
	public void pimEmployeeList() throws IOException
	{
		FileInputStream testDataFile=new FileInputStream("./src/com/ExelFiles/MultipleTestDataOHRM.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDatasheet=workBook.getSheet("Sheet2");
		
		By pimLocator=By.linkText("PIM");
		WebElement pim=driver.findElement(pimLocator);
		
		Actions pimAction=new Actions(driver);
		pimAction.moveToElement(pim).build().perform();
		
		By employeeListLocator=By.id("menu_pim_viewEmployeeList");
		WebElement employeeList=driver.findElement(employeeListLocator);
		employeeList.click();
		
		
		
		Row headerRow=testDatasheet.createRow(2);
		
		By webTableHeaderColumnCountLocator=By.tagName("th");
		List<WebElement> webTableHeaderColumnCount=driver.findElements(webTableHeaderColumnCountLocator);
		int headerColumnCount=webTableHeaderColumnCount.size();
		System.out.println(headerColumnCount);
		
		for(int webTableHeaderColumnIndex=1;webTableHeaderColumnIndex<=webTableHeaderColumnCount.size();webTableHeaderColumnIndex++)
		{
				
		Cell headerRowOfCell=headerRow.createCell(webTableHeaderColumnIndex-1);
				
		By employeeListWebTableHeaderLocator=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr/th["+webTableHeaderColumnIndex+"]");
		WebElement employeeListWebTableHeader=driver.findElement(employeeListWebTableHeaderLocator);
		String employeeListWebTableHeaderText=employeeListWebTableHeader.getText();
		System.out.print(employeeListWebTableHeaderText+" - ");
		
		headerRowOfCell.setCellValue(employeeListWebTableHeaderText+"-");
		
		}System.out.println();	
		
		By employeeListWebTableLocator=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody");
		WebElement employeeListWebTable=driver.findElement(employeeListWebTableLocator);
		
		By webTableRowsLocator=By.tagName("tr");
		List<WebElement> webTableRows=employeeListWebTable.findElements(webTableRowsLocator);
		
		for(int rowIndex=1;rowIndex<=webTableRows.size();rowIndex++)
		{
			Row row=testDatasheet.createRow(rowIndex+2);
			
			By webTableColumnsLocator=By.tagName("td");
			List<WebElement> webTableColumns=webTableRows.get(rowIndex-1).findElements(webTableColumnsLocator);
			int webTableColumnCount=webTableColumns.size();
			
			
		for(int columnIndex=0;columnIndex<webTableColumnCount;columnIndex++)
		{
			Cell rowOfCell=row.createCell(columnIndex);
			String employeeInformationText=webTableColumns.get(columnIndex).getText();
			
		System.out.print(employeeInformationText+"  _  ");
		
		rowOfCell.setCellValue(employeeInformationText+"-");
		
		}
		System.out.println();
		}
		FileOutputStream outPutFile=new FileOutputStream("./src/com/ExelFiles/MultipleTestDataOHRM.xlsx");
	 	 workBook.write(outPutFile);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
