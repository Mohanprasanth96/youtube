package com.datadriven.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Alert extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser("chrome");
        openApp("https://demoqa.com/alerts");
        maxi();
        iWait(10);
        WebElement alert = driver.findElement(By.id("alertButton"));
		click(alert);
        alertAccept();
        
        WebElement waitalert = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        click(waitalert);
        waitalertPresent(5);
        alertDismiss();
        
        WebElement confirm = driver.findElement(By.id("confirmButton"));
	    click(confirm);
	    alertDismiss();
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));
	    js.executeScript("arguments[0].click()",prompt);
		alertsendkeys("Mohan prasanth");  
	    
	    
	}

}
