package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonHPage {
	
	WebDriver driver;
	
	@Given("^User Visit Amazon HomePage$")
	public void user_Visit_Amazon_HomePage() throws Throwable {
		//To open chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe");
			    driver = new ChromeDriver();
		       driver.get("https://amazon.com"); //To open url
		
	}

	@Then("^User should see Amazon HomePage$")
	public void user_should_see_Amazon_HomePage() throws Throwable {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}

}
