package com.list.t;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Struct;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
	public void name(String path, String sheet) throws FileNotFoundException {
		File file = new File(path);
		FileInputStream input= new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet newSheet = workbook.getSheet(sheet);
		
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
		for (int i= 0; i <= rowCount; i++) {
			XSSFRow row= newSheet.getRow(i);
			
			for (int j= 0; j<= row.getLastCellNum(); j++) {
				System.out.print(row.getCell(j).getStringCellValue() + "||");
				
			}
			
		}
		
	}
	
	public String cellValue(String path, String sheet, int rowNumber, int cellNumber ) {
		File file = new File(path);
		FileInputStream input= new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet newSheet = workbook.getSheet(sheet);
		
		XSSFRow row= newSheet.getRow(rowNumber);
		XSSFCell cell = row.getCell(cellNumber);
		return cell.getStringCellValue();
		
	}

}
