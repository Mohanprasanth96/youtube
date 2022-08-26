package com.datadriven.base;

import java.io.IOException;

import com.Login.page.RedBusLoginPage;
import com.datadriven.main.Excel1;

public class RedBus extends BaseClass {

	public static void main(String[] args) throws IOException {
	
		Excel1.ReadExcel();
    	launchBrowser("chrome");
        openApp("https://www.redbus.in/ ");
        maxi();
        iWait(60);
        RedBusLoginPage rb = new RedBusLoginPage();
        rb.getIcon().click();
        rb.getSignin().click();
        switchframe(rb.getFrame());     
        sendkeys(rb.getMobile(),Excel1.al.get(0).get("Username"));
        switchframe(rb.getFrame1());  
        rb.getCheckbox().click();
        switchparentframe();
        elementbeclickable(40,rb.getOtp());
        click(rb.getOtp());
     
	}
}
