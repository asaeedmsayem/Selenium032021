package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KasparBlogPOM {
	
	WebDriver driver; // Global variable for WebDriver
	/*
	 *  Constructor is not a method but a special type of method
	 *  1. Constructor shouldn't have any return type.
	 *  2. Constructor Name and Class Name should be the same.
	 */
	
	public KasparBlogPOM (WebDriver driver) {
		//This driver is a local driver inside the constructor.
		this.driver = driver; //Gobal driver = local driver
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"menu-item-15\"]/a")
	   WebElement click_about_kaspar;
	
	   public WebElement AboutKaspar(){   
		   return click_about_kaspar;
	   }

}
