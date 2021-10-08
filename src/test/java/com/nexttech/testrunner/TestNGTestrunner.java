package com.nexttech.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestrunner {
	@CucumberOptions (
			features = {"Features"},
			glue = {"com.nexttech.stepdefs"}//,
			//tags = {"@Amazonquit", "@Amazonsearch"}
			)
	public class TestRunner extends AbstractTestNGCucumberTests{

	}
}
