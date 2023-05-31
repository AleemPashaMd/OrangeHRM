package com.TimeAndDateApplication;

import java.io.FileInputStream;
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

public class WebTableCapturingCompleteData extends BaseTest{
 
	public void capturingCompleteDataTest() throws IOException
	{
		 FileInputStream excelTestDataFile=new FileInputStream("./src/com/ExelFiles/CapturingAllTheData.xlsx");
			XSSFWorkbook workBook=new XSSFWorkbook(excelTestDataFile);
		    XSSFSheet testDataSheet=workBook.getSheet("Sheet2");
		    
		    By webTableLocator=By.xpath("/html/body/div[5]/section[1]/div");
			WebElement webTable=driver.findElement(webTableLocator);
		    
		
        By webTableRowLocator=By.tagName("tr");
        List<WebElement> webTableRow=webTable.findElements(webTableRowLocator);
        // int webTableRowCount=webTableRow.size();
        // int rowCount=webTableRowCount-1;
         //System.out.println(row);
        
         for(int rowIndex=1;rowIndex<webTableRow.size();rowIndex++)
     		{
        	 Row row1=testDataSheet.createRow(rowIndex-1);
        	 
        	 By webTableColumnLocator=By.tagName("td");
        	 List<WebElement> webTableColumn=webTableRow.get(rowIndex).findElements(webTableColumnLocator);
        	// int webTableColumnCount=webTableColumn.size();
        	// System.out.println(columnCount);
        	//int columnCount=webTableColumnCount/rowCount;
        	
        	//System.out.println(columns);
			for(int columnIndex=0;columnIndex<webTableColumn.size();columnIndex++)
			{
				Cell rowOfCell=row1.createCell(columnIndex);
				
				//By cityNamesLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+columnIndex+"]");
				// cityNames=driver.findElement(cityNamesLocator);
				//String data=cityNames.getText();
				String data= webTableColumn.get(columnIndex).getText();
				
			    rowOfCell.setCellValue(data);	

				System.out.print(data+"   ");
			}
			System.out.println();
			 FileOutputStream outPutFile=new FileOutputStream("./src/com/ExelFiles/CapturingAllTheData.xlsx");
		 	 workBook.write(outPutFile);
		}
	}
	public static void main(String[] args) throws IOException {
		
		WebTableCapturingCompleteData completeData=new WebTableCapturingCompleteData();
		completeData.setUp();
		completeData.capturingCompleteDataTest();
		completeData.tearDown();
		
	}
}
