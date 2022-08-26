package com.Login.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.datadriven.base.BaseClass;

public class HotelLoginPage extends BaseClass {

	public HotelLoginPage() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="username")
	private WebElement user;
	
	

	public WebElement getMsg() {
		return msg;
	}

	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement msg;
	

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
		
    
				
	}

}


