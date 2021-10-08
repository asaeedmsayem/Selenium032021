package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.AmazonSearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonSearch {
	WebDriver driver;
	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		//To open chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe");
			    driver = new ChromeDriver();
		       driver.get("https://amazon.com"); //To open url
	}

	@Given("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
		AmazonSearchPOM  AS= new AmazonSearchPOM (driver);
		AS.Search().sendKeys(arg1);
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		AmazonSearchPOM  AS= new AmazonSearchPOM (driver);
		AS.searchbutton().click();
	}

}
