package Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleofPage {

	public static void main(String[] args) {
		 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String curl=driver.getCurrentUrl();
		System.out.println("curl= "+ curl);
		
		//to get page source-->HTML code
		String pagesource=driver.getPageSource();
		System.out.println("pagesource = "+ pagesource);
		
	}

}
