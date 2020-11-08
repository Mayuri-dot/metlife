package com.metlife.scripts;

import org.testng.annotations.Test;

import com.metlife.generics.BaseClass;
import com.metlife.generics.FWUtils;
import com.metlife.pages.LoginPage;

public class ValidLogin extends BaseClass {

	@Test
	public void Tc_01() {

		String un = FWUtils.getExcelData("Test Case", 2, 5);
		String psw = FWUtils.getExcelData("Test Case", 3, 5);

		LoginPage lp = new LoginPage(driver);
		lp.setusername(un);
		lp.setpassword(psw);
		lp.signinbtn();

	}
}