package com.Utils;



import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer {
	
static AppiumDriverLocalService service;

	//start appium server method
	public static void startAppium() {
		try {
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	  service=AppiumDriverLocalService.buildDefaultService();
      service.start();
	}
	
//stop appium server method
	public static void closeAppium() {
    	service.stop();
    }

}
