package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	protected WebDriver driver;
	
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		driver.get("https://www.entrata.com/b");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
