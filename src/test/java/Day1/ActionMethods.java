package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethods {
	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement BlogMenu = driver.findElement(By.id("blogsmenu"));
		
		act.moveToElement(BlogMenu).perform();
		
		WebElement web2 = driver.findElement(By.xpath("//a/span[text()='SeleniumByArun']"));
		act.moveToElement(web2).click().build().perform();
		
}
}
