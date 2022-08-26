package com.datadriven.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static ArrayList <LinkedHashMap<String,String>> al = new ArrayList <LinkedHashMap<String,String>>();
	
	public static void ReadExcel() throws IOException {
		
		 
		
		 File file = new File("C:\\Users\\91967\\eclipse-workspace\\youtube\\src\\test\\resources\\TestData\\New Microsoft Excel Worksheet.xlsx");
         FileInputStream fis = new FileInputStream(file);
         Workbook book = new XSSFWorkbook(fis);
         Sheet sheet = book.getSheet("Sheet3");
         
         ArrayList<String> header = new ArrayList<String>();
         
         Row row2 = sheet.getRow(0);
         for (int i=0; i<row2.getPhysicalNumberOfCells();i++)
         {
        	 Cell cell = row2.getCell(i);
             header.add(cell.getStringCellValue());
         }   
         for (int i=1;i<sheet.getPhysicalNumberOfRows();i++)
         {
        	 Row row = sheet.getRow(i);
        	 
        	 LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>();
        	 
        	 for (int j=0;j<row.getPhysicalNumberOfCells();j++)
        	 {
        		Cell cell = row.getCell(j);
        		String type = String.valueOf(cell.getCellType());
        		if (type.equals("STRING"))
        		{
        			String value = cell.getStringCellValue();
        			hm.put(header.get(j), value);
        		}
        		else if (type.equals("NUMERIC"))
        		{
        			if (DateUtil.isCellDateFormatted(cell))
        			{
        				Date date =cell.getDateCellValue();
        			    SimpleDateFormat form =	new SimpleDateFormat("dd-MM-yyyy");
        			    String value =	form.format(date);
        			    hm.put(header.get(j), value);
        			}
        			else
        			{
        				double cellvalue =cell.getNumericCellValue();	
        				long value = (long)cellvalue;
        				hm.put(header.get(j), String.valueOf(value));
        			}
        		}
        	    
        		
        	 }
        	 al.add(hm);
         }
        	 System.out.println(al);
            
	}

	}



