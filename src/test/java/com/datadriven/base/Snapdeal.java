package com.datadriven.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal extends BaseClass {

	
	public static void main(String[] args)  {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions acc = new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		acc.moveToElement(women).perform();
		
		WebElement heels = driver.findElement(By.xpath("(//div[@class='colDataInnerBlk'])[4]//p[10]//a"));
		heels.click();
		
	}
}
