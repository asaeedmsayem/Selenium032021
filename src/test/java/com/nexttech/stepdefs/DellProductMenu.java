package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.DellProductMenuPOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellProductMenu {
	
	WebDriver driver;
	
	@Given("^user visit Dell website$")
	public void user_visit_Dell_website() throws Throwable {
		//Using Try/Catch block in case there is any run time error occurs. 
				try {
					System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe"); //To open GoogleChrome browser
					driver = new ChromeDriver(); //Getting all ChromeDriver methods inside driver.
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Implicit wait is a soft wait to fix synchronizing issue.
					driver.manage().window().maximize(); //To maximize the window
					driver.get("https://www.dell.com/en-us"); //To open URL
				} catch (Exception e) {
					e.printStackTrace(); //It helps to trace the exception as I said at the beginning.
				}
	}

	@When("^user mouse hover on product menu$")
	public void user_mouse_hover_on_product_menu() throws Throwable {
		Actions Hover =new Actions (driver); // Using Actions method of Selenium as an Actions Object
		DellProductMenuPOM  myMenu =new DellProductMenuPOM (driver); // Creating an object so that I can use POM methods here 
		Hover.moveToElement(myMenu.ProductMenu()).build().perform(); // Using Actions Object to use mouse hover action on a web element.
		Thread.sleep(3000); // Hard wait 3 seconds
	}

	@And("^user mouse hover on laptop and click on for home submenu$")
	public void user_mouse_hover_on_laptop_and_click_on_for_home_submenu() throws Throwable {
		Actions Hover =new Actions (driver); // Using Actions method of Selenium as an Actions Object
		DellProductMenuPOM  myMenu =new DellProductMenuPOM (driver); // Creating an object so that I can use POM methods here
		Hover.moveToElement(myMenu.LaptopSub()).build().perform(); // Using Actions Object to use mouse hover action on a web element.
		Thread.sleep(3000); // Hard wait 3 seconds
		myMenu.ForHome().click(); // Click on the menu option
		Thread.sleep(3000); // Hard wait 3 seconds
	}

	@And("^user go back to homepage$")
	public void user_go_back_to_homepage() throws Throwable {
		driver.get("https://www.dell.com/en-us"); // Visiting homepage again 
	    
	}

	@And("^user hover mouse on the product menu$")
	public void user_hover_mouse_on_the_product_menu() throws Throwable {
		Actions Hover =new Actions (driver); // Using Actions method of Selenium as an Actions Object
		DellProductMenuPOM  myMenu =new DellProductMenuPOM (driver); // Creating an object so that I can use POM methods here
		Hover.moveToElement(myMenu.ProductMenu()).build().perform(); // Using Actions Object to use mouse hover action on a web element.
	}

	@Then("^user click on workstations$")
	public void user_click_on_workstations() throws Throwable {
		DellProductMenuPOM  myMenu =new DellProductMenuPOM (driver); // Creating an object so that I can use POM methods here
		myMenu.DellWordstations().click(); // Click on the menu option
	}

	@And("^user should redirect to workstations page$")
	public void user_should_redirect_to_workstations_page() throws Throwable {
		Thread.sleep(6000); // Hard wait 6 seconds
		driver.close(); //Close the driver connection
		driver.quit(); //Close the browser
	}

}
