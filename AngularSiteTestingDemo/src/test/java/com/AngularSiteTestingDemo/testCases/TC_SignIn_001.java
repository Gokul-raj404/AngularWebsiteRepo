package com.AngularSiteTestingDemo.testCases;
import java.io.IOException;
import java.net.SocketException;

import org.testng.Assert;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.AngularSiteTestingDemo.pageObjects.LoginPage;


public class TC_SignIn_001 extends BaseClass {
	
	
	/*
	 * @BeforeTest public void logsetUp() { String testName = "ForbesSignIn";
	 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
	 * String timestamp = dateFormat.format(new Date());
	 * System.setProperty("test-name", testName); System.setProperty("timestamp",
	 * timestamp); }
	 */
	
	 ;
	
	
	@Test
	public void signInTest() throws IOException, SocketException
	{
		//Assert softAssert = new Assert();
		String actualAccHolder;
		LoginPage lp = new LoginPage(driver);
		try {
			driver.get(baseURL);
			logger.info("Launched URL");
			Thread.sleep(3000);
			lp.clickSignIn();
			Thread.sleep(3000);
			logger.info("Clicked on sign-in");
			lp.switchToSignInFrame();
			logger.info("Switched to IFrame");
			lp.enterEmail(emailID);
			logger.info("Entered email ID");
			Thread.sleep(3000);
			lp.enterPassword(password);
			logger.info("Entered Password");
			Thread.sleep(3000);
			lp.checkBox();
			logger.info("Unchecked the check box");
			Thread.sleep(3000);
			lp.clickSignInFrame();
			Thread.sleep(3000);
			logger.info("Clicked on sign-in button");
			lp.accountSignedIn();
			Thread.sleep(5000);
			logger.info("Mouse hovered on account icon");
			actualAccHolder= lp.accHolderDetails();
			Thread.sleep(5000);
			getScreenshot();
			Assert.assertEquals(actualAccHolder, "Hello, Gokul");
			logger.info("Fetched account holders name");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}
	
	
	
	
	

}
