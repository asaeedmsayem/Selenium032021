package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCartPOM {
	
	WebDriver driver; // Global variable for WebDriver
	/*
	 *  Constructor is not a method but a special type of method
	 *  1. Constructor shouldn't have any return type.
	 *  2. Constructor Name and Class Name should be the same.
	 */

	public AmazonCartPOM (WebDriver driver) {
		//This driver is a local driver inside the constructor.
		this.driver = driver; //Global driver = local driver
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/span") // Used 'xpath' locator to identify account link
	WebElement clcik_amazon_login;
	public WebElement AmazonLogin(){
	return clcik_amazon_login;
	}
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement type_email;
	public WebElement AmazonEmail(){
	return type_email;
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input")
	WebElement click_continue;
	public WebElement AmazonContinue(){
	return click_continue;
	}
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement type_password;
	public WebElement AmazonPass(){
	return type_password;
	}
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	WebElement click_signin;
	public WebElement AmazonSignIn(){
	return click_signin;
	}
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement search_box;
	public WebElement AmazonSearchBox(){
	return search_box;
	}
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	WebElement click_search;
	public WebElement AmazonClickSearch(){
	return click_search;
	}
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")
	WebElement click_product;
	public WebElement AmazonProduct(){
	return click_product;
	}
	
	@FindBy(xpath="//*[@id=\"a-autoid-15-announce\"]/div/div[1]/p")
	WebElement click_ram_ssd;
	public WebElement AmazonProductCat(){
	return click_ram_ssd;
	}
	
	@FindBy(xpath="//*[@id=\"comparison_add_to_cart_button\"]/span/input")
	WebElement click_add_to_cart;
	public WebElement AmazonAddtoCart(){
	return click_add_to_cart;
	}
	
	@FindBy(xpath="//*[@id=\"attachSiNoCoverage\"]/span/input")
	WebElement click_no_thanks;
	public WebElement AmazonNo(){
	return click_no_thanks;
	}
	
	@FindBy(xpath="//*[@id=\"nav-cart\"]")
	WebElement click_cart;
	public WebElement AmazonCart(){
	return click_cart;
	}

}
