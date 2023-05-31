package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_CapturingFirstRowOrFirstColumnData extends BaseTest {
	public void capturingFirstRowOrFirstColumnDataTest() throws IOException
	{
		
		FileInputStream testDataFile = new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		
		// tr - table Row
		// td - table data // column
		
		// First Row of First Cell
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		// First Row of Last Cell
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
		for(int index=1;index<=36;index++)
		{
		
	By cityNameLocator=By.xpath
	  ("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
		WebElement cityName=driver.findElement(cityNameLocator);
		String cityNameText=cityName.getText();
		
		// creating a new Row in the sheet
		Row newRow=testDataSheet.createRow(index-1);
		
		// Creating new Row of New Cell
		Cell newRowOfCell=newRow.createCell(0);
		
		// setting the value into the new Row of cell created
		newRowOfCell.setCellValue(cityNameText);
		
		System.out.println(index +"- "+cityNameText);
		
		FileOutputStream fileOutPut = new FileOutputStream("./src/com/ExcelFiles/WebTableFirstColoumTestData.xlsx");
		workBook.write(fileOutPut);
		
		}
	}
	
	public static void main(String[] args) throws IOException {
		
	WebTable_CapturingFirstRowOrFirstColumnData cityName = new
											WebTable_CapturingFirstRowOrFirstColumnData();
		cityName.setUp();
		cityName.capturingFirstRowOrFirstColumnDataTest();
		cityName.tearDown();
		
	}
}
