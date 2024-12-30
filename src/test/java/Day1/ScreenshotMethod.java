package Day1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotMethod {

	public static void main(String[] args) throws InterruptedException, IOException {
		 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/java/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		 
		File f =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\ADMIN\\Desktop\\SS.png"));
		
	}

}
