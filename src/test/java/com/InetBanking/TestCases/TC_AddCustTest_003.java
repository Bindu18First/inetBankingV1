package com.InetBanking.TestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.InetBanking.PageObjects.AddNewCustomerPage;
import com.InetBanking.PageObjects.LoginPage;

public class TC_AddCustTest_003 extends BaseTest
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddNewCustomerPage addcust=new AddNewCustomerPage(driver);
		String homePage=driver.getWindowHandle();
		System.out.println(homePage);
		
		

		
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details....");
		
		
		addcust.addCustomerName("Pavan");
		addcust.custGender("male");
		addcust.custDOB("10","10","1985");
		Thread.sleep(5000);
		addcust.custaddress("INDIA");
		addcust.custcity("HYD");
		addcust.custstate("AP");
		addcust.custpinno("5000074");
		addcust.custtelephoneno("987890091");
		
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
			
	}
	
	
}



