package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement SouthKorea = driver.findElement(By.id("box105"));
		
		Thread.sleep(3000);
		
		
		Actions act= new Actions(driver);
		act.dragAndDrop(Seoul,SouthKorea ).build().perform();
		
		
	}

}
