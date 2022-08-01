package com.list.t;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel { 
	
	public writeExcel(String path, String sheet, String[] dataToWrite) {
		
		File file = new File(path);
		FileInputStream input= new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet newSheet = workbook.getSheet(sheet);
		
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
		XSSFRow row= newSheet.getRow(0);
		XSSFRow newRow = newSheet.createRow(rowCount + 1);
		
		for(int i = 0; i < row.getLastCellNum(); i++) {
			XSSFCell newCell = newRow.createCell(i);
			newCell.setCellValue(dataToWrite[i]);
		}
		
		inputStream.close();
		
		FileOutputStream outputStream = newRow FileOutputStream(file);
		
		workbook.write(outputStream);
		
		outputStream.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}
	

}
