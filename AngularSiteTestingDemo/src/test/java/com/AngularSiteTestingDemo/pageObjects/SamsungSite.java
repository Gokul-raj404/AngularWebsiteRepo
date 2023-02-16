package com.AngularSiteTestingDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.AngularSiteTestingDemo.testCases.BaseClass;

public class SamsungSite extends BaseClass{
	
	//WebDriver ldriver;
	//String accHolderName;
	
	public SamsungSite(WebDriver rdriver)
	{
		driver= rdriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath= "//a[@title='ACCEPT']" )
	WebElement cookies;
	
	@FindBy(xpath= "//a[contains(@class,'btn mobile-only loginBtn')]//*[@class='icon']" )
	WebElement accIcon;
	
	@FindBy(xpath= "//*[contains(@class,'nv00-gnb__utility-user-menu-link loginBtn')]" )
	WebElement dropDown;
	
	
	@FindBy(id= "b2c_input" )
	WebElement Emailid;
	
	
	@FindBy(id= "iptLgnPlnID" )
	WebElement Emailid2;
	
	
	@FindBy(id= "iptLgnPlnPD" )
	WebElement PassWord;
	
	
	@FindBy(id= "b2cSignIn" )
	WebElement btnSignIn;
	
	
	
	@FindBy(id= "signInButton" )
	WebElement next;
	
	@FindBy(id= "btnNotNow" )
	WebElement notnowBtn;
	
	@FindBy(xpath= "//button[@class='nv00-gnb__utility-btn gnb__search-btn-js']" )
	WebElement searchIcon;
	
	
	@FindBy(xpath= "//input[@id='gnb-search-keyword']" )
	WebElement searchInput;
	
	
	@FindBy(xpath= "//a[@title='Search by search term 10.5 kg washer dryer combo with ai control & smartthings connectivity, wd10t704dbx']" )
	WebElement dropDownElement;
	
	
	@FindBy(xpath= "//a[@class='result-cta__link js-buy-now']" )
	WebElement buyNow;
	
	
	@FindBy(xpath= "//div[@class='pd-buying-tool__info']//a[@aria-label='add wishlist']" )
	WebElement wishListIcon;
	
	
	@FindBy(xpath= "//a[normalize-space()='Add to Wishlist']" )
	WebElement wishListAlert;
	
	//
	@FindBy(linkText= "CONTINUE SHOPPING" )
	WebElement continueShopping;
	
	
	@FindBy(xpath= "//a[@class='nv00-gnb__utility-btn mobile-only js-account']" )
	WebElement accountIcon;
	
	
	@FindBy(xpath= "//a[@class='nv00-gnb__utility-user-menu-link'][normalize-space()='Wishlist']" )
	WebElement wishList;
	
	
	@FindBy(xpath= "//a[@title='Add To Basket 10.5 kg Washer Dryer Combo with AI Control & SmartThings Connectivity, WD10T704DBX (Inox)']" )
	WebElement addToCartbtn;
	
	@FindBy(xpath= "//button[@class='p6-s-c-p-q-t data-omni-addtocart']" )
	WebElement buyOneMore;
	
	
	@FindBy(xpath= "//button[@class='btn-close']" )
	WebElement buyOneMoreAlert;
	
	//methods
	
	public void cookies() {
		cookies.click();
	}
	
	public void clickAccIcon() throws InterruptedException 
	{
		Thread.sleep(5000);
		accIcon.click();
		Thread.sleep(5000);
		dropDown.click();
		Thread.sleep(5000);
		
		
	}
	
	public void enterEmailid(String emailid) throws InterruptedException
	{
		Emailid.sendKeys(emailid);
		Thread.sleep(5000);
		btnSignIn.click();
		Thread.sleep(10000);
	}
	
	
	public void enterEmailid2(String emailid2) throws InterruptedException
	{
		Emailid2.sendKeys(emailid2);
		Thread.sleep(5000);
		next.click();
		Thread.sleep(5000);
	}
	
	public void enterpassWord(String passWord) throws InterruptedException
	{
		
		PassWord.sendKeys(passWord);
		Thread.sleep(5000);
		next.click();
		Thread.sleep(5000);
		
	}
	
	public void clickNotNow() throws InterruptedException 
	{
		notnowBtn.click();
		Thread.sleep(20000);
	}
	
	public void searchIcon() 
	{
		searchIcon.click();
	}
	

	public void searchInput(String searchItem) throws InterruptedException 
	{
		searchInput.sendKeys(searchItem);
		Thread.sleep(5000);
		
	}
	
	
	public void dropDownElement() throws InterruptedException
	{
		dropDownElement.click();
		Thread.sleep(5000);
	}
	
	public void buyNow() throws InterruptedException 
	{
		//buyNow.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(buyNow).click().build().perform();
		Thread.sleep(5000);
	}
	
	public void wishList() throws InterruptedException 
	{
		wishListIcon.click();
		Thread.sleep(5000);
	}

	public void wishListAlert() throws InterruptedException
	{
		wishListAlert.click();
		Thread.sleep(5000);
	}
	
	public void continueShopping() throws InterruptedException 
	{
		continueShopping.click();
		Thread.sleep(5000);
	}
	
	public void accountIcon() throws InterruptedException
	{
		accountIcon.click();
		Thread.sleep(5000);
	}
	
	public void wishListTab() throws InterruptedException 
	{
		wishList.click();
		Thread.sleep(5000);
	}
	
	/*
	 * public void addToCart() throws InterruptedException {
	 * dropDownElement.click(); Thread.sleep(5000); }
	 */
	
	public void addToCartbtn() throws InterruptedException
	{
		addToCartbtn.click();
		Thread.sleep(5000);
	}

	public void buyOneMore() throws InterruptedException 
	{
		buyOneMore.click();
		Thread.sleep(5000);
	}
	
	public void buyOneMoreAlert() throws InterruptedException 
	{
		buyOneMoreAlert.click();
		Thread.sleep(5000);
	}
}
	


	
