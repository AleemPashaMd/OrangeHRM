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
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Capturing_DynamicWebTableData extends BaseTest {
	
	
	@Test
	public void getCompleteWebTableDataTest() throws IOException
	{
		FileInputStream excelTestDataFile = new FileInputStream("./src/com/ExelFiles/CapturingAllTheData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet2");

		
		By webTableLocator=By.xpath("/html/body/div[5]/section[1]/div");
		WebElement webTable=driver.findElement(webTableLocator);
		
		
		By rowsLocator=By.tagName("tr");
		List<WebElement>rows=webTable.findElements(rowsLocator);
		
		for(int rowIndex=1;rowIndex<rows.size();rowIndex++)
		{
			Row newRow=testDataSheet.createRow(rowIndex-1);
			
			By rowOfCellLocator=By.tagName("td");
			List<WebElement>rowOfCells=rows.get(rowIndex).findElements(rowOfCellLocator);
			
			for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCells.size();rowOfCellIndex++)
			{
				Cell newRowOfCell=newRow.createCell(rowOfCellIndex);
				String testData=rowOfCells.get(rowOfCellIndex).getText();
				
				newRowOfCell.setCellValue(testData);
				System.out.print(testData+"  ");
				
				FileOutputStream fileOutPut = new FileOutputStream
						("./src/com/ExelFiles/CapturingAllTheData.xlsx");
workBook.write(fileOutPut);
			}
			System.out.println();
		}
	}

}
