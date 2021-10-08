package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {

	WebDriver driver;
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
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

	@When("^user go to Solutions dropdown menu and able to see View All Solutions$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
		Actions act =new Actions (driver);
		DellActionPOM  obj =new DellActionPOM (driver);
		act.moveToElement(obj.Solutions()).build().perform();
		obj.AllSolutions().click();

		//heard wait
		Thread.sleep(5000);
	}

	@Then("^user redirects to solution portfolio$")
	public void user_redirects_to_solution_portfolio() throws Throwable {
		//how to close the window
		driver.close();
		driver.quit();
	}

}
