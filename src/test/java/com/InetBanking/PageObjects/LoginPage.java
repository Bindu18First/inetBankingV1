package com.InetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassWord;
	
	@FindBy(name="btnLogin")
	WebElement btnClick;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement btnLogout;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtPassWord.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnClick.click();
	}
	public void logout()
	{
		btnLogout.click();
	}
	

}
