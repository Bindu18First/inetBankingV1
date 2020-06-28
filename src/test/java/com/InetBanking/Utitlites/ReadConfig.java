package com.InetBanking.Utitlites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties prop;
	
	public ReadConfig()
	{
		File src=new File("D:\\Selenium_SDET\\inetBanking_V1\\Configuration\\config.properties");
		 prop=new Properties();
		try
		{
			FileInputStream fc=new FileInputStream(src);
			prop.load(fc);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getApplicationURL()
	{
		return prop.getProperty("baseURL");
	}
	public String getUserID()
	{
		return prop.getProperty("username");
	}
	public String getPassword()
	{
		return prop.getProperty("password");
	}
	public String getChromePath()
	{
		return prop.getProperty("chromepath");
	}
	public String getFireFoxPath()
	{
		return prop.getProperty("firefoxpath");
	}
	public String getIEPath()
	{
		return prop.getProperty("iepath");
	}
	
}
	

	


