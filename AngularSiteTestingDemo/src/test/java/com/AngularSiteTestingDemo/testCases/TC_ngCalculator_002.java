package com.AngularSiteTestingDemo.testCases;

import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AngularSiteTestingDemo.pageObjects.ngCalculator;

public class TC_ngCalculator_002 extends BaseClass {
	
	ngCalculator ng= new ngCalculator(driver);
	
	
	@BeforeTest
	public void logsetUp() {
		//String testName = "ForbesAutomation";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		String timestamp = dateFormat.format(new Date());
		//System.setProperty("test-name", testName);
		System.setProperty("timestamp", timestamp);
	}
	
	@Test
	public void ngCalculator() throws InterruptedException , SocketException
	{
		driver.get(ngSiteURL);
		logger.info("ng Site Launched");
		Thread.sleep(3000);
		ng.enterInput1(input1);
		Thread.sleep(3000);
		ng.enterInput2(input2);
		Thread.sleep(3000);
		ng.click();
		Thread.sleep(5000);
	}
	
	
}
