package com.datadriven.base;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcAlert extends BaseClass {

	public static void main(String[] args) {
		
	    launchBrowser("chrome");
        openApp("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997 ");
        maxi();
        iWait(6);
        switchframe("login_page");
		WebElement cont = driver.findElement(By.linkText("CONTINUE"));
		click(cont);
	    alertAccept();
	   
	}	
}


