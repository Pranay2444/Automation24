package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		Actions act= new Actions(driver);
		
		WebElement we= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		act.moveToElement(we).perform();
		
		

	}

}
