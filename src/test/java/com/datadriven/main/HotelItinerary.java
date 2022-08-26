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

public class HotelItinerary {

	public static void main(String[] args) throws IOException {
		

		 ArrayList <LinkedHashMap<String,String>> al = new ArrayList <LinkedHashMap<String,String>>();
		
		File file = new File("C:\\Users\\91967\\eclipse-workspace\\youtube\\src\\test\\resources\\TestData\\Booked Itinerary.xlsx");
        FileInputStream fis = new FileInputStream(file);
        Workbook book = new XSSFWorkbook(fis);
        Sheet sheet = book.getSheet("Sheet1");
        
        ArrayList <String> header = new ArrayList<String>();
        
        Row row = sheet.getRow(0);
        for(int x=0; x<row.getPhysicalNumberOfCells();x++)
        {
       	 Cell cell = row.getCell(x);
       	 header.add(cell.getStringCellValue());	 
        }
       // System.out.println(header);

        for (int i=1;i<sheet.getPhysicalNumberOfRows();i++)
        {
       	 Row rows = sheet.getRow(i);
       	 
       	 LinkedHashMap <String,String> hm = new LinkedHashMap <String,String>();
       	 
       	 for (int j=0; j<rows.getPhysicalNumberOfCells();j++)
       	 {
       		Cell cell = rows.getCell(j);
       	    String type =String.valueOf(cell.getCellType());
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

       	    		SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy");
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
       	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
         
         
	


