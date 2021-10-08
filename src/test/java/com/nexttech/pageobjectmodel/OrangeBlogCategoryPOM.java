package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeBlogCategoryPOM {

	WebDriver driver; // Global variable for WebDriver
	/*
	 *  Constructor is not a method but a special type of method
	 *  1. Constructor shouldn't have any return type.
	 *  2. Constructor Name and Class Name should be the same.
	 */

	public OrangeBlogCategoryPOM (WebDriver driver) {
		//This driver is a local driver inside the constructor.
		this.driver = driver; //Global driver = local driver
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="/html/body/div[4]/div/select") // Used 'id' locator to identify category dropdown
	WebElement type_email_home;
	public WebElement Category(){
		return type_email_home;
	}

	@FindBy(xpath="/html/body/footer/div[2]/div/div/div[2]/ul/li[2]/a") // Used 'xpath' locator to identify blog link
	WebElement click_blog;
	public WebElement Blog(){
		return click_blog;
	}
}
