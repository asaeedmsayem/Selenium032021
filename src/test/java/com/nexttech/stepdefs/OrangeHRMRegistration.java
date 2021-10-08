package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.OrangeHRMRegistrationPOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMRegistration {
	
	WebDriver driver;
	
	@Given("^user visits OrangeHRM website$")
	public void user_visits_OrangeHRM_website() throws Throwable {
		//Using Try/Catch block in case there is any run time error occurs. 
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe"); //To open GoogleChrome browser
			driver = new ChromeDriver(); //Getting all ChromeDriver methods inside driver.
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Implicit wait is a soft wait to fix synchronizing issue.
			driver.manage().window().maximize(); //To maximize the window
			driver.get("https://orangehrm.com/"); //To open URL
		} catch (Exception e) {
			e.printStackTrace(); //It helps to trace the exception as I said at the beginning.
		}
	}

	@And("^type \"([^\"]*)\" into the box$")
	public void type_into_the_box(String arg1) throws Throwable {
		OrangeHRMRegistrationPOM POMElement = new OrangeHRMRegistrationPOM (driver);
		POMElement.HomeEmail().sendKeys(arg1);
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^click on the try OrangeHRM for Free button$")
	public void click_on_the_try_OrangeHRM_for_Free_button() throws Throwable {
		OrangeHRMRegistrationPOM POMElement = new OrangeHRMRegistrationPOM (driver);
		POMElement.HomeTrial().click();
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@When("^user will redirect to registration page and type a \"([^\"]*)\"$")
	public void user_will_redirect_to_registration_page_and_type_a(String arg1) throws Throwable {
		OrangeHRMRegistrationPOM POMElement = new OrangeHRMRegistrationPOM (driver);
		POMElement.Username().sendKeys(arg1);
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^user should also type \"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\"$")
	public void user_should_also_type_and(String arg1, String arg2, String arg3) throws Throwable {
		OrangeHRMRegistrationPOM POMElement = new OrangeHRMRegistrationPOM (driver);
		POMElement.YName().sendKeys(arg1);
		POMElement.eMail().clear();
		POMElement.eMail().sendKeys(arg2);
		POMElement.myPhone().sendKeys(arg3);
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^select country$")
	public void select_country() throws Throwable {
		OrangeHRMRegistrationPOM POMElement = new OrangeHRMRegistrationPOM (driver);
		Select Country = new Select(POMElement.myCountry());
		Country.selectByVisibleText("United States");
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^click Populate the free trial with dummy data option$")
	public void click_Populate_the_free_trial_with_dummy_data_option() throws Throwable {
		OrangeHRMRegistrationPOM POMElement = new OrangeHRMRegistrationPOM (driver);
		POMElement.Dummy().click();
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@And("^user should pass the captcha$")
	public void user_should_pass_the_captcha() throws Throwable {
		OrangeHRMRegistrationPOM POMElement = new OrangeHRMRegistrationPOM (driver);
		POMElement.myCaptcha().click();
		Thread.sleep(10000);
	}

	@Then("^click on the submit button$")
	public void click_on_the_submit_button() throws Throwable {
		OrangeHRMRegistrationPOM POMElement = new OrangeHRMRegistrationPOM (driver);
		POMElement.Submit().click();
	}

	@And("^redirect to the thank you page$")
	public void redirect_to_the_thank_you_page() throws Throwable {
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}

}
