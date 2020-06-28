package com.InetBanking.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewCustomerPage {
	
	WebDriver driver;
	public AddNewCustomerPage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement txtcustomerName;
	
	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement rbgender;
	
	
	@FindBy(id="dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement txtaddr;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement txttelephoneno;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement txtemailid;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(xpath="//*[@id=\"Video-iFrame-SekindoSPlayer5ef5e6b7510de\"]")
	WebElement ifrm;
	
	@FindBy(id="lightBoxCloseBtn")
	WebElement closeBtn;
	
	public void closeAdv()
	{
		
		
		
	}
	
	public void clickAddNewCustomer()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", lnkAddNewCustomer);
		
		
	}
	
	public void addCustomerName(String name) {
		txtcustomerName.sendKeys(name);
	}
	
	public void custGender(String rgender) {
		rbgender.click();
	}
	
	public void custDOB(String dd, String mm, String yy)
	{
		txtdob.sendKeys(dd);
		txtdob.sendKeys(mm);
		txtdob.sendKeys(yy);
	}
	public void custaddress(String caddress) {
		txtaddr.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() {
		btnSubmit.click();
	}

}
