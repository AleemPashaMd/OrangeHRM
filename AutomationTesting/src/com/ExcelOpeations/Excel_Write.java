package com.ExcelOpeations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {
	
	public static void main(String[] args) throws IOException {
		

		// Identifying the file(Excel File) in the System
		FileInputStream excelTestDataFile = new FileInputStream
												("./src/com/ExcelFiles/SingleTestData.xlsx");
		
		// Identify the workBook in the file(Excel File)
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
		
		// Identify a particular sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		
		Row newRow=testDataSheet.createRow(3);
		Cell newRowOfCell=newRow.createCell(2);
		
		newRowOfCell.setCellValue("LiveTech");
	newRowOfCell.setCellValue("WebDriver"); // data will be replaced in the same Row of Cell 
		
		Row newRowCreate=testDataSheet.createRow(3); // This statement will create the
		// same existing row again ( which will delete all the data of the row ) 
		// it will create the Row as new Row
		Cell newRowCreatedCell=newRowCreate.createCell(3); // new row of cell will be created
		newRowCreatedCell.setCellValue("Laddu");
		
	Cell newrowOfCell=newRowCreate.createCell(4); //In the existing row a new cell is created
		newrowOfCell.setCellValue("GulabJam");
		
	FileOutputStream fileOutPut = new FileOutputStream
									("./src/com/ExcelFiles/SingleTestData.xlsx");
		workBook.write(fileOutPut);
	
	}
}
