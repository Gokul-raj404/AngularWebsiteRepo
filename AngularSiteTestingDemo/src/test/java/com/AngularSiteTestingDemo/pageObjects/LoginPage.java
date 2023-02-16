package com.AngularSiteTestingDemo.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.AngularSiteTestingDemo.testCases.BaseClass;

public class LoginPage  extends BaseClass{
	
	//WebDriver ldriver;
	String accHolderName;
	
	public LoginPage(WebDriver rdriver)
	{
		driver= rdriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(className= "login" )
	WebElement signInbtn;
	
	@FindBy(id= "email" )
	WebElement email;
	
	@FindBy(xpath= "//*[contains(@id,'piano-id-')]" )
	 WebElement signInFrame;
	
	@FindBy(id= "password" )
	WebElement password;
	
	/*@FindBy(xpath= '''//span[contains(text(),'Keep me logged in')]''');
	WebElement checkBox;*/
	
	@FindBy(className= "login-modal__login-button" )
	WebElement signInbtnFrame;
	
	@FindBy(xpath= "//span[@class='login-icon justify-with-search']" )
	 WebElement accountIcon;
	
	
	@FindBy(className= "greeting-text" )
	WebElement accHolder;
	
	@FindBy(xpath= "//span[contains(text(),'Keep me logged in')]" )
	 WebElement checkBox;
	
	
	
	
	public void clickSignIn() 
	{		
		signInbtn.click();
	}
	
	public void enterEmail(String emailInput) 
	{
		email.sendKeys(emailInput);
	}
	
	public void switchToSignInFrame() 
	{
		driver.switchTo().frame(signInFrame);
		System.out.println(driver.getTitle());	
		
	}
	
	public void enterPassword(String passwordInput) 
	{
		password.sendKeys(passwordInput);
	}
	
	public void checkBox() 
	{
		checkBox.click();
	}
	
	public void clickSignInFrame() 
	{		
		signInbtnFrame.click();
	}
	
	public void accountSignedIn()
	{
		accountIcon.click();
	}
	
	public String accHolderDetails() 
	{
		accHolderName= accHolder.getText();
		return accHolderName;
	}
	
	
}
