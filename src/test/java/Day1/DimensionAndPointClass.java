package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionAndPointClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		 
		Dimension dim_obj = new Dimension(300, 600);
		driver.manage().window().setSize(dim_obj);
		
		Point p = new Point(300,300);	
		driver.manage().window().setPosition(p);
		
		Dimension sz= driver.manage().window().getSize();
		System.out.println(sz.getHeight());
		System.out.println(sz.getWidth());
		
		WebElement searchbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		int width = searchbox.getRect().getWidth();
		int height = searchbox.getRect().getHeight();
		
		System.out.println("width of searchbox= "+ width);
		System.out.println("Height of searchbox= "+ height);
		
		
		
		
	}

}
