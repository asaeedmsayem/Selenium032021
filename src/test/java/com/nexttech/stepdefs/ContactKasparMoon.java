package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.ContactKasparMoonPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactKasparMoon {
	
	WebDriver driver;
	
	@Given("^user should visit kasparmoon homepage$")
	public void user_should_visit_kasparmoon_homepage() throws Throwable {
		
		//To open Chrome browser
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe");
					    driver = new ChromeDriver();
				       driver.get("https://kasparmoon.us"); //To open URL
	    
	}

	@Given("^user should click on contact$")
	public void user_should_click_on_contact() throws Throwable {
		// Created an Object to get methods from  PageObjectModel Class
		ContactKasparMoonPOM CP = new ContactKasparMoonPOM(driver);
		CP.Toggle().click(); // Click to open collapsed menu list to make Contact Option/button visible.
		CP.ContactPage().click(); //Click on the Contact Option/button from expanded menu to redirect to Contact page.
	    
	}

	@When("^user the type \"([^\"]*)\"$")
	public void user_the_type(String arg1) throws Throwable {
		// Created an Object to get methods from  PageObjectModel Class
		ContactKasparMoonPOM CP = new ContactKasparMoonPOM(driver);
		CP.Name().sendKeys(arg1); //Typing our Sample Data into the input box by using method and sendkeys' value (argument).
	    
	}

	@When("^user should type \"([^\"]*)\"$")
	public void user_should_type(String arg1) throws Throwable {
		// Created an Object to get methods from  PageObjectModel Class
		ContactKasparMoonPOM CP = new ContactKasparMoonPOM(driver);
		CP.Email().sendKeys(arg1); //Typing our Sample Data into the input box by using method and sendkeys' value (argument).
	}

	@When("^user should type a \"([^\"]*)\"$")
	public void user_should_type_a(String arg1) throws Throwable {
		// Created an Object to get methods from  PageObjectModel Class
		ContactKasparMoonPOM CP = new ContactKasparMoonPOM(driver);
		CP.Subject().sendKeys(arg1); //Typing our Sample Data into the input box by using method and sendkeys' value (argument).
	    
	}

	@When("^user type a \"([^\"]*)\"$")
	public void user_type_a(String arg1) throws Throwable {
		// Created an Object to get methods from  PageObjectModel Class
		ContactKasparMoonPOM CP = new ContactKasparMoonPOM(driver);
		CP.Message().sendKeys(arg1); //Typing our Sample Data into the input box by using method and sendkeys' value (argument).
	    
	}

	@Then("^user should click send button$")
	public void user_should_click_send_button() throws Throwable {
		// Created an Object to get methods from  PageObjectModel Class
		ContactKasparMoonPOM CP = new ContactKasparMoonPOM(driver);
		CP.Send().click(); //Click on the 'Send' button by using methods.
	    
	}
	

}
