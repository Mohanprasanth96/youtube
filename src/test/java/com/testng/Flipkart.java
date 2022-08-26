package com.testng;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Login.page.FlipLoginPage;
import com.datadriven.base.BaseClass;

public class Flipkart extends BaseClass {
		
	    FlipLoginPage lp;
	    
	    @DataProvider(name="data")
	    public Object[][] data()
	    {
	    	return new Object[][] {{"9677680225","Mohan@19"}};
	    }
	    @BeforeClass 
	    @Parameters("browser") 
	    public void Sample1 (String Browser) {
		launchBrowser(Browser);
		lp = new FlipLoginPage();
	    }
	    
	    @AfterClass 
	    public void afterclass () {
		//closeBrowser();
	    }
	    
	    @BeforeMethod 
	    @Parameters("url")
	    public void Sample3 (String url) {
		openApp(url);
	    }
	    
	    @AfterMethod 
	    public void aftermethod () {
		System.out.println("After Method");
		String actual = lp.getMsg().getText();
		System.out.println(actual);
		String expected = "Your username or password is incorrect";
		Assert.assertEquals(actual, expected);
		
	    }
	    
		@Test (dataProvider = "data")
		public void login(String username,String passward) throws InterruptedException {
			sendkeys(lp.getUser(),username);
			sendkeys(lp.getPass(), passward);
			click(lp.getLogin());
			Thread.sleep(20000);
		}				
}
		
	


