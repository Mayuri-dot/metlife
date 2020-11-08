package com.metlife.scripts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.metlife.generics.BaseClass;
import com.metlife.generics.FWUtils;
import com.metlife.pages.HomePage;
import com.metlife.pages.LoginPage;

public class TestHomePage extends BaseClass {
	
		
	@Test
	public void Tc_05()
	{
	HomePage homepage = new HomePage(driver);
	
	Assert.assertEquals(homepage.HomepageTitlemsg(),FWUtils.getExcelData("Test Case",22,6));
	}
	
	@Test
	public void Tc_06()
	{
		LoginPage lp = new LoginPage(driver);
		lp.setusername(FWUtils.getExcelData("Test Case", 2, 5));
		lp.setpassword(FWUtils.getExcelData("Test Case", 3, 5));
		lp.signinbtn();

		HomePage homepage = new HomePage(driver);
	    homepage.selectcoursedropdown();
	}
	
	
	

}
