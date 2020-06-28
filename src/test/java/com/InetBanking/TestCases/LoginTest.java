package com.InetBanking.TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.InetBanking.PageObjects.LoginPage;

public class LoginTest extends BaseTest{
	
	

	@Test
	public void loginTest()
	{
		
		LoginPage lpage=new LoginPage(driver);
		logger.info("URL is opened");
		lpage.setUserName(username);
		logger.info("Entered the username");
		lpage.setPassword(password);
		logger.info("Entered the password");
		lpage.clickSubmit();
		logger.info("Submit Login");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
	}

}

