package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactKasparMoonPOM {
	
	WebDriver driver; // Global variable for WebDriver
	/*
	 *  Constructor is not a method but a special type of method
	 *  1. Constructor shouldn't have any return type.
	 *  2. Constructor Name and Class Name should be the same.
	 */
	
	public ContactKasparMoonPOM (WebDriver driver) {
		//This driver is a local driver inside the constructor.
		this.driver = driver; //Gobal driver = local driver
		PageFactory.initElements(driver, this);
	}
	
	  /*
	  * Used 'xpath' locator to identify Contact menu item
	  */
	  @FindBy(xpath="//*[@id=\"menu-item-10\"]/a")
	  WebElement click_contact;
	  //Created a method to click on the identified web element.
	  public WebElement ContactPage(){
	  return click_contact;
	   
	  }
	  
	  /*
	  * Used 'xpath' locator to identify collapsed menu button
	  */
	  @FindBy(xpath="//*[@id=\"site-navigation\"]/button")
	  WebElement click_button;
	  //Created a method to click on the identified web element.
	  public WebElement Toggle() {
		  return click_button;
	  }
	  
	  /*
	  * Used 'name' locator to identify input box to write name
	  */
	  @FindBy(name="your-name")
	  WebElement type_name;
	  //Created a method to type sample data into identified input box.
	  public WebElement Name(){
	  return type_name;
	  
	  }
	  
	  /*
	  * Used 'name' locator to identify input box to write email
	  */
	  @FindBy(name="your-email")
	  WebElement type_email;
	  //Created a method to type sample data into identified input box.
	  public WebElement Email(){
	  return type_email;
	  
	  }
	  
	  /*
	  * Used 'name' locator to identify input box to write subject
	  */
	  @FindBy(name="your-subject")
	  WebElement type_subject;
	  //Created a method to type sample data into identified input box.
	  public WebElement Subject(){
	  return type_subject;
	  
	  }
	  
	  /*
	  * Used 'name' locator to identify input box to write message
	  */
	  @FindBy(name="your-message")
	  WebElement type_message;
	  //Created a method to type sample data into identified input box.
	  public WebElement Message(){
	  return type_message;
	  
	  }
	  
	  /*
	  * Used 'xpath' locator to identify Send button to click on it
	  */
	  @FindBy(xpath="//*[@id=\"wpcf7-f429-p8-o1\"]/form/p[5]/input")
	  WebElement click_send;
	  //Created a method to click on the identified web element.
	  public WebElement Send(){
	  return click_send;
	  }

}
