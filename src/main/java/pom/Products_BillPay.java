package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_BillPay {
	
	@FindBy(xpath="//div[text()='Products']") private WebElement product;
	@FindBy(xpath="//div[@class='footer-column'][3]//a[5]") private WebElement billPay;
	@FindBy(xpath="//div[text()='X']")private WebElement cookiesClose;
	
	public Products_BillPay(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void mouseOver(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(product).perform();
	}
	
	public void openBillPayForm()
	{
		billPay.click();
	}
	public void closeCookies()
	{
		cookiesClose.click();
	}

}
