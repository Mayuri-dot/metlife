package com.metlife.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract public class BaseClass implements IAutoConstant {
	static
	{
	System.setProperty(CHROME_KEY,CHROME_VALUE);
	System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void openBrowser()
	{
		String SBrowser=CHROME;
				
		if(SBrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(SBrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(SBrowser.equals("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
//	@AfterMethod
//	public static void closeBrowser()
//	{
//		driver.close();
//	}
//	
	

}
