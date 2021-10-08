package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellProductMenuPOM {
	
	WebDriver driver; // Global variable for WebDriver
	/*
	 *  Constructor is not a method but a special type of method
	 *  1. Constructor shouldn't have any return type.
	 *  2. Constructor Name and Class Name should be the same.
	 */

	public DellProductMenuPOM (WebDriver driver) {
		//This driver is a local driver inside the constructor.
		this.driver = driver; //Global driver = local driver
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/main/header/div[2]/div[2]/nav/ul/li[1]/a") // Used 'Full Xpath' locator to identify Product Menu
	WebElement hover_product_menu;
	public WebElement ProductMenu(){
		return hover_product_menu;

	}

	@FindBy(xpath="/html/body/main/header/div[2]/div[2]/nav/ul/li[1]/ul/li[3]/a") // Used 'Full Xpath' locator to identify Laptop Submenu
	WebElement hover_laptop;
	public WebElement LaptopSub() {
		return hover_laptop;
	}

	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/ul/li[3]/ul/li[3]/a") // Used 'xpath' locator to identify For Home Option
	WebElement click_home;
	public WebElement ForHome(){
		return click_home;
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[1]/div[1]/a/svg") // Used 'xPath' locator to identify Dell Icon
	WebElement click_dell_icon;
	public WebElement DellIcon() {
		return click_dell_icon;
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[1]/ul/li[7]/a") // Used 'xPath' locator to identify Workstations Option
	WebElement click_workstations;
	public WebElement DellWordstations() {
		return click_workstations;
	}

}
