package com.metlife.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.metlife.generics.FWUtils;
import com.metlife.generics.IAutoConstant;

public class LoginPage extends FWUtils {
	
	

	@FindBy(xpath="//*[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//*[text()='Sign in']")
	private WebElement signin;
	
	@FindBy(xpath="//*[text()='Invalid username / password!']")
	private WebElement loginerrormsg;
	
	
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void setusername(String un)
	{
		username.sendKeys(un);
	}
	
	public void setpassword(String psw)
	{
		password.sendKeys(psw);
	}
	
	public void signinbtn()
	{
     signin.click();
	}
	
	public String showloginerrormsg()
	{
		return loginerrormsg.getText(); 
	}
	
	
	
	
}
