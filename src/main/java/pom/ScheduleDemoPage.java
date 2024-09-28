package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ScheduleDemoPage {
	
	@FindBy(xpath="//div[@id='alkghq']//h1") private WebElement headerName;
	@FindBy(id="FirstName") private WebElement firstName;
	@FindBy(id="LastName") private WebElement lastName;
	@FindBy(id="Email")private WebElement email;
	@FindBy(id="Company") private WebElement companyName;
	@FindBy(id="Phone") private WebElement phoneNumber;
	@FindBy(id="Unit_Count__c")private WebElement unitCount;
	@FindBy(id="Title") private WebElement jobTitle;
	@FindBy(id="demoRequest")private WebElement role;
	
	Select s;
	public ScheduleDemoPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String headerTitle()
	{
		String headerText = headerName.getText();
		return headerText;
	}
	
	public void enterFirstName()
	{
		firstName.sendKeys("Hanumant");
	}
	public void enterLastName()
	{
		lastName.sendKeys("XYZ");
	}
	public void enterEmail()
	{
		email.sendKeys("XYZ@gmail.com");
	}
	public void enterCompanyName()
	{
		companyName.sendKeys("Entrata");
	}
	public void enterPhoneNumber()
	{
		phoneNumber.sendKeys("(9561XXXXXX");
	}
	public void selectUnitConunt()
	{
	    s=new Select(unitCount);
		s.selectByIndex(1);
	}
	public void enterJobTitle()
	{
		jobTitle.sendKeys("Software Test Engineer");
	}
	public void selectRole()
	{
		s=new Select(role);
		s.selectByVisibleText("a Resident");
	}
}
