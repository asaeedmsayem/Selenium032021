package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPOM {

	WebDriver driver; // Global variable for WebDriver
	/*
	 *  Constructor is not a method but a special type of method
	 *  1. Constructor shouldn't have any return type.
	 *  2. Constructor Name and Class Name should be the same.
	 */

	public FBLoginPOM (WebDriver driver) {
		//This driver is a local driver inside the constructor.
		this.driver = driver; //Global driver = local driver
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="email") // Used 'name' locator to identify input box
	WebElement type_username;
	public WebElement FBUserName(){
		return type_username;

	}

	@FindBy(id="pass") // Used 'id' locator to identify input box
	WebElement type_password;
	public WebElement FBPassword() {
		return type_password;
	}

	@FindBy(name="login") // Used 'name' locator to identify login button
	WebElement click_login;
	public WebElement LoginButton(){
		return click_login;
	}
	
}
