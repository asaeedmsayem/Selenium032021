package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSignUpPOM {
	WebDriver driver; // Global variable for WebDriver
	/*
	 *  Constructor is not a method but a special type of method
	 *  1. Constructor shouldn't have any return type.
	 *  2. Constructor Name and Class Name should be the same.
	 */

	public FBSignUpPOM (WebDriver driver) {
		//This driver is a local driver inside the constructor.
		this.driver = driver; //Global driver = local driver
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a") // Used 'Full Xpath' locator to identify input box
	WebElement click_create_account;
	public WebElement CreateACButtom(){
		return click_create_account;

	}

	@FindBy(name="firstname") // Used 'name' locator to identify input box
	WebElement type_firstname;
	public WebElement Firstname() {
		return type_firstname;
	}

	@FindBy(name="lastname") // Used 'name' locator to identify login button
	WebElement type_lastname;
	public WebElement Lastname(){
		return type_lastname;
	}
	
	@FindBy(name="reg_email__") // Used 'name' locator to identify input box
	WebElement type_email;
	public WebElement Email() {
		return type_email;
	}
	
	@FindBy(name="reg_email_confirmation__") // Used 'name' locator to identify input box
	WebElement type_confirm_email;
	public WebElement ConfirmEmail() {
		return type_confirm_email;
	}

	@FindBy(name="reg_passwd__") // Used 'name' locator to identify login button
	WebElement type_password;
	public WebElement Password(){
		return type_password;
	}
	
	@FindBy(name="birthday_month") // Used 'name' locator to identify login button
	WebElement select_month;
	public WebElement Month() {
		return select_month;
	}
	
	@FindBy(name="birthday_day") // Used 'name' locator to identify login button
	WebElement select_day;
	public WebElement Day() {
		return select_day;
	}
	
	@FindBy(name="birthday_year") // Used 'name' locator to identify login button
	WebElement select_year;
	public WebElement Year() {
		return select_year;
	}
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input") // Used 'xpath' locator to identify login button
	WebElement select_sex;
	public WebElement Sex() {
		return select_sex;
	}
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[10]/button") // Used 'xpath' locator to identify login button
	WebElement click_submit;
	public WebElement Submit() {
		return click_submit;
	}

}
