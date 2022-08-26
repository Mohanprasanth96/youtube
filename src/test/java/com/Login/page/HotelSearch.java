package com.Login.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.datadriven.base.BaseClass;

public class HotelSearch extends BaseClass {

	public HotelSearch() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement roomno;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childroom;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement search;
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement select;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement cont;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstname ;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastname ;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address ;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditcardno  ;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardtype  ;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement  selectmonth ;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement  selectyear ;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement  cvv ;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement booknow  ;
	
	@FindBy(id="my_itinerary")
	private WebElement myitinerary ;
	
	@FindBy(xpath="(//input[@class='select_text'])[1]")
	private WebElement orderno;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getSelectmonth() {
		return selectmonth;
	}

	public WebElement getSelectyear() {
		return selectyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}

	public WebElement getOrderno() {
		return orderno;
	}

	
	
}