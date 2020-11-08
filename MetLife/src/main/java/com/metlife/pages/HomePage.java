package com.metlife.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.metlife.generics.BaseClass;
import com.metlife.generics.FWUtils;

public class HomePage extends FWUtils {
	
	@FindBy(id="searchType")
	private WebElement selectcourse;
	
	public
	 HomePage(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
	}

	public static WebDriver driver;
	
	public String HomepageTitlemsg()
	{
		String data=driver.getTitle();
		return data;    
	}

   public void selectcoursedropdown()
   {
	   Select s1 = new Select(selectcourse);
	   s1.selectByValue("resources");

   }
	
	
}
