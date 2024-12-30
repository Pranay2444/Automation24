package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement DropDownField = driver.findElement(By.id("drop1"));
		
		Select select= new Select (DropDownField);
		
		
	//	select.selectByIndex(1);
	//	Thread.sleep(5000);
		
		select.selectByVisibleText("doc3");
		

	}

}
