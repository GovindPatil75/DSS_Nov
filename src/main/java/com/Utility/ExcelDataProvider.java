package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\DSS_Nov\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		wb=new XSSFWorkbook(file);
		
	}

	public String getStringData(String Sheetname,int row,int cell) {
		
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	public String getNumericData(String Sheetname,int row,int cell) {
		double data=wb.getSheet(Sheetname).getRow(row).getCell(cell).getNumericCellValue();
		String valuedata=String.valueOf(data).replace(".0", "");
		return valuedata;
		
	}
	
}
