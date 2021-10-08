package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FacebookHomePage {
	
	WebDriver driver;
	
	@Given("^user visits facebook homepage$")
	public void user_visits_facebook_homepage() throws Throwable {
		
		//To Open Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe");
			    driver = new ChromeDriver();
		       driver.get("https://facebook.com"); //To Open Website URL

	}

	@Then("^user should be able to see the facebook newsfeed\\.$")
	public void user_should_be_able_to_see_the_facebook_newsfeed() throws Throwable {

	}

}
