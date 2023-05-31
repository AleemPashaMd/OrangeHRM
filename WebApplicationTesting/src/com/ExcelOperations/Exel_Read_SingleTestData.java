package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Exel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream exelTestDataFile=new FileInputStream("./src/com/ExelFiles/SingleTestData.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(exelTestDataFile);
		
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		Row sheetOfRow=sheet.getRow(0);
		
		Cell rowOfCell=sheetOfRow.getCell(0);
		
		String testData=rowOfCell.getStringCellValue();
		System.out.println(" The data in the row of cell is:- "+ testData);
		
		
		
	}
}
