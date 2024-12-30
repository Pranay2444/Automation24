package Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_URL {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		String base_URL = "https://www.facebook.com/";
		 
		driver.get(base_URL);
		Thread.sleep(5);
		driver.get("https://www.google.com/");
	
		driver.manage().window().maximize();
		driver.close();
		
	}

}
