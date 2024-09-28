package TestClasses;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.BillPayPage;
import pom.Products_BillPay;
import pom.ScheduleDemoPage;

public class FillScheduleDemoForm extends BaseClass {
	// This test case is for navigate to schedule demo form page and fill the form details
	
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
		public void fillBillPayForm()
		{
			billPay.openBillPayForm();            // Click on Bill Pay option
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			scheduleDemo.clickOnScheduleDemo(driver);  // Click on Schedule demo button
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			formPage.enterFirstName();
			formPage.enterLastName();
			formPage.enterEmail();
			formPage.enterCompanyName();
			formPage.enterPhoneNumber();
			formPage.selectUnitConunt();
			formPage.enterJobTitle();
			formPage.selectRole();
		}
		@AfterClass
		public void closingBrowser()
		{
			closeBrowser();
		}

}
