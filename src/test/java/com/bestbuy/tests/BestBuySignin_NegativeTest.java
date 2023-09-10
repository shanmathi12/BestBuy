package com.bestbuy.tests;

import org.testng.annotations.Test;
import com.bestbuy.utils.BestWrappers;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.SelWrappers;

public class BestBuySignin_NegativeTest extends SelWrappers {
	SelWrappers se=new SelWrappers();
	BestWrappers bw=new BestWrappers();
	
	@Test
	
	public void signIn_invalidCredentials() throws InterruptedException
	{
		try
		{
		Reports.setTCDesc("Sign in with invalid Credentials");
		bw.launchBrowser();
		//bw.brokenLinkBestbuy();
		se.chooseCountry();
		bw.negativeTc_signIn("shanmathii123456@gmaill.com","Shanmathi@123");
		screenshot("SignIn Invalid");
		Reports.setTCDesc("Sign in with valid username and empty field Password");
		//bw.negativeTc_signIn1("shansarav12@test.com","");
		screenshot("Empty passwd");
		}
		catch(Exception ex)
		{
			
			ex.printStackTrace();
		}	
		finally
		{
			Thread.sleep(2000);
		 closeAllBrowsers();
		}
	}
}