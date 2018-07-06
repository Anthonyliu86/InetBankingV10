package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("user name entered");
		lp.setPassword(password);
		logger.info("password enter opened");
		lp.clickSubmit();
		logger.info("clicked on submit");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			logger.info("login test passed");
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"loginTest");
			logger.info("login test failed");
			Assert.assertTrue(false);
			
		}
	}
	
	
	
}
