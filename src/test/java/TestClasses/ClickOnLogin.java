package TestClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.BillPayPage;
import pom.Products_BillPay;
import pom.ScheduleDemoPage;
import pom.SummitRegisterNow;

public class ClickOnLogin extends BaseClass {


	//Click on SignIn123
	//QA

	Products_BillPay billPay;
	SummitRegisterNow summit;
	
	@BeforeClass
	public void applicationLaunch()
	{
		launchBrowser();                      // Calling method from BaseClass
		billPay=new Products_BillPay(driver); // Creating object of POM Class
		summit=new SummitRegisterNow(driver);
		billPay.closeCookies();               // Close the cookies pop up
		
	}
	@Test
	public void signIn()
	{
		summit.clickOnSingIn();
	}
	
	@AfterClass
	void close()
	{
		closeBrowser();
	}
	
	//test5

}
