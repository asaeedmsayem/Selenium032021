package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellerPOM {
	WebDriver driver; // Global variable for WebDriver
	/*
	 *  Constructor is not a method but a special type of method
	 *  1. Constructor shouldn't have any return type.
	 *  2. Constructor Name and Class Name should be the same.
	 */
	
	public BestSellerPOM (WebDriver driver) {
		//This driver is a local driver inside the constructor.
		this.driver = driver; //Gobal driver = local driver
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers_8a080d3d7b55497ea1bdd97b7cff8b7b\"]")
	   WebElement click_bestseller;
	
	   public WebElement bestseller(){   
		   return click_bestseller;
	   }
}