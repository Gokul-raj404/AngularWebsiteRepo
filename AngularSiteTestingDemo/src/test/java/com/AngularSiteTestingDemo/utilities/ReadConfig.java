package com.AngularSiteTestingDemo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src= new File("./Configuration/config.properties");
		
		try 
		{
			FileInputStream fis= new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Exception occured is: "+ e.getMessage());
		}
	}
	
	
	public String getApplicationURL() 
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getEmailID() 
	{
		String emailID=pro.getProperty("emailID");
		return emailID;
	}
	
	public String getPassword() 
	{
		String Password=pro.getProperty("password");
		return Password;
	}
	
	public String input1() 
	{
		String input1=pro.getProperty("input1");
		return input1;
	}
	
	public String input2() 
	{
		String input2=pro.getProperty("input2");
		return input2;
	}
	
	public String ngSiteURL() 
	{
		String url2=pro.getProperty("ngSiteURL");
		return url2;
	}

}
