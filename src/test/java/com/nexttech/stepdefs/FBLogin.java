package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.FBLoginPOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBLogin {

	/*
	 * In this program I've used a new method called "printStackTrace()".
	 * This method helps the programmer to understand where the actual problem occurred.
	 * It helps to trace the exception. 
	 * It is a method of Throwable class inherited by every exception class.
	 * This method prints the same message of e object and also the line number where the exception occurred.
	 */

	WebDriver driver; //Declaring Selenium WebDriver Global veritable.

	@Given("^user should visit facebook landing page$")
	public void user_should_visit_facebook_landing_page() throws Throwable {
		//Using Try/Catch block in case there is any run time error occurs. 
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe"); //To open GoogleChrome browser
			driver = new ChromeDriver(); //Getting all ChromeDriver methods inside driver.
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Implicit wait is a soft wait to fix synchronizing issue.
			driver.manage().window().maximize(); //To maximize the window
			driver.get("https://facebook.com"); //To open URL
		} catch (Exception e) {
			e.printStackTrace(); //It helps to trace the exception as I said at the beginning.
		}
	}

	@When("^user type the \"([^\"]*)\"$")
	public void user_type_the(String arg1) throws Throwable {
		FBLoginPOM FB = new FBLoginPOM(driver); // Created an Object to get methods from  PageObjectModel Class
		FB.FBUserName().sendKeys(arg1); //Typing our Sample Data into the input box by using method and sendkeys' value (argument).
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.

	}

	@And("^user should type the \"([^\"]*)\"$")
	public void user_should_type_the(String arg1) throws Throwable {
		FBLoginPOM FB = new FBLoginPOM(driver); // Created an Object to get methods from  PageObjectModel Class
		FB.FBPassword().sendKeys(arg1); //Typing our Sample Data into the input box by using method and sendkeys' value (argument).
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.

	}

	@Then("^user should click login button$")
	public void user_should_click_login_button() throws Throwable {
		FBLoginPOM FB = new FBLoginPOM(driver); // Created an Object to get methods from  PageObjectModel Class
		FB.LoginButton().click(); //Click on the 'Login' button by using methods.
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.

	}

	@And("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		Thread.sleep(10000); //It's a hard wait code.
		System.out.println(driver.getTitle()); // To print Webpage's Title in the console.
		driver.close(); // To close the Internet connectivity 
		driver.quit(); // To close the browser
	}

}
