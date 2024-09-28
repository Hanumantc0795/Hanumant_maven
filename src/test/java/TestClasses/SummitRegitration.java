package TestClasses;

import java.time.Duration;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.BillPayPage;
import pom.Products_BillPay;
import pom.ScheduleDemoPage;
import pom.SummitRegisterNow;

public class SummitRegitration extends BaseClass{
	
	//This test case is for navigate to Summit page and validate title 
	
	Products_BillPay billPay;
	BillPayPage scheduleDemo;
	ScheduleDemoPage formPage;
	SummitRegisterNow summit;
	
	@BeforeClass
	public void applicationLaunch()
	{
		launchBrowser();                      // Calling method from BaseClass
		billPay=new Products_BillPay(driver); // Creating object of POM Class
		scheduleDemo=new BillPayPage(driver); // Creating object of POM Class
		formPage=new ScheduleDemoPage(driver);
		summit=new SummitRegisterNow(driver);
		billPay.closeCookies();               // Close the cookies pop up
		
	}
	
	@BeforeMethod
	public void clickOnSummitOption()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		summit.clickONSummit();  
	
	}
	@Test
	public void clickOnAgendaOption()
	{
		Set<String> allWindowIds = driver.getWindowHandles(); // window handling
		for(String id: allWindowIds)
		{
			driver.switchTo().window(id);
			String windowTitle = driver.getTitle();
			System.out.println(windowTitle);
		if(windowTitle.equals("Entrata Summit 2024 | The Best Week in Multifamily Sept 23-26"))
		{
			summit.clickOnAgendaBtn();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String actTitle = summit.getAgendaPageTitle();
			Assert.assertEquals(actTitle, "AGENDA","Title not matching");
			break;
		}
		}
		
		
		
	}
	
	@AfterClass
	public void closingBrowser()
	{
		closeBrowser();
	}
	

}
