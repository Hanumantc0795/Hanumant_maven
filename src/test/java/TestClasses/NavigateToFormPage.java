package TestClasses;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.BillPayPage;
import pom.Products_BillPay;
import pom.ScheduleDemoPage;

public class NavigateToFormPage extends BaseClass {
	
	// This test case is for navigate to schedule demo form page and validate the header
	
	Products_BillPay billPay;
	BillPayPage scheduleDemo;
	ScheduleDemoPage formPage;
	
	@BeforeClass
	public void applicationLaunch()
	{
		launchBrowser();                      // Calling method from BaseClass
		billPay=new Products_BillPay(driver); // Creating object of POM Class
		scheduleDemo=new BillPayPage(driver); // Creating object of POM Class
		formPage=new ScheduleDemoPage(driver);
		billPay.closeCookies();               // Close the cookies pop up
		
	}
	
	@BeforeMethod
	public void mouseOver()
	{
		billPay.mouseOver(driver);            // mouse over on Products tab, it will display all options
	}
	
	@Test()
	public void scheduleBillPayDemo()
	{
		billPay.openBillPayForm();            // Click on Bill Pay option
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		scheduleDemo.clickOnScheduleDemo(driver);  // Click on Schedule demo button
	
	    String actText = formPage.headerTitle();
	    Assert.assertEquals(actText,"Property Management the Way It Should Be", "Header title not matching");
	}
	
	
	@AfterClass
	public void closingBrowser()
	{
		closeBrowser();
	}
	
	

}
