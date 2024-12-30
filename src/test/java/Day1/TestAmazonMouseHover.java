package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAmazonMouseHover {
	
	ChromeDriver driver;
	@BeforeTest
	void Open_WebPage() throws InterruptedException 
	{
		driver= new ChromeDriver();
		driver.get("http://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@Test
	void Mouse_Hover()
	{
		Actions Act= new Actions(driver);
		WebElement id=driver.findElement(By.id("nav-link-accountList"));
		Act.moveToElement(id).perform();;
	}
}
