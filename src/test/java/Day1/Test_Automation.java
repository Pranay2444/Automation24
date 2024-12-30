package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.All_Links;

public class Test_Automation implements All_Links {
	ExtentReports extentReports;
	ExtentTest extentTest;
	
	WebDriver driver;
	@BeforeTest
	void Open_Browser() {
		extentReports = new ExtentReports( report_path +"First.html");
		extentTest = extentReports.startTest("Test Application");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@Test
	void Home_Page() {
		WebElement we=driver.findElement(By.xpath(front_xpath));
			String text=we.getText();
			System.out.println(text);
		
			if(text.equals(text)) {
				extentTest.log(LogStatus.PASS, "Test case passed: Home page is visible succesful");
				//System.out.println("Home page is visible succesful");
			}else {
				extentTest.log(LogStatus.FAIL, "Test case fail: Home page is not visible succesful");
			//	System.out.println("Home page is not visible succesful");
			}
			extentReports.endTest(extentTest);
			extentReports.flush();
	}
	

}
