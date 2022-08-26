package com.datadriven.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		 File file = new File("C:\\Users\\91967\\eclipse-workspace\\youtube\\src\\test\\resources\\TestData\\Hotel.xlsx");
         FileInputStream fis = new FileInputStream(file);
         Workbook book = new XSSFWorkbook(fis);
         Sheet sheet = book.getSheet("Sheet1");
         for (int i=0;i<sheet.getPhysicalNumberOfRows();i++)
         {
        	 Row row = sheet.getRow(i);
        	 for (int j=0;j<row.getPhysicalNumberOfCells();j++)
        	 {
        		Cell cell = row.getCell(j);
        		String type = String.valueOf(cell.getCellType());
        		if (type.equals("STRING"))
        		{
        			String name = cell.getStringCellValue();
        			System.out.println(name);
        		}
        		else if (type.equals("NUMERIC"))
        		{
        			if (DateUtil.isCellDateFormatted(cell))
        			{
        				Date date =cell.getDateCellValue();
        			    SimpleDateFormat form =	new SimpleDateFormat("dd-MM-yyyy");
        			    String value =	form.format(date);
        			}
        			else
        			{
        				double cellvalue =cell.getNumericCellValue();	
        				long value = (long)cellvalue;
        				System.out.println(value);
        			}
        		
        		}
        	 }
         
         }
	}

}
