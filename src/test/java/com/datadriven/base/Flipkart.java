package com.datadriven.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Login.page.FlipLoginPage;
import com.datadriven.main.Excel1;
import com.datadriven.main.ReadExcel;

public class Flipkart extends BaseClass {
   
	public static void main(String[]args) throws IOException { 
    	 
    	Excel1.ReadExcel();
    	launchBrowser("chrome");
        openApp("https://www.flipkart.com/ ");
        maxi();
        iWait(6);
        FlipLoginPage lp = new FlipLoginPage();
        
        sendkeys(lp.getUser(),Excel1.al.get(0).get("Username"));
        sendkeys(lp.getPass(),Excel1.al.get(0).get("passward"));
        lp.getLogin().click();
		
        closeBrowser();
       
	}   	    
}   
	
	
	

