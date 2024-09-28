package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummitRegisterNow {
	@FindBy(xpath="(//a[text()='Summit'])") private WebElement SummitTabName;
	@FindBy(xpath="//div[@class='summit-navigation']//a[4]") private WebElement agendaOption;
	@FindBy(xpath="(//h2[@class='css-87ndg2'])[2]")private WebElement agendaPageTitle;
	
	public SummitRegisterNow(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickONSummit()
	{
		SummitTabName.click();
	}
	public void clickOnAgendaBtn()
	{
		
		agendaOption.click();
	}
	public String getAgendaPageTitle()
	{
		String pageTitle = agendaPageTitle.getText();
		return pageTitle;
	}
}
