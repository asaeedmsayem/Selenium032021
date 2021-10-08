package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.OrangeBlogCategoryPOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeBlogCategory {

	WebDriver driver;

	@Given("^user go to OrangeHRM website$")
	public void user_go_to_OrangeHRM_website() throws Throwable {
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

	@When("^click on blog and user redirect to blog page$")
	public void click_on_blog_and_user_redirect_to_blog_page() throws Throwable {
		OrangeBlogCategoryPOM Blog = new OrangeBlogCategoryPOM (driver);
		Blog.Blog().click();
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.

	}

	@And("^select updates from the category dropdown$")
	public void select_updates_from_the_category_dropdown() throws Throwable {
		OrangeBlogCategoryPOM Blog = new OrangeBlogCategoryPOM (driver);
		Select Cat = new Select(Blog.Category());
		Cat.selectByVisibleText("Updates");
		WebDriverWait wait = new WebDriverWait(driver,20); // Explicit wait is a soft wait to fix synchronizing issue.
	}

	@Then("^user will see updated blogs$")
	public void user_will_see_updated_blogs() throws Throwable {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
