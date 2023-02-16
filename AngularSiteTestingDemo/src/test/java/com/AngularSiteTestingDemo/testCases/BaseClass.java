package com.AngularSiteTestingDemo.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.AngularSiteTestingDemo.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig readconfig= new ReadConfig();
	
	public String baseURL= readconfig.getApplicationURL();
	public String emailID= readconfig.getEmailID();
	public String password= readconfig.getPassword();
	public String input1= readconfig.input1();
	public String input2= readconfig.input2();
	public String ngSiteURL= readconfig.ngSiteURL();
	
	public static WebDriver driver;
	
	
	static String projectLocation = System.getProperty("user.dir");
	static String configFilename = projectLocation+"/log4j.properties";
	public static final Logger logger = Logger.getLogger(BaseClass.class.getName());
	
	
	
	@BeforeClass
	public void setup() 
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		PropertyConfigurator.configure(configFilename);
	}
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	public static void getScreenshot() throws IOException 
	{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File trg= new File(".\\Screenshots\\TC001.png");
	FileUtils.copyFile(src, trg);
	}
}