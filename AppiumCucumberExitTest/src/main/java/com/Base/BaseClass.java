package com.Base;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {
	
public static AppiumDriver<MobileElement>driver;

	//initialize driver
	public BaseClass( AppiumDriver<MobileElement>driver) {
		BaseClass.driver=driver;
	}
	

	
}
