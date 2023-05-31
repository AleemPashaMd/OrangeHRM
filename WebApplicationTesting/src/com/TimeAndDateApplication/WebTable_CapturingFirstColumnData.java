package com.TimeAndDateApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_CapturingFirstColumnData extends BaseTest {

	public void capturingFirstColumnDataTest() throws IOException 
	{
		FileInputStream testDataFile=new FileInputStream("./src/com/ExelFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
		
		 for(int index=1;index<=36;index++)
			{
			 Row row=testDataSheet.createRow(index-1);
			  Cell rowOfCell=row.createCell(0);
				
		  By cityNamesLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
		  WebElement cityNames=driver.findElement(cityNamesLocator);
		  String cityNamesText=cityNames.getText();
			
		  rowOfCell.setCellValue(cityNamesText);
		  System.out.println(index+" _ "+cityNamesText);
			}
		 FileOutputStream fileOutPut=new FileOutputStream("./src/com/ExelFiles/CapturingFirstColumnData.xlsx");
		 workBook.write(fileOutPut);
		
	}
	public static void main(String[] args) throws IOException  {
		
		WebTable_CapturingFirstColumnData capturingFirstColumnData=new WebTable_CapturingFirstColumnData();
		capturingFirstColumnData.setUp();
		capturingFirstColumnData.capturingFirstColumnDataTest();
		capturingFirstColumnData.tearDown();
		
	}
}
