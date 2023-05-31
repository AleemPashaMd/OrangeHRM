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

public class WebTable_CapturingAllTheData extends BaseTest{
	
	public void capturingAllTheDataTest() throws IOException
	{
		 FileInputStream excelTestDataFile=new FileInputStream("./src/com/ExelFiles/CapturingAllTheData.xlsx");
			XSSFWorkbook workBook=new XSSFWorkbook(excelTestDataFile);
		    XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
		    
		for(int rowIndex=1;rowIndex<=36;rowIndex++)
		{
			Row row=testDataSheet.createRow(rowIndex-1);
			
			for(int columnIndex=1;columnIndex<=8;columnIndex++)
			{
				
				Cell rowOfCell=row.createCell(columnIndex-1);
				
			By cityNamesLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+columnIndex+"]");
			WebElement cityNames=driver.findElement(cityNamesLocator);
			String cityNamesText=cityNames.getText();
			
		    rowOfCell.setCellValue(cityNamesText);	
			System.out.print(cityNamesText+"     -     ");
			}
			System.out.println();
	}
		 FileOutputStream outPutFile=new FileOutputStream("./src/com/ExelFiles/CapturingAllTheData.xlsx");
	 	 workBook.write(outPutFile);
	}
	public static void main(String[] args) throws IOException {
		WebTable_CapturingAllTheData capturingAllTheData=new WebTable_CapturingAllTheData();
		capturingAllTheData.setUp();
		capturingAllTheData.capturingAllTheDataTest();
		capturingAllTheData.tearDown();
		
	}
}
