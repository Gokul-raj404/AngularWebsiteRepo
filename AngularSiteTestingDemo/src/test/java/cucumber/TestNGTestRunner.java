package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.messages.internal.com.google.protobuf.GeneratedMessageV3;


@CucumberOptions(
		tags= ("@Samsung"),
		plugin= { "pretty", 
				"json:target/cucumber-reports/cucumber.json",
				"html:target/cucumber-reports/cucumberreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		glue= {"com.AngularSiteTestingDemo.stepDefinitions"},
		features= {"C:\\Users\\GokulRajIbrahimpatna\\eclipse-workspace\\AngularSiteTestingDemo\\src\\test\\java\\cucumber\\ForbesAutomation_TC_SignIn_001.feature"}
		
 )
//@Listeners({TestListener.class})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
		
}