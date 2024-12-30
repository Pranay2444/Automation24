package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.indeed.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	//	WebElement JobTitleEnter=driver.findElement(By.xpath("//input[@id='text-input-what']"));
	//	JobTitleEnter.sendKeys("Selenium Java Automation");
		
		//driver.findElement(By.xpath("//input[contains(@class,'css-p1lp5i e1jgz0i3')
		//driver.findElement(By.xpath("//button[contains(text(), 'Find jobs')]")).click();
		
		
		WebElement Upload_resume = driver.findElement(By.xpath("//a[contains(text(), 'Post your resume')]"));
		Upload_resume.click();
	/*	String Actual_Title = Upload_resume.getText();
		System.out.println(Actual_Title);
		
		if(Actual_Title.equals("Post your resume")) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case fail");
		}*/
		WebElement Sign_in= driver.findElement(By.xpath("//button[@id='login-google-button']"));
		Sign_in.click();
		 
		//WebElement Enter_Email=driver.findElement(By.xpath("//input[@type='email']"));
	//	Enter_Email.sendKeys("vighnepranay247@gmail.com");
		
		
	}

}
