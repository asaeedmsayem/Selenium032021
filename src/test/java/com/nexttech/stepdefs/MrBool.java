package com.nexttech.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MrBool {
	@BeforeTest
	public void open_app() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 // WebDriver driver =new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		}
	@Test
	public void run_test() {
		WebDriver driver = new ChromeDriver();
		Actions act=new Actions(driver); // creating object 
		act.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")).click();
	}
	@AfterTest
	public void end_case() throws Throwable {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}

}
