package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.BestSellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BestSeller {
	
	WebDriver driver;
	
	@Given("^user visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
		//To open chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe");
			    driver = new ChromeDriver();
		       driver.get("https://amazon.com"); //To open url
	}

	@When("^user clicks on Bestseller Option$")
	public void user_clicks_on_Bestseller_Option() throws Throwable {
		BestSellerPOM AmazonBestSell = new BestSellerPOM(driver);
		AmazonBestSell.bestseller().click();
	}

	@Then("^user should be able to redirect the Bestseller Page$")
	public void user_should_be_able_to_redirect_the_Bestseller_Page() throws Throwable {
		
	}
	

}
