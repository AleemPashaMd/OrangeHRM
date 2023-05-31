package com.ExcelOpeations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {
	
	public static void main(String[] args) throws IOException {
		
		// Identifying the file(Excel File) in the System
		FileInputStream excelTestDataFile = new FileInputStream
												("./src/com/ExcelFiles/SingleTestData.xlsx");
		
		// Identify the workBook in the file(Excel File)
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
		
		// Identify a particular sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		
		// Identify the Row of the Sheet
		Row row=testDataSheet.getRow(0);
		
		// Identify the Row of a Cell
		 Cell rowOfCell=row.getCell(0);
		 
		 // get the data from the Row of a cell
		String testData=rowOfCell.getStringCellValue();
		 System.out.println(testData);
			
	}
}
