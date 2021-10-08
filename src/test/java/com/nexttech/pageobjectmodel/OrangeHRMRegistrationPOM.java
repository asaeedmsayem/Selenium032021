package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMRegistrationPOM {
	
	WebDriver driver; // Global variable for WebDriver
	/*
	 *  Constructor is not a method but a special type of method
	 *  1. Constructor shouldn't have any return type.
	 *  2. Constructor Name and Class Name should be the same.
	 */

	public OrangeHRMRegistrationPOM (WebDriver driver) {
		//This driver is a local driver inside the constructor.
		this.driver = driver; //Global driver = local driver
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="myText") // Used 'id' locator to identify email input box in homepage
	WebElement type_email_home;
	public WebElement HomeEmail(){
		return type_email_home;
	}
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div/div/div/form/a/input") // Used 'xpath' locator to identify trial button
	WebElement click_trial;
	public WebElement HomeTrial(){
		return click_trial;
	}
	
	@FindBy(name="subdomain") // Used 'name' locator to identify username input box
	WebElement type_username;
	public WebElement Username(){
		return type_username;
	}
	
	@FindBy(id="Form_submitForm_Name") // Used 'id' locator to identify Name input box
	WebElement type_name;
	public WebElement YName(){
		return type_name;
	}
	
	@FindBy(name="Email") // Used 'name' locator to identify email input box
	WebElement type_email;
	public WebElement eMail() {
		return type_email;
	}
	
	@FindBy(name="Contact") // Used 'name' locator to identify phone input box
	WebElement type_phone;
	public WebElement myPhone() {
		return type_phone;
	}
	
	@FindBy(id="Form_submitForm_Country") // Used 'id' locator to identify country drop down list
	WebElement select_country;
	public WebElement myCountry() {
		return select_country;
	}
	
	@FindBy(name="SetDummyData") // Used 'name' locator to identify dummy data check box
	WebElement set_dummy_data;
	public WebElement Dummy() {
		return set_dummy_data;
	}
	
	//@FindBy(xpath="//*[@id=\"Nocaptcha-Form_submitForm_Captcha\"]/div/div/iframe") // Used 'xpath' locator to identify captcha
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div[2]/form/fieldset/div[8]/div/div/div/div/iframe") // Used 'xpath' locator to identify captcha
	WebElement check_captcha;
	public WebElement myCaptcha() {
		return check_captcha;
	}
	
	@FindBy(name="action_request") // Used 'name' locator to identify submit button
	WebElement click_submit;
	public WebElement Submit() {
		return click_submit;
	}

}
