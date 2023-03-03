package com.AngularSiteTestingDemo.stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.AngularSiteTestingDemo.pageObjects.LoginPage;
import com.AngularSiteTestingDemo.pageObjects.SamsungSite;
import com.AngularSiteTestingDemo.testCases.BaseClass;
import cucumber.TestListener;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionImpl extends TestListener {
	
	public static WebDriver driver;
	LoginPage lp;
	SamsungSite ss;
	static String projectLocation = System.getProperty("user.dir");
	static String configFilename = projectLocation+"/log4j.properties";
	public static final Logger logger = Logger.getLogger(BaseClass.class.getName());
	
	
	@Given("I am launching the browser")
	public void I_am_launching_the_browser() {
		
		WebDriverManager.chromedriver().setup();
		
		
		PropertyConfigurator.configure(configFilename);
	}
	
	
	@Given("^user is on the Forbes login page (.+)$")
	public void user_is_on_the_Forbes_login_page(String baseURL) {
		driver= new ChromeDriver();
		lp = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(baseURL);
		logger.info("URL Launched");
		//extentTest.pass("URL Launched");
	}
	
	
	@When ("^user enters emailID (.+) and password (.+)$")
	public void user_enters_emailID_and_password(String emailID, String password) throws InterruptedException {
		lp.clickSignIn();
		Thread.sleep(3000);
		logger.info("clicked on sign-in button");
		//extentTest.pass("clicked on sign-in button");
		lp.switchToSignInFrame();
		logger.info("Switched to IFrame");
		//extentTest.pass("Switched to IFrame");
		lp.enterEmail(emailID);
		logger.info("Entered email ID");
		//extentTest.pass("Entered email ID");
		Thread.sleep(3000);
		lp.enterPassword(password);
		logger.info("Entered Password");
		//extentTest.pass("Entered Password");
		Thread.sleep(3000);
		lp.checkBox();
		logger.info("Unchecked the check box");
		//extentTest.pass("Unchecked the check box");
		Thread.sleep(3000);
		lp.clickSignInFrame();
		Thread.sleep(3000);
		logger.info("Clicked on sign-in button");
		//extentTest.pass("Clicked on sign-in button");
		lp.accountSignedIn();
		Thread.sleep(5000);
		logger.info("Mouse hovered on account icon");
		//extentTest.pass("Mouse hovered on account icon");
		
	}
	
	
	@Then ("^I verify the account holders name (.+)$")
	public void I_verify_the_account_holders_name(String accHolder) throws InterruptedException {
		String actualAccHolder= lp.accHolderDetails();
		Thread.sleep(5000);
		if(accHolder.equals(actualAccHolder)) {
			logger.info("Sucessful login");
		}else {
			logger.info("Invalid login");
		}
		Assert.assertEquals(actualAccHolder, accHolder);
		
		//logger.info("Fetched account holders name");
		//extentTest.pass("Fetched account holders name");
		//driver.quit();
	}
	
	
	@After(order=1) 
	public static void quitDriver() throws Exception {
		driver.quit();
	}
	
	  @After(order = 2) 
	  public void takeScreenShotOnFailedScenario(Scenario scenario) throws IOException 
	  {
	   
	  if ((scenario.isFailed())) 
	  { 
		  System.out.println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails");
		  byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		  File localscreenshot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  System.out.println(scenario.getName());
		  String filename = scenario.getName()+"_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".png";
		  scenario.attach(screenshot, "image/png", filename);
		  FileUtils.copyFile(localscreenshot, new File("C:\\Users\\GokulRajIbrahimpatna\\git\\repository\\AngularSiteTestingDemo\\Screenshots\\"+filename));
	  } 
	  
	  }
	 

	
	@Given("^user is on the samsung login page (.+)$")
	public void user_is_on_the_samsung_login_page(String baseURL) {
		driver= new ChromeDriver();
		ss = new SamsungSite(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(baseURL);
		logger.info("Samsung URL Launched");
		//extentTest.pass("URL Launched");
	}
	
	
	@When ("^user enters SamsungSite emailID (.+) and password (.+)$")
	public void user_enters_SamsungSite_emailID_and_password(String emailID, String password) throws InterruptedException {
			Thread.sleep(3000);
			//ss.cookies();
			//Thread.sleep(3000);
			ss.clickAccIcon();
			ss.enterEmailid(emailID);
			Thread.sleep(10000);
			ss.enterEmailid2(emailID);
			Thread.sleep(10000);
			ss.enterEmailid2(emailID);
			ss.enterpassWord(password);
			ss.clickNotNow();
			ss.searchIcon();
			ss.searchInput("washing machine");
			ss.dropDownElement();
			ss.buyNow();
			System.out.println("Buynow");
			ss.wishList();
			ss.wishListAlert();
			ss.continueShopping();
			ss.accountIcon();
			ss.wishListTab();
			//ss.addToCart();
			ss.addToCartbtn();
			ss.buyOneMore();
			ss.buyOneMoreAlert();
			
	}
	
	
}
