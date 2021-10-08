package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.FBSignUpPOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBSignUp {

	WebDriver driver;
	
	@Given("^user visit facebook$")
	public void user_visit_facebook() throws Throwable {
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

	@Given("^click on create a new account$")
	public void click_on_create_a_new_account() throws Throwable {
		FBSignUpPOM createnew = new FBSignUpPOM (driver);
		createnew.CreateACButtom().click();
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@When("^user will type the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_will_type_the_and(String arg1, String arg2) throws Throwable {
		FBSignUpPOM createnew = new FBSignUpPOM (driver);
		createnew.Firstname().sendKeys(arg1); // To type first name
		createnew.Lastname().sendKeys(arg2); // To type last name
	}

	@When("^type \"([^\"]*)\" first$")
	public void type_first(String arg1) throws Throwable {
		FBSignUpPOM createnew = new FBSignUpPOM (driver);
		createnew.Email().sendKeys(arg1); // To type email
	}

	@When("^confirm \"([^\"]*)\" and \"([^\"]*)\"$")
	public void confirm_and(String arg1, String arg2) throws Throwable {
		FBSignUpPOM createnew = new FBSignUpPOM (driver);
		createnew.ConfirmEmail().sendKeys(arg1); // To type email
		createnew.Password().sendKeys(arg2); // To type password
	}

	@When("^user should select dob$")
	public void user_should_select_dob() throws Throwable {
		FBSignUpPOM SetDOB = new FBSignUpPOM (driver);
		Select DOB = new Select(SetDOB.Month());
		DOB.selectByIndex(6);
		Select DOB1 = new Select(SetDOB.Day());
		DOB1.selectByValue("22");
		Select DOB2 = new Select(SetDOB.Year());
		DOB2.selectByVisibleText("1981");
		WebDriverWait wait = new WebDriverWait(driver,30); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@When("^select gender$")
	public void select_gender() throws Throwable {
		FBSignUpPOM createnew = new FBSignUpPOM (driver);
		createnew.Sex().click();
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@Then("^user click on the signup button$")
	public void user_click_on_the_signup_button() throws Throwable {
		FBSignUpPOM createnew = new FBSignUpPOM (driver);
		createnew.Submit().click();
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@Then("^user should be able to create a new account$")
	public void user_should_be_able_to_create_a_new_account() throws Throwable {
		Thread.sleep(10000); //It's a hard wait code.
		System.out.println(driver.getTitle()); // To print Webpage's Title in the console.
		driver.close(); // To close the Internet connectivity 
		driver.quit(); // To close the browser
	}

}
