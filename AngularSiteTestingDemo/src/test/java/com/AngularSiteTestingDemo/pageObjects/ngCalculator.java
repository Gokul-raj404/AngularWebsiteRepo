package com.AngularSiteTestingDemo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.AngularSiteTestingDemo.testCases.BaseClass;
import com.paulhammant.ngwebdriver.ByAngular;

public class ngCalculator extends BaseClass {
		
	//WebDriver ldriver;
	
	public ngCalculator(WebDriver rdriver)
	{
		driver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//elements
		By input1 = ByAngular.model("first");
		By input2 = ByAngular.model("second");
		By button = ByAngular.buttonText("Go!");
		
		
	//methods
		public void enterInput1(String str1) {
			
			driver.findElement(input1).sendKeys(str1);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void enterInput2(String str2) {
			
			driver.findElement(input2).sendKeys(str2);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		public void click() {
			
			driver.findElement(button).click();
		}

}
