package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exel_Read_MultipleTestData {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream excelTestDataFile=new FileInputStream("./src/com/ExelFiles/MultipleTestData.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(excelTestDataFile);
		XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
		
		int rowCount=testDataSheet.getLastRowNum();
		
		for(int rowIndex=0;rowIndex<=rowCount;rowIndex++)
		{
			Row row=testDataSheet.getRow(rowIndex);
			
			int cellCount=row.getLastCellNum();
			
			for(int rowOfCellIndex=0;rowOfCellIndex<cellCount;rowOfCellIndex++)
			{
				Row activeRow=testDataSheet.getRow(rowIndex);
				Cell activeRowOfActiveCell=activeRow.getCell(rowOfCellIndex);
				String testData=activeRowOfActiveCell.getStringCellValue();
				System.out.print(testData+" ");
			
				
			}System.out.println();
			
			
		}
		
	}

}
