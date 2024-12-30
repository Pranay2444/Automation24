package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
		@Test
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("my-text-id")).sendKeys("Hii Pranay");
		 
		 
		 
	}

}
