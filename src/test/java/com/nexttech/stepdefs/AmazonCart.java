package com.nexttech.stepdefs;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Date;  

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.AmazonCartPOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonCart {

	/*
	 * In this program I've used a new method called "printStackTrace()".
	 * This method helps the programmer to understand where the actual problem occurred.
	 * It helps to trace the exception. 
	 * It is a method of Throwable class inherited by every exception class.
	 * This method prints the same message of e object and also the line number where the exception occurred.
	 */

	WebDriver driver; //Declaring Selenium WebDriver Global veritable.

	@Given("^visit amazon homepage$")
	public void visit_amazon_homepage() throws Throwable {
		//Using Try/Catch block in case there is any run time error occurs. 
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe"); //To open GoogleChrome browser
			driver = new ChromeDriver(); //Getting all ChromeDriver methods inside driver.
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Implicit wait is a soft wait to fix synchronizing issue.
			driver.manage().window().maximize(); //To maximize the window
			driver.get("https://amazon.com"); //To open URL
		} catch (Exception e) {
			e.printStackTrace(); //It helps to trace the exception as I said at the beginning.
		}
	}


	@And("^click on the account$")
	public void click_on_the_account() throws Throwable {
		AmazonCartPOM AC = new AmazonCartPOM(driver); // Getting Login Page
		AC.AmazonLogin().click();

	}

	@When("^type your \"([^\"]*)\"$")
	public void type_your(String arg1) throws Throwable {
		AmazonCartPOM ACemail = new AmazonCartPOM(driver); // Typing email and continue with login
		ACemail.AmazonEmail().sendKeys(arg1);

	}

	@And("^click on the continue$")
	public void click_on_the_continue() throws Throwable {
		AmazonCartPOM ACContinue = new AmazonCartPOM(driver); // Continue with login 
		ACContinue.AmazonContinue().click();

	}

	@And("^type the \"([^\"]*)\"$")
	public void type_the(String arg1) throws Throwable {
		AmazonCartPOM ACPass = new AmazonCartPOM(driver); // Typing password 
		ACPass.AmazonPass().sendKeys(arg1);

	}

	@And("^click on the sign-in button$")
	public void click_on_the_sign_in_button() throws Throwable { 
		AmazonCartPOM ACLogin = new AmazonCartPOM(driver); // Click to login/sign in
		ACLogin.AmazonSignIn().click();

	}

	@When("^successfully logged in$")
	public void successfully_logged_in() throws Throwable {
		// Used this try/catch block just to print login successful report with date and time in the console. Also it delays
		// the automation for a while so that I can check every steps are okay.
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss"); //Getting Date & Time Format.   
			Date date = new Date();  // Current Getting Date in a object variable.
			System.out.println("Amazon Login Validation Successfully Completed on " + formatter.format(date)); //Printing Date & Time 
			Thread.sleep(3000); //Delaying automation for 3 seconds.
		} catch (Exception e) {
			e.printStackTrace(); // Exception will show exact error line and message.
		}

	}

	@And("^navigated to searchbox$")
	public void navigated_to_searchbox() throws Throwable {
		AmazonCartPOM ACSearch = new AmazonCartPOM(driver); // Locating Search Box
		ACSearch.AmazonSearchBox().click();


	}

	@And("^type a \"([^\"]*)\"$")
	public void type_a(String arg1) throws Throwable {
		AmazonCartPOM ACSearch = new AmazonCartPOM(driver); // Typing in the search box
		ACSearch.AmazonSearchBox().sendKeys(arg1);

	}

	@And("^click on the search button$")
	public void click_on_the_search_button() throws Throwable {
		AmazonCartPOM ACSearch = new AmazonCartPOM(driver); // Clicking on the search button
		ACSearch.AmazonClickSearch().click();

	}

	@When("^select product and click$")
	public void select_product_and_click() throws Throwable {
		AmazonCartPOM AProduct = new AmazonCartPOM(driver); // click on a product name to open that product page.
		AProduct.AmazonProduct().click();

	}

	@And("^click to select an option$")
	public void click_to_select_an_option() throws Throwable {
		AmazonCartPOM AProduct = new AmazonCartPOM(driver); // Selecting a Product Option
		AProduct.AmazonProductCat().click();
		WebDriverWait wait = new WebDriverWait(driver,30); // Explicit wait is a soft wait to fix synchronizing issue.

	}

	@And("^click on the add to cart button$")
	public void click_on_the_add_to_cart_button() throws Throwable {
		
			AmazonCartPOM AProduct = new AmazonCartPOM(driver);		// Clicking on the 'Add to Cart' button
			AProduct.AmazonAddtoCart().click();
			WebDriverWait wait = new WebDriverWait(driver,30); // Explicit wait is a soft wait to fix synchronizing issue.
		
	}

	@And("^click on the no thanks button$")
	public void click_on_the_no_thanks_button() throws Throwable {
		// Used this try/catch block just to print login successful report with date and time in the console. Also it delays
		// the automation for a while so that I can check every steps are okay.
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss"); //Getting Date & Time Format.   
			Date date = new Date();  // Current Getting Date in a object variable.
			System.out.println("Product has been successfully added into the cart " + formatter.format(date)); //Printing Date & Time 
			Thread.sleep(3000); //Delaying automation for 3 seconds.
		} catch (Exception e) {
			e.printStackTrace(); // Exception will show exact error line and message.
		}

	}

	@And("^click on the cart button$")
	public void click_on_the_cart_button() throws Throwable {
		AmazonCartPOM AProduct = new AmazonCartPOM(driver);
		AProduct.AmazonCart().click();

	}

	@Then("^validate amazon cart successfully$")
	public void validate_amazon_cart_successfully() throws Throwable {
		// Used this try/catch block just to print login successful report with date and time in the console. Also it delays
				// the automation for a while so that I can check every steps are okay.
				try {
					SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss"); //Getting Date & Time Format.   
					Date date = new Date();  // Current Getting Date in a object variable.
					System.out.println("Total Automation has been ended and Validation Completed on " + formatter.format(date)); //Printing Date & Time 
					Thread.sleep(3000); //Delaying automation for 3 seconds.
				} catch (Exception e) {
					e.printStackTrace(); // Exception will show exact error line and message.
				}

	}

}
