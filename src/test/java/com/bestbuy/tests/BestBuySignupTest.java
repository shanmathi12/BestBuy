package com.bestbuy.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.bestbuy.utils.BestWrappers;
import com.bestbuy.utils.SelWrappers;
import com.bestbuy.utils.Reports;

public class BestBuySignupTest extends SelWrappers {
	SelWrappers se=new SelWrappers();
	BestWrappers bw=new BestWrappers();
	
	@Test
	public void signUpPage()
	{
		try
		{
			Reports.setTCDesc("Validating the Browser Launch");
			bw.launchBrowser();
			Reports.setTCDesc("Validating SignUp functionality with valid credentials");
		   bw.brokenLinkBestbuy();
			bw.bestSignUp("shanmathi","saravanan","sahansarav12@test.com","five+two=7","five+two=7","","shansarav12@test.com","five+two=7");
			screenshot("signup_valid");
		}
		catch(Exception ex)
		{
			Reports.reportStep("FAIL", "SignUp failed");
			ex.printStackTrace();
		}	
	}
	@AfterMethod
	public void closeBrowsers()
	{
		closeAllBrowsers();
	}
	

}