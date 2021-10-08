package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.OrangeHRMMenuPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMMenu {
	
	WebDriver driver;
	
	@Given("^user visits OrangeHRM Homepage first$")
	public void user_visits_OrangeHRM_Homepage_first() throws Throwable {
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

	@When("^mouse hover on platform menu and click on Compare Packages$")
	public void mouse_hover_on_platform_menu_and_click_on_Compare_Packages() throws Throwable {
		Actions hover = new Actions (driver);
		OrangeHRMMenuPOM Elements = new OrangeHRMMenuPOM (driver);
		hover.moveToElement(Elements.Platform()).build().perform();
		Elements.Compare().click();
	}

	@Then("^user should see Compare Packages page$")
	public void user_should_see_Compare_Packages_page() throws Throwable {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
