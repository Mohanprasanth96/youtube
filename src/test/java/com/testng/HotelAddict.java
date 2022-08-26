package com.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import com.Login.page.HotelLoginPage;
import com.Login.page.HotelSearch;
import com.datadriven.base.BaseClass;

public class HotelAddict extends BaseClass {

		HotelLoginPage lp;
		HotelSearch hs;
		
		@DataProvider(name="data")
		public Object[][] data()
		{
			return new Object[][] {{"9677680225","NTP42F"}};
		}
		
		@BeforeClass 
		@Parameters("browser")
		public void BeforeClass(String Browser) {
		launchBrowser(Browser);
	    lp = new HotelLoginPage();
		hs=new HotelSearch();
		}
		
        @AfterClass
        public void Afterclass() {
           click(hs.getSelect());
           click(hs.getCont());
           sendkeys(hs.getFirstname(), "Mohan");
           sendkeys(hs.getLastname(), "prasanth");
           sendkeys(hs.getAddress(), "abcdefgh");
           sendkeys(hs.getCreditcardno(), "1234567891234567");
           dropdown(hs.getCardtype(), 2);
           dropdown(hs.getSelectmonth(), 12);
           dropdown(hs.getSelectyear(), 12);
           sendkeys(hs.getCvv(), "125");
           click(hs.getBooknow());	
           click(hs.getMyitinerary());
	       getAttribute(hs.getOrderno(), "value");	
        } 
        
        @AfterTest
        public void AfterTest () {
        	closeBrowser();
        	
        }
        
		@BeforeMethod
		@Parameters("url")
		public void BeforeMethod (String url) {
		openApp(url);
		iWait(60);
		}
		
        @AfterMethod
        public void AfterMethod() {
        	String expected="Logout";
        	String actual = lp.getMsg().getText();
        	System.out.println(actual);
        	boolean equals= actual.equals(expected);
        	Assert.assertTrue(equals);
        	System.out.println(equals);
        	dropdown(hs.getLocation(),2);
        	dropdown(hs.getHotel(),2);
        	dropdown(hs.getRoomtype(),2);
        	dropdown(hs.getRoomno(),2);
        	dropdown(hs.getAdultroom(),2);
        	dropdown(hs.getChildroom(),2);
        	click(hs.getSearch());
        }
	    
        @Test (dataProvider = "data")
        public void login(String username, String passward) throws InterruptedException {
        	sendkeys(lp.getUser(), username);
        	sendkeys(lp.getPass(), passward);
        	click(lp.getLogin());
        	        	
        }    	      
   }


