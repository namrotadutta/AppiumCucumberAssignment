package com.Runner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Utils.AppiumServer;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= "src/test/java/com/Feature",
		glue= {"com.stepDefinitions","HooksFile"},
		tags= {"@test1,@test2,@test3,@test4,@test5"},
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/html/ExtentReport.html"},
		monochrome=true,
		dryRun = false 
		)

@Test
public class Runner extends AbstractTestNGCucumberTests {
	//called appium server for start
	@BeforeSuite
	public void setup() {
		AppiumServer.startAppium();
	}
	
	//called apium server for close
	@AfterSuite
	public void tearDown() {
		AppiumServer.closeAppium();
	}

	//for extent report
	@AfterClass
	public static void SETUP()
	{
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	}
}
