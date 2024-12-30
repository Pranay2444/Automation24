package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpScrollDown {

	public static void main(String[] args) throws InterruptedException {
		 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='search']"));
		searchbox.sendKeys("Illuminati song");
		searchbox.click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).doubleClick().build().perform();
		driver.findElement(By.id("thumbnail-container")).click();
		
		
	//	WebElement sbsearch = driver.findElement(By.xpath("//div[@style='width: 100%; height: 100%; display: block; fill: currentcolor;'][1]"));
		//sbsearch.click();
		
		//vertical & horizontal scrolling
		//driver.get("https://www.w3schools.com/java/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 400)");
	}

}
