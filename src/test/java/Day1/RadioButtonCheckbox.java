package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCheckbox {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		   driver.findElement(By.id("my-check-1")).click();
		   
		 //RadioButton
		   
		   driver.findElement(By.id("my-radio-2")).click();
		   
		 
	}

}
