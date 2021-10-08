package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMMenuPOM {
	WebDriver driver; // Global variable for WebDriver
	/*
	 *  Constructor is not a method but a special type of method
	 *  1. Constructor shouldn't have any return type.
	 *  2. Constructor Name and Class Name should be the same.
	 */

	public OrangeHRMMenuPOM (WebDriver driver) {
		//This driver is a local driver inside the constructor.
		this.driver = driver; //Global driver = local driver
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="/html/body/nav/div/div[2]/ul[1]/li[1]/a") // Used 'id' locator to identify category dropdown
	WebElement hover_platform;
	public WebElement Platform(){
		return hover_platform;
	}

	@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[1]/div/div[2]/div/a") // Used 'xpath' locator to identify blog link
	WebElement click_compare;
	public WebElement Compare(){
		return click_compare;
	}

}
