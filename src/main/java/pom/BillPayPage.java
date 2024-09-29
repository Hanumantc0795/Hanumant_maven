package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillPayPage {
	
	@FindBy(xpath="(//div[text()='Schedule Demo'])[1]")private WebElement scheduleDemo;
	
	
	public BillPayPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnScheduleDemo(WebDriver driver)
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(scheduleDemo));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;    //due to ElementClickIntercepted exception> used Javascript click method
		js.executeScript("arguments[0].click();", scheduleDemo);

		
	}
	

}
