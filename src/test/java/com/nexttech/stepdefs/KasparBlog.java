package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.KasparBlogPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class KasparBlog {
	
	WebDriver driver;
	
	@Given("^User will visit Kaspar Moon Blog$")
	public void user_will_visit_Kaspar_Moon_Blog() throws Throwable {
		//To open Chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kasparmoon.us/"); //To open URL
		driver.manage().window().maximize(); // To maximize current window
		Thread.sleep(1000); //Delay 1 seconds to view the maximized window
		
	}

	@Then("^Open an Article$")
	public void open_an_Article() throws Throwable {
		KasparBlogPOM Kaspar = new KasparBlogPOM(driver);
		Kaspar.AboutKaspar().click();
		Thread.sleep(5000); //Delay 5 seconds before closing the browser
		driver.quit(); // To close the browser
		
	}

}
