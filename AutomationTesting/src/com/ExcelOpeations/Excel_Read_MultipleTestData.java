package com.ExcelOpeations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {
	
	public static void main(String[] args) throws IOException {
		

		// Identifying the file(Excel File) in the System
		FileInputStream excelTestDataFile = new FileInputStream
												("./src/com/ExcelFiles/MultipleTestData.xlsx");
		
		// Identify the workBook in the file(Excel File)
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
		
		// Identify a particular sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		
		// finding the Number of active Rows in the Sheet
		int activeRowsCount=testDataSheet.getLastRowNum();
		
		// to goto All the active Rows in the Sheet
		for(int activeRowIndex=0;activeRowIndex<=activeRowsCount;activeRowIndex++)
		{
			// goes to a particular active Row
			Row activeRow=testDataSheet.getRow(activeRowIndex);
			
			// of the current active Row - finding the number of active Row of Cells
			int activeRowOfCellsCount=activeRow.getLastCellNum();
			
			// To goto an active Row and get all the active Row of all the Cells values
	for(int activeRowOfCellIndex=0;
			activeRowOfCellIndex<activeRowOfCellsCount;
			activeRowOfCellIndex++)
			{
				// got to an active Row
				Row row=testDataSheet.getRow(activeRowIndex);
				// In an Active Row goes to all the active Cells
				Cell rowOfCell=row.getCell(activeRowOfCellIndex);

				// goes to every active Row of Cell and get the test data
				String testData=rowOfCell.getStringCellValue();
				System.out.print(testData+"  ");
			}
			System.out.println();
		}
	}
}
