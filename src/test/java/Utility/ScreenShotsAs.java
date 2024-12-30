package Utility;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotsAs {

	public static void main(String[] args) throws InterruptedException, IOException {
		 
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc, new File("C:\\Users\\ADMIN\\Desktop\\SS\\SS.png"));
		
		boolean title = sc.canRead();
		System.out.println(title);
		
	//	driver.close();
		
		driver.get("https://www.goibibo.com/");
		WebElement BookFlight = driver.findElement(By.xpath("//span[text()='Flights']"));
		
		File sc1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Point Location = BookFlight.getLocation();
			int width = BookFlight.getSize().getWidth();
			int height = BookFlight.getSize().getHeight();
			
			BufferedImage img = ImageIO.read(sc1);
			BufferedImage dest = img.getSubimage(Location.getX(), Location.getY(), width, height);
			
			ImageIO.write(dest, "png", sc1);
		
		FileHandler.copy(sc1, new File("C:\\Users\\ADMIN\\Desktop\\SS\\SS2.png"));
		
		
		
		
	}

}
