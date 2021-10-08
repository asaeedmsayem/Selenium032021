package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class KMPage {
	
	WebDriver driver;
	
	@Given("^user visits KasparMoon homepage$")
	public void user_visits_KasparMoon_homepage() throws Throwable {
		//To open Chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe");
			    driver = new ChromeDriver();
		       driver.get("https://kasparmoon.us"); //To open URL
	}

	@Then("^user should be able to see the KasparMoon homepage\\.$")
	public void user_should_be_able_to_see_the_KasparMoon_homepage() throws Throwable {
		
	}
	

}
