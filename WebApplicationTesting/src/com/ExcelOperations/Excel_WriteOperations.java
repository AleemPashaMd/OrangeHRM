package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperations {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream excelTestDataFile=new FileInputStream("./src/com/ExelFiles/SingleTestData.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(excelTestDataFile);
		
	    XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
	    
	    Row newRow=testDataSheet.createRow(2);
	    
	    Cell newRowOfCell=newRow.createCell(3);
	    Cell newRowOfCell1=newRow.createCell(4);
	    
	    newRowOfCell.setCellValue("ExcelFile");
	    newRowOfCell.setCellValue("ExcelOperations");
	    newRowOfCell1.setCellValue("Eclipse");
	    
	    FileOutputStream fileOutPut=new FileOutputStream("./src/com/ExelFiles/SingleTestData.xlsx");
	    workBook.write(fileOutPut);
		
	}

	
}
