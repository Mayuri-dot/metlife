package com.metlife.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.metlife.generics.BaseClass;
import com.metlife.generics.FWUtils;
import com.metlife.pages.LoginPage;

public class TestInvalidLogin extends BaseClass {


	@Test
	public void TC_02() throws InterruptedException {
		

		LoginPage lp = new LoginPage(driver);
		lp.setusername(FWUtils.getExcelData("Test Case", 8, 5));
		lp.setpassword(FWUtils.getExcelData("Test Case", 9, 5));
		lp.signinbtn();

		Assert.assertEquals(lp.showloginerrormsg(), FWUtils.getExpectedData("Test Case", 10, 6));
		

	}


	@Test
	public void TC_04() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setusername(FWUtils.getExcelData("Test Case", 19, 5));
		lp.setpassword(FWUtils.getExcelData("Test Case", 20, 5));
		lp.signinbtn();
		Assert.assertEquals(lp.showloginerrormsg(), FWUtils.getExpectedData("Test Case", 21, 6));

	}

}
